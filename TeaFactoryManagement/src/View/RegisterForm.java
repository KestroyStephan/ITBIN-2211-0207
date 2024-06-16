package View;

import controller.RegistrationController;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {

    public RegisterForm() {
        initComponents();
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fullnameTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JPasswordField();
        confirmpasswordTF = new javax.swing.JPasswordField();
        contactTF = new javax.swing.JTextField();
        RegisterBTN = new javax.swing.JButton();
        CancelBTN = new javax.swing.JButton();
        BackBTN = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        roleTF = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(193, 50));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Contact Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        fullnameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fullnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTFActionPerformed(evt);
            }
        });
        jPanel1.add(fullnameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 260, -1));

        usernameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 260, -1));

        emailTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 260, -1));

        passwordTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 260, -1));

        confirmpasswordTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(confirmpasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 260, -1));

        contactTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(contactTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 260, -1));

        RegisterBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegisterBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-signing-a-document.gif"))); // NOI18N
        RegisterBTN.setText("Register");
        RegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTNActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, -1, -1));

        CancelBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CancelBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close.gif"))); // NOI18N
        CancelBTN.setText("Cancel");
        CancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBTNActionPerformed(evt);
            }
        });
        jPanel1.add(CancelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 130, 60));

        BackBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-back.gif"))); // NOI18N
        BackBTN.setText("Back");
        BackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBTNActionPerformed(evt);
            }
        });
        jPanel1.add(BackBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 110, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Role");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        roleTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(roleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 970, 20));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Registeration ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backg.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTNActionPerformed
         String fullName = fullnameTF.getText();
        String username = usernameTF.getText();
        String password = new String(passwordTF.getPassword());
        String confirmPassword = new String(confirmpasswordTF.getPassword());
        String email = emailTF.getText();
        String contact = contactTF.getText();
        String role = roleTF.getText();
        
        if (fullName.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || contact.isEmpty() || role.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        RegistrationController registrationController = new RegistrationController();
        boolean result = registrationController.registerUser(fullName, username, password, email, contact, role);
        System.out.println(result);
        boolean isRegistered = true;
        
        if (isRegistered) {
            JOptionPane.showMessageDialog(this, "Registration successful! Please login.");
            new userLogin().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RegisterBTNActionPerformed

    private void CancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBTNActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBTNActionPerformed

    private void BackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBTNActionPerformed
        new userLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBTNActionPerformed

    private void fullnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTFActionPerformed
        
    }//GEN-LAST:event_fullnameTFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RegisterForm().setVisible(true));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBTN;
    private javax.swing.JButton CancelBTN;
    private javax.swing.JButton RegisterBTN;
    private javax.swing.JPasswordField confirmpasswordTF;
    private javax.swing.JTextField contactTF;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField fullnameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField roleTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

    private void registerAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addRegisterButtonListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addCancelButtonListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
