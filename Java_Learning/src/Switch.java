
import javax.swing.JOptionPane;

public class Switch extends javax.swing.JFrame {

    /**
     * Creates new form Switch
     */
    public Switch() {
        initComponents();
        initComponents2();
    }
    
    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("SWITCH");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("Switchs.txt");
        theory_jTextArea.setText(line);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        title_jLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        theory_jTextArea = new javax.swing.JTextArea();
        case_1_jRadioButton = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        generate_jButton = new javax.swing.JButton();
        case_A_jRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(WIDTH);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        title_jLabel.setBackground(new java.awt.Color(0, 0, 0));
        title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 50)); // NOI18N
        title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_jLabel.setText("SWITCH");

        theory_jTextArea.setEditable(false);
        theory_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        theory_jTextArea.setColumns(20);
        theory_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        theory_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        theory_jTextArea.setRows(5);
        jScrollPane1.setViewportView(theory_jTextArea);

        case_1_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(case_1_jRadioButton);
        case_1_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        case_1_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        case_1_jRadioButton.setText("Case 1,2,3... :");
        case_1_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_1_jRadioButtonActionPerformed(evt);
            }
        });

        code_jTextArea.setEditable(false);
        code_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        code_jTextArea.setColumns(20);
        code_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        code_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        code_jTextArea.setRows(5);
        jScrollPane2.setViewportView(code_jTextArea);

        generate_jButton.setBackground(new java.awt.Color(51, 255, 51));
        generate_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generate_jButton.setForeground(new java.awt.Color(0, 0, 0));
        generate_jButton.setText("GENERATE CODE");
        generate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_jButtonActionPerformed(evt);
            }
        });

        case_A_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(case_A_jRadioButton);
        case_A_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        case_A_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        case_A_jRadioButton.setText("Case 'A','B'... :");
        case_A_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_A_jRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title_jLabel)
                .addGap(213, 213, 213))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(case_1_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(case_A_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(case_1_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(case_A_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void case_1_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_1_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_1_jRadioButtonActionPerformed

    private void generate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_jButtonActionPerformed
        // TODO add your handling code here:
        
        Utility util = new Utility();
        
        if(case_1_jRadioButton.isSelected() == true){
            String line = util.read("Switch_Demo.txt");
            code_jTextArea.setText(line);
        }else if(case_A_jRadioButton.isSelected() == true){
            String line = util.read("Switch_Demo2.txt");
            code_jTextArea.setText(line);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
    }//GEN-LAST:event_generate_jButtonActionPerformed

    private void case_A_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_A_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_A_jRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Switch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton case_1_jRadioButton;
    private javax.swing.JRadioButton case_A_jRadioButton;
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.JButton generate_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea theory_jTextArea;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration//GEN-END:variables
}
