
import javax.swing.JOptionPane;


public class Inheritance extends javax.swing.JFrame {

    public Inheritance() {
        initComponents();
        initComponents2();
    }

    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("INHERITANCE");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("Inheritance.txt");
        theory_textArea.setText(line);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inheritance_buttonGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        theory_textArea = new javax.swing.JTextArea();
        generate_jButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        single_jRadioButton = new javax.swing.JRadioButton();
        multi_jRadioButton = new javax.swing.JRadioButton();
        hirerchical_jRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(WIDTH);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INHERITANCE");

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

        single_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        inheritance_buttonGroup.add(single_jRadioButton);
        single_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        single_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        single_jRadioButton.setText("Single Level");
        single_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                single_jRadioButtonActionPerformed(evt);
            }
        });

        multi_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        inheritance_buttonGroup.add(multi_jRadioButton);
        multi_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        multi_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        multi_jRadioButton.setText("Multi Level");
        multi_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi_jRadioButtonActionPerformed(evt);
            }
        });

        hirerchical_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        inheritance_buttonGroup.add(hirerchical_jRadioButton);
        hirerchical_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        hirerchical_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        hirerchical_jRadioButton.setText("Hirerchical");
        hirerchical_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirerchical_jRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(multi_jRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(single_jRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hirerchical_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(single_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multi_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hirerchical_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_jButtonActionPerformed
        Utility util = new Utility();
        if(single_jRadioButton.isSelected() == true){
           String line = util.read("singleLevelInheritance.txt");
           code_jTextArea.setText(line);
       }else if(multi_jRadioButton.isSelected() == true){
           String line = util.read("Multi_Level_Inheritance.txt");
           code_jTextArea.setText(line);
       }else if(hirerchical_jRadioButton.isSelected() == true){
           String line = util.read("Hirerchical_Inheritance.txt");
           code_jTextArea.setText(line);
       }else {
           JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_generate_jButtonActionPerformed

    private void single_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_single_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_single_jRadioButtonActionPerformed

    private void multi_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multi_jRadioButtonActionPerformed

    private void hirerchical_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirerchical_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hirerchical_jRadioButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inheritance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.JButton generate_jButton;
    private javax.swing.JRadioButton hirerchical_jRadioButton;
    private javax.swing.ButtonGroup inheritance_buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton multi_jRadioButton;
    private javax.swing.JRadioButton single_jRadioButton;
    private javax.swing.JTextArea theory_textArea;
    // End of variables declaration//GEN-END:variables
}
