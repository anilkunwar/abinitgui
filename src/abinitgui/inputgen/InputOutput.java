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

package abinitgui.inputgen;

import abinitgui.core.MainFrame;
import java.awt.Color;

public class InputOutput extends javax.swing.JPanel {

    private MainFrame mainFrame;

    public InputOutput(MainFrame parent) {
        mainFrame = parent;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prtdenCheckBox = new javax.swing.JCheckBox();
        prtdenTextField = new javax.swing.JTextField();
        prtdosCheckBox = new javax.swing.JCheckBox();
        prtdosTextField = new javax.swing.JTextField();
        pawprtdenCheckBox = new javax.swing.JCheckBox();
        pawprtdosCheckBox = new javax.swing.JCheckBox();
        pawprtdenTextField = new javax.swing.JTextField();
        pawprtdosTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        prtxmlCheckBox = new javax.swing.JCheckBox();
        getddkCheckBox = new javax.swing.JCheckBox();
        getddkTextField = new javax.swing.JTextField();
        getdenTextField = new javax.swing.JTextField();
        getdenCheckBox = new javax.swing.JCheckBox();
        getkssCheckBox = new javax.swing.JCheckBox();
        getkssTextField = new javax.swing.JTextField();
        getoccTextField = new javax.swing.JTextField();
        getoccCheckBox = new javax.swing.JCheckBox();
        getqpsCheckBox = new javax.swing.JCheckBox();
        getqpsTextField = new javax.swing.JTextField();

        prtdenCheckBox.setForeground(java.awt.Color.blue);
        prtdenCheckBox.setText("prtden");
        prtdenCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prtdenCheckBoxActionPerformed(evt);
            }
        });

        prtdenTextField.setEnabled(false);

        prtdosCheckBox.setForeground(java.awt.Color.blue);
        prtdosCheckBox.setText("prtdos");
        prtdosCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prtdosCheckBoxActionPerformed(evt);
            }
        });

        prtdosTextField.setEnabled(false);

        pawprtdenCheckBox.setForeground(java.awt.Color.blue);
        pawprtdenCheckBox.setText("pawprtden");
        pawprtdenCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pawprtdenCheckBoxActionPerformed(evt);
            }
        });

        pawprtdosCheckBox.setForeground(java.awt.Color.blue);
        pawprtdosCheckBox.setText("pawprtdos");
        pawprtdosCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pawprtdosCheckBoxActionPerformed(evt);
            }
        });

        pawprtdenTextField.setEnabled(false);

        pawprtdosTextField.setEnabled(false);

        prtxmlCheckBox.setForeground(java.awt.Color.blue);
        prtxmlCheckBox.setText("prtxml");
        prtxmlCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prtxmlCheckBoxActionPerformed(evt);
            }
        });

        getddkCheckBox.setForeground(java.awt.Color.blue);
        getddkCheckBox.setText("getddk");
        getddkCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getddkCheckBoxActionPerformed(evt);
            }
        });

        getddkTextField.setEnabled(false);

        getdenTextField.setEnabled(false);

        getdenCheckBox.setForeground(java.awt.Color.blue);
        getdenCheckBox.setText("getden");
        getdenCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getdenCheckBoxActionPerformed(evt);
            }
        });

        getkssCheckBox.setForeground(java.awt.Color.blue);
        getkssCheckBox.setText("getkss");
        getkssCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getkssCheckBoxActionPerformed(evt);
            }
        });

        getkssTextField.setEnabled(false);

        getoccTextField.setEnabled(false);

        getoccCheckBox.setForeground(java.awt.Color.blue);
        getoccCheckBox.setText("getocc");
        getoccCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getoccCheckBoxActionPerformed(evt);
            }
        });

        getqpsCheckBox.setForeground(java.awt.Color.blue);
        getqpsCheckBox.setText("getqps");
        getqpsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getqpsCheckBoxActionPerformed(evt);
            }
        });

        getqpsTextField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prtdenCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(prtdenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prtdosCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(prtdosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pawprtdenCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(pawprtdenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pawprtdosCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(pawprtdosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prtxmlCheckBox))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getddkCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(getddkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getdenCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(getdenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getkssCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(getkssTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getoccCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(getoccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getqpsCheckBox)
                        .addGap(6, 6, 6)
                        .addComponent(getqpsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prtdenCheckBox)
                            .addComponent(prtdenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prtdosCheckBox)
                            .addComponent(prtdosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pawprtdenCheckBox)
                            .addComponent(pawprtdenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pawprtdosCheckBox)
                            .addComponent(pawprtdosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prtxmlCheckBox))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getddkCheckBox)
                            .addComponent(getddkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getdenCheckBox)
                            .addComponent(getdenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getkssCheckBox)
                            .addComponent(getkssTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getoccCheckBox)
                            .addComponent(getoccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getqpsCheckBox)
                            .addComponent(getqpsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prtdenCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prtdenCheckBoxActionPerformed
        if (prtdenCheckBox.isSelected()) {
            prtdenCheckBox.setForeground(Color.red);
            prtdenTextField.setEnabled(true);
        } else {
            prtdenCheckBox.setForeground(Color.blue);
            prtdenTextField.setEnabled(false);
        }
}//GEN-LAST:event_prtdenCheckBoxActionPerformed

    private void prtdosCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prtdosCheckBoxActionPerformed
        if (prtdosCheckBox.isSelected()) {
            prtdosCheckBox.setForeground(Color.red);
            prtdosTextField.setEnabled(true);
        } else {
            prtdosCheckBox.setForeground(Color.blue);
            prtdosTextField.setEnabled(false);
        }
    }//GEN-LAST:event_prtdosCheckBoxActionPerformed

    private void pawprtdenCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pawprtdenCheckBoxActionPerformed
        if (pawprtdenCheckBox.isSelected()) {
            pawprtdenCheckBox.setForeground(Color.red);
            pawprtdenTextField.setEnabled(true);
        } else {
            pawprtdenCheckBox.setForeground(Color.blue);
            pawprtdenTextField.setEnabled(false);
        }
    }//GEN-LAST:event_pawprtdenCheckBoxActionPerformed

    private void pawprtdosCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pawprtdosCheckBoxActionPerformed
        if (pawprtdosCheckBox.isSelected()) {
            pawprtdosCheckBox.setForeground(Color.red);
            pawprtdosTextField.setEnabled(true);
        } else {
            pawprtdosCheckBox.setForeground(Color.blue);
            pawprtdosTextField.setEnabled(false);
        }
    }//GEN-LAST:event_pawprtdosCheckBoxActionPerformed

    private void prtxmlCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prtxmlCheckBoxActionPerformed
        if (prtxmlCheckBox.isSelected()) {
            prtxmlCheckBox.setForeground(Color.red);
        } else {
            prtxmlCheckBox.setForeground(Color.blue);
        }
    }//GEN-LAST:event_prtxmlCheckBoxActionPerformed

    private void getddkCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getddkCheckBoxActionPerformed
        if (getddkCheckBox.isSelected()) {
            getddkCheckBox.setForeground(Color.red);
            getddkTextField.setEnabled(true);
        } else {
            getddkCheckBox.setForeground(Color.blue);
            getddkTextField.setEnabled(false);
        }
    }//GEN-LAST:event_getddkCheckBoxActionPerformed

    private void getdenCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getdenCheckBoxActionPerformed
        if (getdenCheckBox.isSelected()) {
            getdenCheckBox.setForeground(Color.red);
            getdenTextField.setEnabled(true);
        } else {
            getdenCheckBox.setForeground(Color.blue);
            getdenTextField.setEnabled(false);
        }
    }//GEN-LAST:event_getdenCheckBoxActionPerformed

    private void getkssCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getkssCheckBoxActionPerformed
        if (getkssCheckBox.isSelected()) {
            getkssCheckBox.setForeground(Color.red);
            getkssTextField.setEnabled(true);
        } else {
            getkssCheckBox.setForeground(Color.blue);
            getkssTextField.setEnabled(false);
        }
    }//GEN-LAST:event_getkssCheckBoxActionPerformed

    private void getoccCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getoccCheckBoxActionPerformed
        if (getoccCheckBox.isSelected()) {
            getoccCheckBox.setForeground(Color.red);
            getoccTextField.setEnabled(true);
        } else {
            getoccCheckBox.setForeground(Color.blue);
            getoccTextField.setEnabled(false);
        }
    }//GEN-LAST:event_getoccCheckBoxActionPerformed

    private void getqpsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getqpsCheckBoxActionPerformed
        if (getqpsCheckBox.isSelected()) {
            getqpsCheckBox.setForeground(Color.red);
            getqpsTextField.setEnabled(true);
        } else {
            getqpsCheckBox.setForeground(Color.blue);
            getqpsTextField.setEnabled(false);
        }
    }//GEN-LAST:event_getqpsCheckBoxActionPerformed

    public String getData() {
        String file = new String();

        // PRTDEN ***************************************************************
        if (prtdenCheckBox.isSelected()) {
            try {
                int prtden = Integer.parseInt(prtdenTextField.getText());
                file += prtdenCheckBox.getText() + " ";
                file += prtden + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up PRTDEN (must be an integer)!");
            }
        }
        // PRTDOS ***************************************************************
        if (prtdosCheckBox.isSelected()) {
            try {
                int prtdos = Integer.parseInt(prtdosTextField.getText());
                file += prtdosCheckBox.getText() + " ";
                file += prtdos + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up PRTDOS (must be an integer)!");
            }
        }
        // PAWPRTDEN ***************************************************************
        if (pawprtdenCheckBox.isSelected()) {
            try {
                int pawprtden = Integer.parseInt(pawprtdenTextField.getText());
                file += pawprtdenCheckBox.getText() + " ";
                file += pawprtden + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up PAWPRTDEN (must be an integer)!");
            }
        }
        // PAWPRTDOS ***************************************************************
        if (pawprtdosCheckBox.isSelected()) {
            try {
                int pawprtdos = Integer.parseInt(pawprtdosTextField.getText());
                file += pawprtdosCheckBox.getText() + " ";
                file += pawprtdos + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up PAWPRTDOS (must be an integer)!");
            }
        }
        // PRTXML ***************************************************************
        if (prtxmlCheckBox.isSelected()) {
            file += prtxmlCheckBox.getText() + " 1\n\n";
        }
        // GETDDK ***************************************************************
        if (getddkCheckBox.isSelected()) {
            try {
                int getddk = Integer.parseInt(getddkTextField.getText());
                file += getddkCheckBox.getText() + " ";
                file += getddk + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up GETDDK (must be an integer)!");
            }
        }
        // GETDEN ***************************************************************
        if (getdenCheckBox.isSelected()) {
            try {
                int getden = Integer.parseInt(getdenTextField.getText());
                file += getdenCheckBox.getText() + " ";
                file += getden + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up GETDEN (must be an integer)!");
            }
        }
        // GETKSS ***************************************************************
        if (getkssCheckBox.isSelected()) {
            try {
                int getkss = Integer.parseInt(getkssTextField.getText());
                file += getkssCheckBox.getText() + " ";
                file += getkss + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up GETKSS (must be an integer)!");
            }
        }
        // GETOCC ***************************************************************
        if (getoccCheckBox.isSelected()) {
            try {
                int getocc = Integer.parseInt(getoccTextField.getText());
                file += getoccCheckBox.getText() + " ";
                file += getocc + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up GETOCC (must be an integer)!");
            }
        }
        // GETQPS ***************************************************************
        if (getqpsCheckBox.isSelected()) {
            try {
                int getqps = Integer.parseInt(getqpsTextField.getText());
                file += getqpsCheckBox.getText() + " ";
                file += getqps + "\n\n";
            } catch (Exception e) {
                MainFrame.printERR("Please set up GETQPS (must be an integer)!");
            }
        }

        return file;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox getddkCheckBox;
    private javax.swing.JTextField getddkTextField;
    private javax.swing.JCheckBox getdenCheckBox;
    private javax.swing.JTextField getdenTextField;
    private javax.swing.JCheckBox getkssCheckBox;
    private javax.swing.JTextField getkssTextField;
    private javax.swing.JCheckBox getoccCheckBox;
    private javax.swing.JTextField getoccTextField;
    private javax.swing.JCheckBox getqpsCheckBox;
    private javax.swing.JTextField getqpsTextField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox pawprtdenCheckBox;
    private javax.swing.JTextField pawprtdenTextField;
    private javax.swing.JCheckBox pawprtdosCheckBox;
    private javax.swing.JTextField pawprtdosTextField;
    private javax.swing.JCheckBox prtdenCheckBox;
    private javax.swing.JTextField prtdenTextField;
    private javax.swing.JCheckBox prtdosCheckBox;
    private javax.swing.JTextField prtdosTextField;
    private javax.swing.JCheckBox prtxmlCheckBox;
    // End of variables declaration//GEN-END:variables

}
