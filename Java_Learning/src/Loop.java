
import javax.swing.JOptionPane;

public class Loop extends javax.swing.JFrame {

    
    public Loop() {
        initComponents();
        initComponents2();
    }

    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("Loop");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("Loops.txt");
        theory_jTextArea.setText(line);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loop_buttonGroup = new javax.swing.ButtonGroup();
        title_jPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        generate_jButton = new javax.swing.JButton();
        forLoop_jRadioButton = new javax.swing.JRadioButton();
        forEachLoop_jRadioButton = new javax.swing.JRadioButton();
        while_jRadioButton = new javax.swing.JRadioButton();
        do_While_jRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        theory_jTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(WIDTH);

        title_jPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOOP");

        generate_jButton.setBackground(new java.awt.Color(51, 255, 51));
        generate_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generate_jButton.setForeground(new java.awt.Color(0, 0, 0));
        generate_jButton.setText("GENERATE CODE");
        generate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_jButtonActionPerformed(evt);
            }
        });

        forLoop_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        loop_buttonGroup.add(forLoop_jRadioButton);
        forLoop_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        forLoop_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        forLoop_jRadioButton.setText("For Loop");

        forEachLoop_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        loop_buttonGroup.add(forEachLoop_jRadioButton);
        forEachLoop_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        forEachLoop_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        forEachLoop_jRadioButton.setText("For Each Loop");
        forEachLoop_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forEachLoop_jRadioButtonActionPerformed(evt);
            }
        });

        while_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        loop_buttonGroup.add(while_jRadioButton);
        while_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        while_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        while_jRadioButton.setText("While Loop");
        while_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                while_jRadioButtonActionPerformed(evt);
            }
        });

        do_While_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        loop_buttonGroup.add(do_While_jRadioButton);
        do_While_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        do_While_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        do_While_jRadioButton.setText("Do-While Loop");
        do_While_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                do_While_jRadioButtonActionPerformed(evt);
            }
        });

        code_jTextArea.setEditable(false);
        code_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        code_jTextArea.setColumns(20);
        code_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        code_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        code_jTextArea.setRows(5);
        jScrollPane1.setViewportView(code_jTextArea);

        theory_jTextArea.setEditable(false);
        theory_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        theory_jTextArea.setColumns(20);
        theory_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        theory_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        theory_jTextArea.setRows(5);
        jScrollPane2.setViewportView(theory_jTextArea);

        javax.swing.GroupLayout title_jPanelLayout = new javax.swing.GroupLayout(title_jPanel);
        title_jPanel.setLayout(title_jPanelLayout);
        title_jPanelLayout.setHorizontalGroup(
            title_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_jPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(title_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_jPanelLayout.createSequentialGroup()
                        .addGroup(title_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(title_jPanelLayout.createSequentialGroup()
                                .addGroup(title_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(forEachLoop_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(do_While_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(forLoop_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(while_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_jPanelLayout.createSequentialGroup()
                        .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title_jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(248, 248, 248))))
        );
        title_jPanelLayout.setVerticalGroup(
            title_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_jPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(title_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(title_jPanelLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(forLoop_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forEachLoop_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(while_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(do_While_jRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(title_jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(generate_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_jButtonActionPerformed
        // TODO add your handling code here:

        Utility util = new Utility();
        
        
        if(forLoop_jRadioButton.isSelected() == true){
            String line = util.read("ForLoop.txt");
            code_jTextArea.setText(line);
        }else if(forEachLoop_jRadioButton.isSelected() == true){
            String line = util.read("ForEachLoop.txt");
            code_jTextArea.setText(line);
        }else if(while_jRadioButton.isSelected() == true){
            String line = util.read("WhileLoop.txt");
            code_jTextArea.setText(line);
        }else if(do_While_jRadioButton.isSelected() == true){
            String line = util.read("DoWhileLoop.txt");
            code_jTextArea.setText(line);
        }else{
            JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_generate_jButtonActionPerformed

    private void forEachLoop_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forEachLoop_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forEachLoop_jRadioButtonActionPerformed

    private void while_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_while_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_while_jRadioButtonActionPerformed

    private void do_While_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_do_While_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_do_While_jRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Loop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.JRadioButton do_While_jRadioButton;
    private javax.swing.JRadioButton forEachLoop_jRadioButton;
    private javax.swing.JRadioButton forLoop_jRadioButton;
    private javax.swing.JButton generate_jButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup loop_buttonGroup;
    private javax.swing.JTextArea theory_jTextArea;
    private javax.swing.JPanel title_jPanel;
    private javax.swing.JRadioButton while_jRadioButton;
    // End of variables declaration//GEN-END:variables
}
