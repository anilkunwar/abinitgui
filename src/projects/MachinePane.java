/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projects;

import core.MainFrame;
import java.awt.Color;

/**
 *
 * @author yannick
 */
public class MachinePane extends javax.swing.JPanel {

    private MainFrame mf;
    
    /**
     * Creates new form MachinePane
     */
    public MachinePane(MainFrame mf) {
        this.mf = mf;
        initComponents();
    }
    
    public void fillFieldsFromMachine(Machine machine)
    {
        switch(machine.getType())
        {
            case Machine.GATEWAY_MACHINE:
                this.remoteGatewayRadioButton.setSelected(true);
                this.gatewayHostTextField.setText(machine.getGatewayConnect().getHost());
                this.gatewayLoginTextField.setText(machine.getGatewayConnect().getLogin());
                this.gatewayPasswordField.setText(machine.getGatewayConnect().getPassword());
                this.jCB_useKey2.setSelected(machine.getGatewayConnect().isUseKey());
            case Machine.REMOTE_MACHINE:
                this.remoteAbinitRadioButton.setSelected(true);
                this.hostTextField.setText(machine.getRemoteConnect().getHost());
                this.loginTextField.setText(machine.getRemoteConnect().getLogin());
                this.pwdPasswordField.setText(machine.getRemoteConnect().getPassword());
                this.jCB_useKey1.setSelected(machine.getRemoteConnect().isUseKey());
            case Machine.LOCAL_MACHINE:
                this.localAbinitRadioButton.setSelected(true);
                this.abinitPathTextField.setText(machine.getAbinitPath());
                this.mySimulationsTextField.setText(machine.getSimulationPath());
        }
    }
    
