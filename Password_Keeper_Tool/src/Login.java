
import java.awt.HeadlessException;
import java.sql.Connection;  //Copy Everytime
import java.sql.Statement;  //Copy Everytime
import java.sql.ResultSet;  //Copy Everytime
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    
    
    Connection conn = null; //Copy Everytime
    Statement stmt = null; //Copy Everytime
    ResultSet rs = null; //Copy Everytime
    
    
    public Login() {
        super("Sign in");
        conn = databaseConnection.connection(); //Copy Everytime
        initComponents();
        initComponents2();
    }
    
    
    private void initComponents2(){
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        transparent_jPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        masterPass_jPasswordField = new javax.swing.JPasswordField();
        login_jButton = new javax.swing.JButton();
        forgetPass_jButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(570, 429));
        setMinimumSize(new java.awt.Dimension(570, 429));
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        transparent_jPanel.setBackground(new java.awt.Color(0, 0, 0,78));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign in");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managing Project Photos/Key.png"))); // NOI18N

        login_jButton.setBackground(new java.awt.Color(255, 255, 0));
        login_jButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_jButton.setForeground(new java.awt.Color(0, 0, 0));
        login_jButton.setText("Login");
        login_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_jButtonActionPerformed(evt);
            }
        });

        forgetPass_jButton.setBackground(new java.awt.Color(51, 51, 51));
        forgetPass_jButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        forgetPass_jButton.setForeground(new java.awt.Color(255, 255, 255));
        forgetPass_jButton.setText("Forget Password");
        forgetPass_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPass_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transparent_jPanelLayout = new javax.swing.GroupLayout(transparent_jPanel);
        transparent_jPanel.setLayout(transparent_jPanelLayout);
        transparent_jPanelLayout.setHorizontalGroup(
            transparent_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparent_jPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(transparent_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(transparent_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(transparent_jPanelLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(masterPass_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(forgetPass_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        transparent_jPanelLayout.setVerticalGroup(
            transparent_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transparent_jPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(transparent_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masterPass_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgetPass_jButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(transparent_jPanel);
        transparent_jPanel.setBounds(100, 40, 370, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managing Project Photos/Alps_Night.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_jButtonActionPerformed
        // TODO add your handling code here:
        
        
        try {
            
            stmt = conn.createStatement();
            String userPass = masterPass_jPasswordField.getText();
            
            String sql = "SELECT * FROM masterpassword WHERE password='"+userPass+"' ";
            
            
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                setVisible(false);
                Home obj = new Home();
                obj.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Password invalid");
            }
            
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Login Button error = "+e);
        }
        
        
        
    }//GEN-LAST:event_login_jButtonActionPerformed

    private void forgetPass_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPass_jButtonActionPerformed
        // TODO add your handling code here:
        
        String pin_Match = "1234";
        int sNo = 1;
        
        String pin = JOptionPane.showInputDialog("Enter Pin");
        
        if (pin.equals(pin_Match)){
            
            
            /// When Pin is matched then 1st the new password.
            
            
            String new_Pass = JOptionPane.showInputDialog("Enter New Password");
            
            /// After taking the old password Update password
            
           try {

            stmt = conn.createStatement();
            
            String sql = "UPDATE MASTERPASSWORD SET password = '"+new_Pass+"' WHERE sNo = '"+sNo+"' ";

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Password has been Updated Successfully");
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Forget Password Button Error = "+e);
                }
            
            // After Delet the old password, Update the new password into the database

        }
        
        
    }//GEN-LAST:event_forgetPass_jButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgetPass_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_jButton;
    private javax.swing.JPasswordField masterPass_jPasswordField;
    private javax.swing.JPanel transparent_jPanel;
    // End of variables declaration//GEN-END:variables
}
