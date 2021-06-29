
import javax.swing.JOptionPane;


public class Association extends javax.swing.JFrame {

    public Association() {
        initComponents();
        initComponents2();
    }
    
    
    
     private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("ASSOCIATION");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("Association.txt");
        theory_textArea.setText(line);
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        association_uttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        title_jLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        theory_textArea = new javax.swing.JTextArea();
        generate_jButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        oneTOone_jRadioButton = new javax.swing.JRadioButton();
        oneTOmany_jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(WIDTH);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_jLabel.setText("ASSOCIATION");

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

        oneTOone_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        association_uttonGroup.add(oneTOone_jRadioButton);
        oneTOone_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        oneTOone_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        oneTOone_jRadioButton.setText("One to One");

        oneTOmany_jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        association_uttonGroup.add(oneTOmany_jRadioButton1);
        oneTOmany_jRadioButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        oneTOmany_jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        oneTOmany_jRadioButton1.setText("One to Many");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title_jLabel)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oneTOone_jRadioButton)
                                    .addComponent(oneTOmany_jRadioButton1))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(generate_jButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(oneTOone_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oneTOmany_jRadioButton1)
                        .addGap(141, 141, 141))))
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
        if(oneTOone_jRadioButton.isSelected() == true){
            String line =  util.read("Association_Demo.txt");
            code_jTextArea.setText(line);
        }else if(oneTOmany_jRadioButton1.isSelected()== true){
            String line =  util.read("Associatios.txt");
            code_jTextArea.setText(line);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_generate_jButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Association.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Association.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Association.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Association.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Association().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup association_uttonGroup;
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.JButton generate_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton oneTOmany_jRadioButton1;
    private javax.swing.JRadioButton oneTOone_jRadioButton;
    private javax.swing.JTextArea theory_textArea;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration//GEN-END:variables
}
