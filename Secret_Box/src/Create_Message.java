
import javax.swing.JOptionPane;


public class Create_Message extends javax.swing.JFrame {

    public Create_Message() {
        initComponents();
        initComponents2();
    }
    
    
    private void initComponents2(){
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WIDTH);
        setTitle("Create Secret Message");
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create_Message_jPanel = new javax.swing.JPanel();
        enter_Message_jTextField = new javax.swing.JTextField();
        enter_Message_jLabel = new javax.swing.JLabel();
        create_jButton = new javax.swing.JButton();
        key_jLabel = new javax.swing.JLabel();
        key_jTextField = new javax.swing.JTextField();
        secret_MessagejLabel = new javax.swing.JLabel();
        show_Secret_Message_jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        create_Message_jPanel.setBackground(new java.awt.Color(0, 0, 0));
        create_Message_jPanel.setForeground(new java.awt.Color(255, 255, 255));

        enter_Message_jTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        enter_Message_jLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        enter_Message_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        enter_Message_jLabel.setText("Enter Your Message Below");

        create_jButton.setBackground(new java.awt.Color(51, 255, 0));
        create_jButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        create_jButton.setForeground(new java.awt.Color(0, 0, 0));
        create_jButton.setText("CREATE");
        create_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_jButtonActionPerformed(evt);
            }
        });

        key_jLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        key_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        key_jLabel.setText("Enter Secret Key (1-25)");

        secret_MessagejLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        secret_MessagejLabel.setForeground(new java.awt.Color(255, 255, 255));
        secret_MessagejLabel.setText("Secret Message  :");

        show_Secret_Message_jTextField.setEditable(false);

        javax.swing.GroupLayout create_Message_jPanelLayout = new javax.swing.GroupLayout(create_Message_jPanel);
        create_Message_jPanel.setLayout(create_Message_jPanelLayout);
        create_Message_jPanelLayout.setHorizontalGroup(
            create_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_Message_jPanelLayout.createSequentialGroup()
                .addGroup(create_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_Message_jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(secret_MessagejLabel)
                        .addGap(12, 12, 12)
                        .addComponent(show_Secret_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_Message_jPanelLayout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(enter_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(create_Message_jPanelLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(create_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(key_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(create_jButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(key_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(create_Message_jPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(enter_Message_jLabel)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        create_Message_jPanelLayout.setVerticalGroup(
            create_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_Message_jPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(enter_Message_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enter_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(create_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(create_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(create_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_Message_jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(secret_MessagejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(create_Message_jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(show_Secret_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(create_Message_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(create_Message_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void create_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_jButtonActionPerformed
        // TODO add your handling code here:
        
       
        try {
            
            int flag = 0;
        
        while(flag==0){
            
            
            String new_Message = "";
        char y = ' ';
        
        String message = enter_Message_jTextField.getText();
        message = message.toUpperCase();
        String key = key_jTextField.getText();
        int sectret_Key = Integer.parseInt(key);
        if(sectret_Key>0 && sectret_Key<26){
            
            for(int i = 0; i<message.length();i++){
            
            char z = message.charAt(i);
            int x = (int)z;
            System.out.println(x);
            
            if(x==32){
                y = ' ';
            }else{
            
                
                x = x - 65;
            x = x + sectret_Key;
            if(x>=26)
            {
                x = x % 26;
            }
            
            x = x +65;
             y = (char) x;
            
             
            }
            
            System.out.println("y = "+y);
            
            new_Message = new_Message + y;
           
            
        }
        
            
            flag++;
        show_Secret_Message_jTextField.setText(new_Message);
            
        }else{
            JOptionPane.showMessageDialog(null, "Enter Key Between [1 - 25]");
            key_jTextField.setText("");
            show_Secret_Message_jTextField.setText("");
            flag = 0;
        }
            
            
        }
        
        
        
        
        
        enter_Message_jTextField.setText("");
        key_jTextField.setText("");
        
        
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
            System.out.println("Create Message Error = "+e);
        }
        
        
    }//GEN-LAST:event_create_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Message().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel create_Message_jPanel;
    private javax.swing.JButton create_jButton;
    private javax.swing.JLabel enter_Message_jLabel;
    private javax.swing.JTextField enter_Message_jTextField;
    private javax.swing.JLabel key_jLabel;
    private javax.swing.JTextField key_jTextField;
    private javax.swing.JLabel secret_MessagejLabel;
    private javax.swing.JTextField show_Secret_Message_jTextField;
    // End of variables declaration//GEN-END:variables
}
