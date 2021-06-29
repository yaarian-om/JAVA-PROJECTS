
import javax.swing.JOptionPane;


public class Polymorphism extends javax.swing.JFrame {

    
    public Polymorphism() {
        initComponents();
        initComponents2();
    }

    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("POLYMORPHISM");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("Polymorphism.txt");
        theory_textArea.setText(line);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        polymorphism_buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        generate_jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        theory_textArea = new javax.swing.JTextArea();
        title_jLabel = new javax.swing.JLabel();
        overloading_jRadioButton = new javax.swing.JRadioButton();
        overriding_jRadioButton = new javax.swing.JRadioButton();
        cOverloading_jRadioButton = new javax.swing.JRadioButton();
        behave_jRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(WIDTH);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

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

        theory_textArea.setEditable(false);
        theory_textArea.setBackground(new java.awt.Color(255, 255, 255));
        theory_textArea.setColumns(20);
        theory_textArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        theory_textArea.setForeground(new java.awt.Color(0, 0, 0));
        theory_textArea.setRows(5);
        jScrollPane1.setViewportView(theory_textArea);

        title_jLabel.setBackground(new java.awt.Color(0, 0, 0));
        title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_jLabel.setText("POLYMORPHISM");

        overloading_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        polymorphism_buttonGroup.add(overloading_jRadioButton);
        overloading_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        overloading_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        overloading_jRadioButton.setText("Method Overloading");
        overloading_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overloading_jRadioButtonActionPerformed(evt);
            }
        });

        overriding_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        polymorphism_buttonGroup.add(overriding_jRadioButton);
        overriding_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        overriding_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        overriding_jRadioButton.setText("Method Overriding");

        cOverloading_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        polymorphism_buttonGroup.add(cOverloading_jRadioButton);
        cOverloading_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cOverloading_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        cOverloading_jRadioButton.setText("Constructor Overloading");
        cOverloading_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cOverloading_jRadioButtonActionPerformed(evt);
            }
        });

        behave_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        polymorphism_buttonGroup.add(behave_jRadioButton);
        behave_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        behave_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        behave_jRadioButton.setText("Polymorphic Behavior");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cOverloading_jRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(overriding_jRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(overloading_jRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(behave_jRadioButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title_jLabel)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(generate_jButton)
                        .addGap(219, 219, 219))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(title_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(overloading_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(overriding_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cOverloading_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(behave_jRadioButton)
                        .addGap(117, 117, 117))))
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
       if(overloading_jRadioButton.isSelected() == true){
           String line = util.read("Method_Overloading.txt");
           code_jTextArea.setText(line);
       }else if(overriding_jRadioButton.isSelected() == true){
           String line = util.read("Method_Overriding_Demo.txt");
           code_jTextArea.setText(line);
       }else if(cOverloading_jRadioButton.isSelected() == true){
           String line = util.read("Constructor_Overloading.txt");
           code_jTextArea.setText(line);
       }else if(behave_jRadioButton.isSelected() == true){
           String line = util.read("Behave_Demo.txt");
           code_jTextArea.setText(line);
       }else {
           JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_generate_jButtonActionPerformed

    private void overloading_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overloading_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overloading_jRadioButtonActionPerformed

    private void cOverloading_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cOverloading_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cOverloading_jRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Polymorphism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polymorphism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polymorphism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polymorphism.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polymorphism().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton behave_jRadioButton;
    private javax.swing.JRadioButton cOverloading_jRadioButton;
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.JButton generate_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton overloading_jRadioButton;
    private javax.swing.JRadioButton overriding_jRadioButton;
    private javax.swing.ButtonGroup polymorphism_buttonGroup;
    private javax.swing.JTextArea theory_textArea;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration//GEN-END:variables
}