    public Machine getMachineFromFields()
    {
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whereIsAbinitLabel = new javax.swing.JLabel();
        localAbinitRadioButton = new javax.swing.JRadioButton();
        remoteAbinitRadioButton = new javax.swing.JRadioButton();
        remoteGatewayRadioButton = new javax.swing.JRadioButton();
        loginPanel = new javax.swing.JPanel();
        hostTextField = new javax.swing.JTextField();
        hostLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        pwdPasswordField = new javax.swing.JPasswordField();
        pwdLabel = new javax.swing.JLabel();
        jCB_useKey1 = new javax.swing.JCheckBox();
        jTF_key1 = new javax.swing.JTextField();
        gatewayLoginPanel = new javax.swing.JPanel();
        gatewayHostTextField = new javax.swing.JTextField();
        hostBFELabel = new javax.swing.JLabel();
        loginBFELabel = new javax.swing.JLabel();
        gatewayLoginTextField = new javax.swing.JTextField();
        gatewayPasswordField = new javax.swing.JPasswordField();
        pwdBFELabel = new javax.swing.JLabel();
        jCB_useKey2 = new javax.swing.JCheckBox();
        jTF_key2 = new javax.swing.JTextField();
        mySimulationsLabel = new javax.swing.JLabel();
        mySimulationsTextField = new javax.swing.JTextField();
        abinitPathPathLabel = new javax.swing.JLabel();
        abinitPathTextField = new javax.swing.JTextField();

        whereIsAbinitLabel.setForeground(java.awt.Color.red);
        whereIsAbinitLabel.setText("ABINIT host location ?");

        localAbinitRadioButton.setForeground(java.awt.Color.blue);
        localAbinitRadioButton.setText("Local (only for Linux hosts)");
        localAbinitRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localAbinitRadioButtonActionPerformed(evt);
            }
        });

        remoteAbinitRadioButton.setForeground(java.awt.Color.blue);
        remoteAbinitRadioButton.setText("Remote");
        remoteAbinitRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remoteAbinitRadioButtonActionPerformed(evt);
            }
        });

        remoteGatewayRadioButton.setForeground(java.awt.Color.red);
        remoteGatewayRadioButton.setSelected(true);
        remoteGatewayRadioButton.setText("Remote (behind a gateway)");
        remoteGatewayRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remoteGatewayRadioButtonActionPerformed(evt);
            }
        });

        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Remote Abinithost login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), java.awt.Color.darkGray)); // NOI18N

        hostLabel.setText("Hostname or IP");

        loginLabel.setText("Login");

        pwdLabel.setText("Password");

        jCB_useKey1.setText("use key");
        jCB_useKey1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_useKey1ActionPerformed(evt);
            }
        });

        jTF_key1.setEnabled(false);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hostLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginTextField)
                            .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jCB_useKey1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_key1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginLabel))
                    .addComponent(pwdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_useKey1)
                    .addComponent(jTF_key1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gatewayLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gateway login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14), java.awt.Color.darkGray)); // NOI18N

        hostBFELabel.setText("Hostname or IP");

        loginBFELabel.setText("Login");

        pwdBFELabel.setText("Password");

        jCB_useKey2.setText("use key");
        jCB_useKey2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_useKey2ActionPerformed(evt);
            }
        });

        jTF_key2.setEnabled(false);

        javax.swing.GroupLayout gatewayLoginPanelLayout = new javax.swing.GroupLayout(gatewayLoginPanel);
        gatewayLoginPanel.setLayout(gatewayLoginPanelLayout);
        gatewayLoginPanelLayout.setHorizontalGroup(
            gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatewayLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gatewayLoginPanelLayout.createSequentialGroup()
                        .addComponent(jCB_useKey2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_key2))
                    .addGroup(gatewayLoginPanelLayout.createSequentialGroup()
                        .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hostBFELabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gatewayHostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gatewayLoginTextField)
                            .addComponent(loginBFELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdBFELabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gatewayPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        gatewayLoginPanelLayout.setVerticalGroup(
            gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatewayLoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hostBFELabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginBFELabel))
                    .addComponent(pwdBFELabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gatewayHostTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gatewayLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gatewayPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gatewayLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCB_useKey2)
                    .addComponent(jTF_key2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mySimulationsLabel.setText("Path where to create the simulations filetree");
        mySimulationsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mySimulationsLabelMouseClicked(evt);
            }
        });

        abinitPathPathLabel.setText("Path to the abinit program (At abinit server !)");
        abinitPathPathLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abinitPathPathLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gatewayLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mySimulationsLabel)
                    .addComponent(mySimulationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abinitPathPathLabel)
                    .addComponent(abinitPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whereIsAbinitLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localAbinitRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remoteAbinitRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remoteGatewayRadioButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(whereIsAbinitLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localAbinitRadioButton)
                    .addComponent(remoteAbinitRadioButton)
                    .addComponent(remoteGatewayRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gatewayLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mySimulationsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mySimulationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abinitPathPathLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abinitPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void localAbinitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localAbinitRadioButtonActionPerformed

        localAbinitRadioButton.setForeground(Color.red);
        remoteGatewayRadioButton.setForeground(Color.blue);
        remoteAbinitRadioButton.setForeground(Color.blue);

        gatewayLoginPanel.setVisible(false);
        loginPanel.setVisible(false);
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)),
            "Local Abinithost login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Arial", 3, 14), java.awt.Color.darkGray));
    }//GEN-LAST:event_localAbinitRadioButtonActionPerformed

    private void remoteAbinitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remoteAbinitRadioButtonActionPerformed

        localAbinitRadioButton.setForeground(Color.blue);
        remoteGatewayRadioButton.setForeground(Color.blue);
        remoteAbinitRadioButton.setForeground(Color.red);

        gatewayLoginPanel.setVisible(false);
        loginPanel.setVisible(true);
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)),
            "Remote Abinithost login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Arial", 3, 14), java.awt.Color.darkGray));
    }//GEN-LAST:event_remoteAbinitRadioButtonActionPerformed

    private void remoteGatewayRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remoteGatewayRadioButtonActionPerformed

        localAbinitRadioButton.setForeground(Color.blue);
        remoteGatewayRadioButton.setForeground(Color.red);
        remoteAbinitRadioButton.setForeground(Color.blue);

        gatewayLoginPanel.setVisible(true);
        loginPanel.setVisible(true);
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)),
            "Remote Abinithost login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Arial", 3, 14), java.awt.Color.darkGray));
    }//GEN-LAST:event_remoteGatewayRadioButtonActionPerformed

    private void jCB_useKey1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_useKey1ActionPerformed
        if (jCB_useKey1.isSelected()) {
            //this.useKey1 = true;
            pwdLabel.setText("Passphrase");
            jTF_key1.setEnabled(true);
        } else {
            //this.useKey1 = false;
            pwdLabel.setText("Password");
            jTF_key1.setEnabled(false);
        }
    }//GEN-LAST:event_jCB_useKey1ActionPerformed

    private void jCB_useKey2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_useKey2ActionPerformed
        if (jCB_useKey2.isSelected()) {
            //this.useKey2 = true;
            pwdBFELabel.setText("Passphrase");
            jTF_key2.setEnabled(true);
        } else {
            //this.useKey2 = false;
            pwdBFELabel.setText("Password");
            jTF_key2.setEnabled(false);
        }
    }//GEN-LAST:event_jCB_useKey2ActionPerformed

    private void mySimulationsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mySimulationsLabelMouseClicked
        mf.printGEN("--- HINT ------------------------------------------", Color.BLACK, false, true);
        mf.printGEN("You have to start your path with ./ and give a folder name where"
            + " to create the abinit filetree\n", Color.RED, false, true);
        mf.printGEN("Example: ./MySimulations\n", new Color(0, 100, 0), false, true);
        mf.printGEN("The filetree will be created in your local computer and at the"
            + " Abinit server side when using remote Abinit servers", Color.DARK_GRAY, false, true);
        mf.printGEN("---------------------------------------------------", Color.BLACK, false, true);
    }//GEN-LAST:event_mySimulationsLabelMouseClicked

    private void abinitPathPathLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abinitPathPathLabelMouseClicked
        mf.printGEN("--- HINT ------------------------------------------", Color.BLACK, false, true);
        mf.printGEN("Remote path where to find the abinit program\n", Color.RED, false, true);
        mf.printGEN("Example: /Users/me/Abinit6.7.2/bin\n", new Color(0, 100, 0), false, true);
        mf.printGEN("---------------------------------------------------", Color.BLACK, false, true);
    }//GEN-LAST:event_abinitPathPathLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abinitPathPathLabel;
    private javax.swing.JTextField abinitPathTextField;
    private javax.swing.JTextField gatewayHostTextField;
    private javax.swing.JPanel gatewayLoginPanel;
    private javax.swing.JTextField gatewayLoginTextField;
    private javax.swing.JPasswordField gatewayPasswordField;
    private javax.swing.JLabel hostBFELabel;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JTextField hostTextField;
    private javax.swing.JCheckBox jCB_useKey1;
    private javax.swing.JCheckBox jCB_useKey2;
    private javax.swing.JTextField jTF_key1;
    private javax.swing.JTextField jTF_key2;
    private javax.swing.JRadioButton localAbinitRadioButton;
    private javax.swing.JLabel loginBFELabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel mySimulationsLabel;
    private javax.swing.JTextField mySimulationsTextField;
    private javax.swing.JLabel pwdBFELabel;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JPasswordField pwdPasswordField;
    private javax.swing.JRadioButton remoteAbinitRadioButton;
    private javax.swing.JRadioButton remoteGatewayRadioButton;
    private javax.swing.JLabel whereIsAbinitLabel;
    // End of variables declaration//GEN-END:variables
}
