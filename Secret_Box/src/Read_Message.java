
import javax.swing.JOptionPane;

public class Read_Message extends javax.swing.JFrame {

   
    public Read_Message() {
        initComponents();
        initComponents2();
    }
    
    
    
    private void initComponents2(){
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WIDTH);
        setTitle("Read Secret Message");
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        read_Message_jPanel = new javax.swing.JPanel();
        title_JLabel = new javax.swing.JLabel();
        enter_Message_jTextField = new javax.swing.JTextField();
        key_jLabel = new javax.swing.JLabel();
        key_jTextField = new javax.swing.JTextField();
        original_jLabel = new javax.swing.JLabel();
        show_Original_Message_jTextField = new javax.swing.JTextField();
        read_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        read_Message_jPanel.setBackground(new java.awt.Color(0, 0, 0));
        read_Message_jPanel.setForeground(new java.awt.Color(255, 255, 255));

        title_JLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        title_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_JLabel.setText("Enter Your Message Below");

        key_jLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        key_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        key_jLabel.setText("Enter Secret Key (1-25)");

        key_jTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        key_jTextField.setForeground(new java.awt.Color(0, 0, 0));

        original_jLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        original_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        original_jLabel.setText("Original Message :");

        show_Original_Message_jTextField.setEditable(false);
        show_Original_Message_jTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        show_Original_Message_jTextField.setForeground(new java.awt.Color(0, 0, 0));

        read_jButton.setBackground(new java.awt.Color(51, 255, 51));
        read_jButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        read_jButton.setForeground(new java.awt.Color(0, 0, 0));
        read_jButton.setText("READ");
        read_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                read_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout read_Message_jPanelLayout = new javax.swing.GroupLayout(read_Message_jPanel);
        read_Message_jPanel.setLayout(read_Message_jPanelLayout);
        read_Message_jPanelLayout.setHorizontalGroup(
            read_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(read_Message_jPanelLayout.createSequentialGroup()
                .addGroup(read_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(read_Message_jPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(enter_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(read_Message_jPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(read_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(key_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(read_Message_jPanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(read_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, read_Message_jPanelLayout.createSequentialGroup()
                .addGroup(read_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, read_Message_jPanelLayout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(original_jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(show_Original_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(read_Message_jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(title_JLabel)))
                .addGap(26, 26, 26))
        );
        read_Message_jPanelLayout.setVerticalGroup(
            read_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(read_Message_jPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(title_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enter_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(read_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(key_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(read_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(read_Message_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(show_Original_Message_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(original_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(read_Message_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(read_Message_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void read_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_read_jButtonActionPerformed
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
            x = x - sectret_Key;
            if(x<0)
            {
                x = x + 26;
            }
            
            x = x +65;
             y = (char) x;
            
             
            }
            
            System.out.println("y = "+y);
            
            new_Message = new_Message + y;
           
            
        }
        
            
            flag++;
        show_Original_Message_jTextField.setText(new_Message);
            
        }else{
            JOptionPane.showMessageDialog(null, "Enter Key Between [1 - 25]");
            key_jTextField.setText("");
            show_Original_Message_jTextField.setText("");
            flag = 0;
        }
            
            
        }
        
        
        
        
        
        enter_Message_jTextField.setText("");
        key_jTextField.setText("");
        
        
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, e);
            System.out.println("Read Message Error = "+e);
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_read_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Read_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Read_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Read_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Read_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Read_Message().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enter_Message_jTextField;
    private javax.swing.JLabel key_jLabel;
    private javax.swing.JTextField key_jTextField;
    private javax.swing.JLabel original_jLabel;
    private javax.swing.JPanel read_Message_jPanel;
    private javax.swing.JButton read_jButton;
    private javax.swing.JTextField show_Original_Message_jTextField;
    private javax.swing.JLabel title_JLabel;
    // End of variables declaration//GEN-END:variables
}
