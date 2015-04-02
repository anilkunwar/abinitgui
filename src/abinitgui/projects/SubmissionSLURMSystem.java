/*
 AbinitGUI - Created in July 2009
 
 Copyright (c) 2009-2015 Flavio Miguel ABREU ARAUJO (flavio.abreuaraujo@uclouvain.be)
                         Yannick GILLET (yannick.gillet@uclouvain.be)

 Université catholique de Louvain, Louvain-la-Neuve, Belgium
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
 notice, this list of conditions, and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright
 notice, this list of conditions, and the disclaimer that follows
 these conditions in the documentation and/or other materials
 provided with the distribution.

 3. The names of the author may not be used to endorse or promote
 products derived from this software without specific prior written
 permission.

 In addition, we request (but do not require) that you include in the
 end-user documentation provided with the redistribution and/or in the
 software itself an acknowledgement equivalent to the following:
 "This product includes software developed by the
 Abinit Project (http://www.abinit.org/)."

 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE JDOM AUTHORS OR THE PROJECT
 CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 SUCH DAMAGE.

 For more information on the Abinit Project, please see
 <http://www.abinit.org/>.

 For more information on the AbinitGUI Project, please see
 <http://gui.abinit.org/>.
 */
package abinitgui.projects;

import abinitgui.core.MainFrame;
import abinitgui.core.RetMSG;
import abinitgui.core.Utils;
import static abinitgui.projects.RemoteJob.CANCELLED;
import static abinitgui.projects.RemoteJob.COMPLETED;
import static abinitgui.projects.RemoteJob.FAILED;
import static abinitgui.projects.RemoteJob.PENDING;
import static abinitgui.projects.RemoteJob.READY;
import static abinitgui.projects.RemoteJob.RUNNING;
import static abinitgui.projects.RemoteJob.UNKNOWN;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Yannick
 */
public class SubmissionSLURMSystem extends SubmissionSystem 
{
    public SubmissionSLURMSystem()
    {
        
    }
    
    public SubmissionSLURMSystem(Machine machine)
    {
        this.machine = machine;
    }

    @Override
    public RemoteJob submit(SubmissionScript script, String rootPath, String simName) {
        if(!machine.isConnected())
            getMachine().connection();
        
        RemoteJob rj = new RemoteJob();
        rj.setScript(script);
        rj.setMachineName(machine.getName());
        
        boolean isLocalMachine = (getMachine().getType() == Machine.LOCAL_MACHINE);
        boolean isRemoteGatewayMachine = (getMachine().getType() == Machine.GATEWAY_MACHINE);
        boolean isRemoteAbinitMachine = (getMachine().getType() == Machine.REMOTE_MACHINE);
        
        String PBSfileName = rootPath + Utils.fileSeparator() + simName + ".SLURM.sh";
        script.writeToFile(PBSfileName);
       
        String slurmSHFile = rootPath + Utils.fileSeparator() + simName + ".SLURM.sh";
        String slurmSHFileR = rootPath + "/" + simName + ".SLURM.sh";
        if (isRemoteGatewayMachine
                || isRemoteAbinitMachine) {

            // Envoie du fichier SGE
            getMachine().putFile(slurmSHFile + " " + slurmSHFileR);

            if (Utils.osName().startsWith("Windows")) {
                getMachine().sendCommand("dos2unix " + slurmSHFileR);
            }
        }
        RetMSG msg = getMachine().sendCommand("sbatch " + slurmSHFileR);
        String retMsg = msg.getRetMSG();
        if(retMsg.startsWith("Submitted batch job"))
        {
            String jobIdS = retMsg.replace("Submitted batch job ", "").replaceAll("\n", "").replaceAll(" ","");
            int id = Integer.parseInt(jobIdS);
            rj.setJobId(id);
        }
        else
        {
            MainFrame.printERR("Error : "+retMsg);
        }
        
        return rj;
    }

