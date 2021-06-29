import javax.swing.JOptionPane;
public class Array extends javax.swing.JFrame {

    
    public Array() {
        initComponents();
        initComponents2();
    }
    
    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("ARRAY");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("ArrayExample.txt");
        array_textArea.setText(line);
    }

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        array_Title_jLabel = new javax.swing.JLabel();
        generate_Code_jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        array_textArea = new javax.swing.JTextArea();
        array_jRadioButton = new javax.swing.JRadioButton();
        arrayList_jRadioButton = new javax.swing.JRadioButton();
        matrix_jRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        array_Title_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        array_Title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        array_Title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        array_Title_jLabel.setText("ARRAY");

        generate_Code_jButton.setBackground(new java.awt.Color(51, 255, 51));
        generate_Code_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generate_Code_jButton.setForeground(new java.awt.Color(0, 0, 0));
        generate_Code_jButton.setText("GENERATE CODE");
        generate_Code_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_Code_jButtonActionPerformed(evt);
            }
        });

        code_jTextArea.setEditable(false);
        code_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        code_jTextArea.setColumns(20);
        code_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        code_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        code_jTextArea.setRows(5);
        jScrollPane1.setViewportView(code_jTextArea);

        array_textArea.setEditable(false);
        array_textArea.setBackground(new java.awt.Color(255, 255, 255));
        array_textArea.setColumns(20);
        array_textArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        array_textArea.setRows(5);
        jScrollPane2.setViewportView(array_textArea);

        array_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(array_jRadioButton);
        array_jRadioButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        array_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        array_jRadioButton.setText("Array Introduction");

        arrayList_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(arrayList_jRadioButton);
        arrayList_jRadioButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        arrayList_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        arrayList_jRadioButton.setText("ArrayList");

        matrix_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(matrix_jRadioButton);
        matrix_jRadioButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        matrix_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        matrix_jRadioButton.setText("Matrix");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(arrayList_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matrix_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(array_jRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(generate_Code_jButton)
                .addContainerGap(282, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(array_Title_jLabel)
                .addGap(269, 269, 269))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(array_Title_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(generate_Code_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(array_jRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(arrayList_jRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(matrix_jRadioButton)
                        .addGap(81, 81, 81))))
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

    private void generate_Code_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_Code_jButtonActionPerformed
        // TODO add your handling code here:\\\
        
        
        Utility util = new Utility();
        
        if(array_jRadioButton.isSelected() == true){
          String line = util.read("Array.txt");
          code_jTextArea.setText(line);
        }else if(arrayList_jRadioButton.isSelected() == true){
          String line = util.read("ArrayLists_Demo.txt");
          code_jTextArea.setText(line);
        }else if(matrix_jRadioButton.isSelected() == true){
          String line = util.read("Matrix.txt");
          code_jTextArea.setText(line);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_generate_Code_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Array().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton arrayList_jRadioButton;
    private javax.swing.JLabel array_Title_jLabel;
    private javax.swing.JRadioButton array_jRadioButton;
    private javax.swing.JTextArea array_textArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.JButton generate_Code_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton matrix_jRadioButton;
    // End of variables declaration//GEN-END:variables
}
