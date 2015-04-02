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

import javax.swing.JPanel;

public class CreateInputFile extends JPanel {

    /**
     * Creates new form CreateInputFile
     */
    public CreateInputFile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useCreIFRadioButton = new javax.swing.JRadioButton();
        openXMLFileLabel = new javax.swing.JLabel();
        openXMLFileDialogButton = new javax.swing.JButton();
        openXMLFileTextField = new javax.swing.JTextField();
        saveFileButton = new javax.swing.JButton();
        saveFileAsButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();

        useCreIFRadioButton.setForeground(java.awt.Color.blue);
        useCreIFRadioButton.setText("Use created input file");
        useCreIFRadioButton.setEnabled(false);
        useCreIFRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useCreIFRadioButtonActionPerformed(evt);
            }
        });

        openXMLFileLabel.setText("Open the ABINIT input file (usualy *.ab [XML file])");
        openXMLFileLabel.setEnabled(false);

        openXMLFileDialogButton.setText("...");
        openXMLFileDialogButton.setEnabled(false);
        openXMLFileDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openXMLFileDialogButtonActionPerformed(evt);
            }
        });

        openXMLFileTextField.setEnabled(false);

        saveFileButton.setText("Save");
        saveFileButton.setEnabled(false);
        saveFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileButtonActionPerformed(evt);
            }
        });

        saveFileAsButton.setText("Save As");
        saveFileAsButton.setEnabled(false);
        saveFileAsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileAsButtonActionPerformed(evt);
            }
        });

        createButton.setText("Generate file preview (test)");
        createButton.setEnabled(false);
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(openXMLFileDialogButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(openXMLFileTextField))
                        .addComponent(openXMLFileLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(useCreIFRadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(saveFileButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(saveFileAsButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createButton)))
                    .addGap(26, 26, 26)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(useCreIFRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(openXMLFileLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(openXMLFileDialogButton)
                        .addComponent(openXMLFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveFileButton)
                        .addComponent(saveFileAsButton)
                        .addComponent(createButton))
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void useCreIFRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useCreIFRadioButtonActionPerformed
        //mf.printERR("Not yet supported !");
        //        useCreIFRadioButton.setForeground(Color.red);
        //        useExtIFRadioButton.setForeground(Color.blue);
        //
        //        openXMLFileLabel.setEnabled(true);
        //        openXMLFileDialogButton.setEnabled(true);
        //        openXMLFileTextField.setEnabled(true);
        //        saveFileAsButton.setEnabled(true);
        //        saveFileButton.setEnabled(true);
        //        createButton.setEnabled(true);
        //        inputFileTabbedPane.setEnabled(true);
        //
        //        openFileLabel.setEnabled(false);
        //        openFileDialogButton.setEnabled(false);
        //        displayFileButton.setEnabled(false);
        //        geditButton.setEnabled(false);
        //        openFileTextField.setEnabled(false);
        //        pspLabel.setEnabled(false);
        //        pspTextField.setEnabled(false);
        //        pspTable.setEnabled(false);
        //        pspTable.setVisible(false);
        //
        //        inputFileTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_useCreIFRadioButtonActionPerformed

    private void openXMLFileDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openXMLFileDialogButtonActionPerformed
        //mf.printERR("Not yet implemented !");
        //        JFileChooser fc = new JFileChooser(mySimulationsTextField.getText());
        //        fc.setMultiSelectionEnabled(false);
        //        int retValue = fc.showOpenDialog(this);
        //        if (retValue == JFileChooser.APPROVE_OPTION) {
        //            File file = fc.getSelectedFile();
        //            openXMLFileTextField.setText(file.getPath());
        //        }
    }//GEN-LAST:event_openXMLFileDialogButtonActionPerformed

    private void saveFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileButtonActionPerformed
        //mf.printERR("Save file is not implemented yet!");
    }//GEN-LAST:event_saveFileButtonActionPerformed

    private void saveFileAsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileAsButtonActionPerformed
        //mf.printERR("Save file as is not implemented yet!");
    }//GEN-LAST:event_saveFileAsButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        //inputFileDisplayer.setVisible(true);
        //inputFileDisplayer.setText(getBasics()); // TODO
        // TODO
        //inputFileDisplayer.setText(geomD.getData() + alcoD.getData() + rereD.getData()
        //    + wadeD.getData() + inouD.getData() + theoD.getData() + otherTextArea.getText());
    }//GEN-LAST:event_createButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JButton openXMLFileDialogButton;
    private javax.swing.JLabel openXMLFileLabel;
    private javax.swing.JTextField openXMLFileTextField;
    private javax.swing.JButton saveFileAsButton;
    private javax.swing.JButton saveFileButton;
    private javax.swing.JRadioButton useCreIFRadioButton;
    // End of variables declaration//GEN-END:variables
}
