
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Add_Password extends javax.swing.JFrame {

    
    
    Connection conn = null; //Copy Everytime
    Statement stmt = null; //Copy Everytime
    ResultSet rs = null; //Copy Everytime
    
    
    
    public Add_Password() {
        super("Add Password");
        initComponents();
        initComponents2();
        conn = databaseConnection.connection();
    }
    
    
    private void initComponents2(){
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        siteName_jTextField = new javax.swing.JTextField();
        username_jTextField = new javax.swing.JTextField();
        mail_jTextField = new javax.swing.JTextField();
        password_jTextField = new javax.swing.JTextField();
        add_jButton = new javax.swing.JButton();
        back_jButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        home_jMenuItem = new javax.swing.JMenuItem();
        logout_jMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        about_jMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Site Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mail or Phone");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        siteName_jTextField.setBackground(new java.awt.Color(255, 255, 255));
        siteName_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        siteName_jTextField.setForeground(new java.awt.Color(0, 0, 0));

        username_jTextField.setBackground(new java.awt.Color(255, 255, 255));
        username_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_jTextField.setForeground(new java.awt.Color(0, 0, 0));

        mail_jTextField.setBackground(new java.awt.Color(255, 255, 255));
        mail_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mail_jTextField.setForeground(new java.awt.Color(0, 0, 0));

        password_jTextField.setBackground(new java.awt.Color(255, 255, 255));
        password_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_jTextField.setForeground(new java.awt.Color(0, 0, 0));

        add_jButton.setBackground(new java.awt.Color(255, 255, 255));
        add_jButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_jButton.setForeground(new java.awt.Color(0, 0, 0));
        add_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managing Project Photos/Insert.png"))); // NOI18N
        add_jButton.setText("ADD");
        add_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jButtonActionPerformed(evt);
            }
        });

        back_jButton.setBackground(new java.awt.Color(255, 255, 255));
        back_jButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_jButton.setForeground(new java.awt.Color(0, 0, 0));
        back_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managing Project Photos/Back.png"))); // NOI18N
        back_jButton.setText("BACK");
        back_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_jTextField)
                            .addComponent(siteName_jTextField)
                            .addComponent(mail_jTextField)
                            .addComponent(password_jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(add_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(back_jButton)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(siteName_jTextField)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_jTextField)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mail_jTextField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(password_jTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("File");
        jMenu1.setToolTipText("More Options");

        home_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        home_jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managing Project Photos/Home.png"))); // NOI18N
        home_jMenuItem.setText("Home");
        home_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_jMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(home_jMenuItem);

        logout_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout_jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managing Project Photos/Logout.jpg"))); // NOI18N
        logout_jMenuItem.setText("Log out");
        logout_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_jMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(logout_jMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenu2.setToolTipText("About Software");

        about_jMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        about_jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Managing Project Photos/About.png"))); // NOI18N
        about_jMenuItem.setText("About");
        about_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_jMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(about_jMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

        setSize(new java.awt.Dimension(498, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_jButtonActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        Home obj = new Home();
        obj.setVisible(true);
        
    }//GEN-LAST:event_back_jButtonActionPerformed

    private void add_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jButtonActionPerformed
        // TODO add your handling code here:
        
        try {
            
            stmt = conn.createStatement();
            String siteName = siteName_jTextField.getText();
            String username = username_jTextField.getText();
            String mail = mail_jTextField.getText();
            String password = password_jTextField.getText();
            
            String sql = "INSERT INTO ALLPASSWORD(siteName, username, mail, password) VALUES('"+siteName+"', '"+username+"', '"+mail+"', '"+password+"')";
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Password sertion Successful");
            
            // Clearing Boxes after adding password
            siteName_jTextField.setText("");
            username_jTextField.setText("");
            mail_jTextField.setText("");
            password_jTextField.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Add Password Error = "+e);
        }
        
    }//GEN-LAST:event_add_jButtonActionPerformed

    private void logout_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_jMenuItemActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        Login log = new Login();
        log.setVisible(true);

    }//GEN-LAST:event_logout_jMenuItemActionPerformed

    private void about_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_jMenuItemActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        About about = new About();
        about.setVisible(true);

    }//GEN-LAST:event_about_jMenuItemActionPerformed

    private void home_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_jMenuItemActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        Home home = new Home();
        home.setVisible(true);
        
    }//GEN-LAST:event_home_jMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about_jMenuItem;
    private javax.swing.JButton add_jButton;
    private javax.swing.JButton back_jButton;
    private javax.swing.JMenuItem home_jMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logout_jMenuItem;
    private javax.swing.JTextField mail_jTextField;
    private javax.swing.JTextField password_jTextField;
    private javax.swing.JTextField siteName_jTextField;
    private javax.swing.JTextField username_jTextField;
    // End of variables declaration//GEN-END:variables
}