    @Override
    public ArrayList<RemoteJob> getRemoteJobs() {
        ArrayList<RemoteJob> listJobs = new ArrayList<>();
        
        
        if(!machine.isConnected())
            machine.connection();
        
        if(!machine.isConnected())
        {
            MainFrame.printERR("Cannot connect to the machine !");
            return null;
        }
        
        String login = null;
        if(machine.getType() == Machine.REMOTE_MACHINE || machine.getType() == Machine.GATEWAY_MACHINE)
        {
            login = machine.getRemoteConnect().getLogin();
        }
        if(login == null)
        {
            MainFrame.printERR("Cannot get login for the machine !");
            return null;
        }
        RetMSG msg = machine.sendCommand("sacct --noheader -P -u "+login+" -o \"JobId,State\"",false);

        String retMsg = msg.getRetMSG();
        
        String[] lines = retMsg.split("\n");
        
        for(String lin : lines)
        {
            String[] tab = lin.split("\\|");
            if(tab.length != 2)
                continue;
            String idS = tab[0];
            String statS = tab[1];
            
            try{
                int id = Integer.parseInt(idS);
                RemoteJob rj = new RemoteJob();
                rj.setMachineName(machine.getName());
                rj.setJobId(id);
                rj.setStatusString(statS);
                listJobs.add(rj);
            } catch(NumberFormatException exc)
            {
                continue;
            }
        }
        
        return listJobs;

    }

    @Override
    public void updateStatus(RemoteJob rj) {
        System.out.println("updating Status !");
        int status = UNKNOWN;
        if(rj.getJobId() == -1) 
        {
            status = READY;
        } 
        
        if(!machine.isConnected())
            getMachine().connection();
        
        RetMSG msg = getMachine().sendCommand("sacct --noheader -P -j "+rj.getJobId()+" -o \"JobId,State\"",false);

        String retMsg = msg.getRetMSG();
        String[] lines = retMsg.split("\n");
        for(String lin : lines)
        {
            String[] tab = lin.split("\\|");
            String idS = tab[0];
            String statS = tab[1];
            
            try{
                int id = Integer.parseInt(idS);
                System.out.println("tab = "+idS+", "+statS);
                if(rj.getJobId() == id)
                {
                    rj.setStatusString(statS);
                }
            } catch(NumberFormatException exc)
            {
            }
        }
        
        if(rj.getStatus() == UNKNOWN)
        {
            String command = "scontrol show job "+rj.getJobId();
            msg = getMachine().sendCommand("scontrol show job "+rj.getJobId(),false);

            retMsg = msg.getRetMSG();
            Pattern state = Pattern.compile("JobState=([A-Z]+)");

            Matcher m = state.matcher(retMsg);
            while (m.find()) {
                String statusS = m.group().trim();
                rj.setStatusString(statusS);
            }
        }
        
        System.out.println("rj.status = "+rj.getStatusString());
    }

    @Override
    public String printInfos(RemoteJob rj) 
    {
        if(rj.getJobId() == -1) 
        {
            return "This job has not been submitted yet !";
        } 
        
        if(rj.getJobId() == 0)
        {
            return "Job ID is 0 !";
        }
        
        if(!machine.isConnected())
            getMachine().connection();
        
        updateStatus(rj);
        
        String command = "scontrol show job "+rj.getJobId();
        RetMSG msg = getMachine().sendCommand(command,false);
        
        if(msg.getRetCode() == 0)
        {
            return msg.getRetMSG();
        }
        else
        {
            command = "sacct -j "+rj.getJobId();
            msg = getMachine().sendCommand(command, false);
            
            if(msg.getRetCode() == 0)
            {
                return msg.getRetMSG();
            }
            else
            {
                return "The status of the job is : "+rj.getStatusString();
            }
        }
            
        
    }

    @Override
    public void kill(RemoteJob rj) {
        if(!machine.isConnected())
            getMachine().connection();
        
        getMachine().sendCommand("scancel "+rj.getJobId());
    }
    
}
