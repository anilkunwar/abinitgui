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
import abinitgui.core.MyTableModel;
import abinitgui.pseudos.pspAtomRenderer;
import abinitgui.pseudos.Atom;
import abinitgui.pseudos.AtomEditor;
import abinitgui.core.Utils;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import msgdisp.core.MessageDisplayer;
import abinitgui.parser.GUIEditor;
import abinitgui.pseudos.AtomEditorOnline;

public class AnaddbInputPanel extends SimulationPanel {

    private MessageDisplayer msgdispInputFile;
    private String curPath = "."; // to save current Path !

    public AnaddbInputPanel() {
        initComponents();
        
        msgdispInputFile = new MessageDisplayer(MainFrame.mainFrame, false, null);
        msgdispInputFile.setTitle("..:: Input file preview ::..");
    }
    
    @Override
    public void fillFromSimu(Simulation currentSimu)
    {
        if(currentSimu instanceof AnaddbSimulation)
        {
            AnaddbSimulation simu = (AnaddbSimulation)currentSimu;
            this.setInputFileName(simu.getInputFileName());
            this.setDDBFileName(simu.getDDBFileName());
        }
        else
        {
            throw new UnsupportedOperationException("Not able to tackle Simulation");
        }
    }
    
    @Override
    public void fillSimu(Simulation currentSimu)
    {
        if(currentSimu instanceof AnaddbSimulation)
        {
            AnaddbSimulation simu = (AnaddbSimulation)currentSimu;
            String fileName = getInputFileName();
            String ddbFileName = getDDBFileName();
            simu.setInputFileName(fileName);
            simu.setDDBFileName(ddbFileName);
        }
        else
        {
            throw new UnsupportedOperationException("Not able to tackle Simulation");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputFilePanel = new javax.swing.JPanel();
        openFileTextField = new javax.swing.JTextField();
        openFileDialogButton = new javax.swing.JButton();
        openFileLabel = new javax.swing.JLabel();
        displayFileButton = new javax.swing.JButton();
        geditButton = new javax.swing.JButton();
        openDDBLabel = new javax.swing.JLabel();
        openDDBFileButton = new javax.swing.JButton();
        openDDBFileTextField = new javax.swing.JTextField();

        inputFilePanel.setMaximumSize(new java.awt.Dimension(800, 600));
        inputFilePanel.setMinimumSize(new java.awt.Dimension(500, 200));

        openFileDialogButton.setText("...");
        openFileDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileDialogButtonActionPerformed(evt);
            }
        });

        openFileLabel.setText("Open the ANADDB input file (usualy *.in)");

        displayFileButton.setText("Display");
        displayFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayFileButtonActionPerformed(evt);
            }
        });

        geditButton.setText("Edit");
        geditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geditButtonActionPerformed(evt);
            }
        });

        openDDBLabel.setText("Open the DDB file");

        openDDBFileButton.setText("...");
        openDDBFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDDBFileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputFilePanelLayout = new javax.swing.GroupLayout(inputFilePanel);
        inputFilePanel.setLayout(inputFilePanelLayout);
        inputFilePanelLayout.setHorizontalGroup(
            inputFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputFilePanelLayout.createSequentialGroup()
                        .addComponent(openFileLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(geditButton)
                        .addGap(0, 221, Short.MAX_VALUE))
                    .addGroup(inputFilePanelLayout.createSequentialGroup()
                        .addComponent(openFileDialogButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openFileTextField))
                    .addGroup(inputFilePanelLayout.createSequentialGroup()
                        .addComponent(openDDBLabel)
                        .addGap(342, 342, 342))
                    .addGroup(inputFilePanelLayout.createSequentialGroup()
                        .addComponent(openDDBFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openDDBFileTextField)))
                .addContainerGap())
        );
        inputFilePanelLayout.setVerticalGroup(
            inputFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputFilePanelLayout.createSequentialGroup()
                .addGroup(inputFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openFileLabel)
                    .addComponent(displayFileButton)
                    .addComponent(geditButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openFileDialogButton)
                    .addComponent(openFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(openDDBLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openDDBFileButton)
                    .addComponent(openDDBFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputFilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void openFileDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileDialogButtonActionPerformed
        JFileChooser fc = new JFileChooser(curPath);
        File currDir = new File(".");
        String currPath = currDir.getAbsolutePath();
        String basePath = currPath.replace("\\", "/").replace(".", "");
            MainFrame.printDEB(basePath);
            fc.setMultiSelectionEnabled(false);
            int retValue = fc.showOpenDialog(this);
            if (retValue == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                curPath = file.getParent();
                MainFrame.printDEB("CurPath = " + curPath);
                String relPath = file.getAbsolutePath().replace("\\", "/").replace(basePath, "./");
                    openFileTextField.setText(relPath);
                }
    }//GEN-LAST:event_openFileDialogButtonActionPerformed

    private void displayFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayFileButtonActionPerformed
        //inputFileDisplayer.setEditable(true);

        String fileContent = "";

        try {
            /*File file = new File(openFileTextField.getText());
            Scanner scanner = new Scanner(file).useDelimiter("\\Z");
            fileContent = scanner.next();
            scanner.close();*/
            
            fileContent = Utils.fileToString(openFileTextField.getText());

        } catch (FileNotFoundException e) {
            MainFrame.printERR(e.getMessage());
        } catch (IOException e) {
            MainFrame.printERR(e.getMessage());
        }

        //inputFileDisplayer.setText(fileContent);
        msgdispInputFile.setText(fileContent);
        msgdispInputFile.show();
    }//GEN-LAST:event_displayFileButtonActionPerformed

    private void geditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geditButtonActionPerformed
        MainFrame.editFile(openFileTextField.getText(), true);
        // TODO
    }//GEN-LAST:event_geditButtonActionPerformed

    private void openDDBFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDDBFileButtonActionPerformed
        JFileChooser fc = new JFileChooser(".");
        File currDir = new File(".");
        String currPath = currDir.getAbsolutePath();
        String basePath = currPath.replace("\\", "/").replace(".", "");
            MainFrame.printDEB(basePath);
            fc.setMultiSelectionEnabled(false);

            int retValue = fc.showOpenDialog(this);
            if (retValue == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String relPath = file.getAbsolutePath().replace("\\", "/").replace(basePath, "./");
                    openDDBFileTextField.setText(relPath);
                }
    }//GEN-LAST:event_openDDBFileButtonActionPerformed
    
    public String getInputFileName()
    {
        return openFileTextField.getText();
    }
    
    public String getDDBFileName()
    {
        return openDDBFileTextField.getText();
    }
    
    
    private void setInputFileName(String inputFileName) {
        this.openFileTextField.setText(inputFileName);
    }
    
    private void setDDBFileName(String ddbFileName)  {
        this.openDDBFileTextField.setText(ddbFileName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayFileButton;
    private javax.swing.JButton geditButton;
    private javax.swing.JPanel inputFilePanel;
    private javax.swing.JButton openDDBFileButton;
    public javax.swing.JTextField openDDBFileTextField;
    private javax.swing.JLabel openDDBLabel;
    private javax.swing.JButton openFileDialogButton;
    private javax.swing.JLabel openFileLabel;
    private javax.swing.JTextField openFileTextField;
    // End of variables declaration//GEN-END:variables

}
