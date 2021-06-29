
public class Basic extends javax.swing.JFrame {

    
    public Basic() {
        initComponents();
        initComponents2();
    }
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("Basic");
        setDefaultCloseOperation(WIDTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loop_jToggleButton = new javax.swing.JToggleButton();
        switch_jToggleButton = new javax.swing.JToggleButton();
        if_jToggleButton = new javax.swing.JToggleButton();
        title_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(WIDTH);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        loop_jToggleButton.setBackground(new java.awt.Color(51, 255, 51));
        loop_jToggleButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        loop_jToggleButton.setForeground(new java.awt.Color(0, 0, 0));
        loop_jToggleButton.setText("Loop");
        loop_jToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loop_jToggleButtonActionPerformed(evt);
            }
        });

        switch_jToggleButton.setBackground(new java.awt.Color(51, 255, 51));
        switch_jToggleButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        switch_jToggleButton.setForeground(new java.awt.Color(0, 0, 0));
        switch_jToggleButton.setText("Switch");
        switch_jToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_jToggleButtonActionPerformed(evt);
            }
        });

        if_jToggleButton.setBackground(new java.awt.Color(51, 255, 51));
        if_jToggleButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        if_jToggleButton.setForeground(new java.awt.Color(0, 0, 0));
        if_jToggleButton.setText("If-Else_If");
        if_jToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if_jToggleButtonActionPerformed(evt);
            }
        });

        title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_jLabel.setText("BASIC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(title_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(if_jToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(switch_jToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loop_jToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(loop_jToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(switch_jToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(if_jToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loop_jToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loop_jToggleButtonActionPerformed
        // TODO add your handling code here:
        Loop l = new Loop();
    }//GEN-LAST:event_loop_jToggleButtonActionPerformed

    private void switch_jToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switch_jToggleButtonActionPerformed
        // TODO add your handling code here:
        
        Switch s = new Switch();
        
    }//GEN-LAST:event_switch_jToggleButtonActionPerformed

    private void if_jToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_if_jToggleButtonActionPerformed
        // TODO add your handling code here:
        
        IF_Else_If ifelse = new IF_Else_If();
    }//GEN-LAST:event_if_jToggleButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton if_jToggleButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton loop_jToggleButton;
    private javax.swing.JToggleButton switch_jToggleButton;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration//GEN-END:variables
}
