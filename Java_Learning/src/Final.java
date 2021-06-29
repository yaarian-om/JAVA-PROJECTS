
import javax.swing.JOptionPane;

public class Final extends javax.swing.JFrame {

    public Final() {
        initComponents();
        initComponents2();
    }

    
    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("FINAL KEYWORD");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("FinalKeyword.txt");
        theory_textArea.setText(line);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        final_buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        title_jLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        theory_textArea = new javax.swing.JTextArea();
        generate_jButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        final_Attribute_jRadioButton = new javax.swing.JRadioButton();
        final_Method_jRadioButton = new javax.swing.JRadioButton();
        final_Class_jRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(WIDTH);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_jLabel.setText("FINAL KEYWORD");

        theory_textArea.setEditable(false);
        theory_textArea.setBackground(new java.awt.Color(255, 255, 255));
        theory_textArea.setColumns(20);
        theory_textArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        theory_textArea.setForeground(new java.awt.Color(0, 0, 0));
        theory_textArea.setRows(5);
        jScrollPane1.setViewportView(theory_textArea);

        generate_jButton.setBackground(new java.awt.Color(51, 255, 51));
        generate_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generate_jButton.setForeground(new java.awt.Color(0, 0, 0));
        generate_jButton.setText("GENERATE CODE");
        generate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_jButtonActionPerformed(evt);
            }
        });

        code_jTextArea.setEditable(false);
        code_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        code_jTextArea.setColumns(20);
        code_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        code_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        code_jTextArea.setRows(5);
        jScrollPane2.setViewportView(code_jTextArea);

        final_Attribute_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        final_buttonGroup.add(final_Attribute_jRadioButton);
        final_Attribute_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        final_Attribute_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        final_Attribute_jRadioButton.setText("Final Attribute");
        final_Attribute_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_Attribute_jRadioButtonActionPerformed(evt);
            }
        });

        final_Method_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        final_buttonGroup.add(final_Method_jRadioButton);
        final_Method_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        final_Method_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        final_Method_jRadioButton.setText("Final Method");
        final_Method_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_Method_jRadioButtonActionPerformed(evt);
            }
        });

        final_Class_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        final_buttonGroup.add(final_Class_jRadioButton);
        final_Class_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        final_Class_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        final_Class_jRadioButton.setText("Final Class");
        final_Class_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_Class_jRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(final_Attribute_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(final_Method_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(final_Class_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title_jLabel)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(final_Attribute_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(final_Method_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(final_Class_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
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

    private void generate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_jButtonActionPerformed
        Utility util = new Utility();
        
        if(final_Attribute_jRadioButton.isSelected() == true){
           String line = util.read("Final_DataType.txt");
           code_jTextArea.setText(line);
       }else if(final_Method_jRadioButton.isSelected() == true){
           String line = util.read("Final_Method.txt");
           code_jTextArea.setText(line);
       }else if(final_Class_jRadioButton.isSelected() == true){
           String line = util.read("Final_Class.txt");
           code_jTextArea.setText(line);
       }else {
           JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);
       }
        
        
    }//GEN-LAST:event_generate_jButtonActionPerformed

    private void final_Attribute_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_Attribute_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_Attribute_jRadioButtonActionPerformed

    private void final_Method_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_Method_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_Method_jRadioButtonActionPerformed

    private void final_Class_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_Class_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_final_Class_jRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.JRadioButton final_Attribute_jRadioButton;
    private javax.swing.JRadioButton final_Class_jRadioButton;
    private javax.swing.JRadioButton final_Method_jRadioButton;
    private javax.swing.ButtonGroup final_buttonGroup;
    private javax.swing.JButton generate_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea theory_textArea;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration//GEN-END:variables
}
