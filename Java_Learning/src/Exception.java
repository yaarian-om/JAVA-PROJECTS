
import javax.swing.JOptionPane;

public class Exception extends javax.swing.JFrame {

    
    public Exception() {
        initComponents();
        initComponents2();
    }

    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("EXCEPTION");
        setDefaultCloseOperation(WIDTH);
        
        Utility utilities = new Utility();
        System.out.println("Sending file path");
        String line = utilities.read("Excaptionss.txt");
        theory_jTextArea.setText(line);
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exception_buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        title_jLabel = new javax.swing.JLabel();
        arithmatic_jRadioButton = new javax.swing.JRadioButton();
        array_jRadioButton = new javax.swing.JRadioButton();
        class_jRadioButton2 = new javax.swing.JRadioButton();
        file_jRadioButton3 = new javax.swing.JRadioButton();
        io_jRadioButton4 = new javax.swing.JRadioButton();
        interrupt_jRadioButton5 = new javax.swing.JRadioButton();
        noSuchFile_jRadioButton6 = new javax.swing.JRadioButton();
        noSuchMethod_jRadioButton7 = new javax.swing.JRadioButton();
        string_jRadioButton12 = new javax.swing.JRadioButton();
        runTime_jRadioButton13 = new javax.swing.JRadioButton();
        numberFormat_jRadioButton14 = new javax.swing.JRadioButton();
        null_jRadioButton15 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        theory_jTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        code_jTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(WIDTH);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_jLabel.setText("EXCEPTION HANDLING");

        arithmatic_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(arithmatic_jRadioButton);
        arithmatic_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        arithmatic_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        arithmatic_jRadioButton.setText("ArithmeticException ");
        arithmatic_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arithmatic_jRadioButtonActionPerformed(evt);
            }
        });

        array_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(array_jRadioButton);
        array_jRadioButton.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        array_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        array_jRadioButton.setText("ArrayIndexOutOfBounds");
        array_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                array_jRadioButtonActionPerformed(evt);
            }
        });

        class_jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(class_jRadioButton2);
        class_jRadioButton2.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        class_jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        class_jRadioButton2.setText("ClassNotFound");
        class_jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_jRadioButton2ActionPerformed(evt);
            }
        });

        file_jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(file_jRadioButton3);
        file_jRadioButton3.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        file_jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        file_jRadioButton3.setText("FileNotFound");
        file_jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_jRadioButton3ActionPerformed(evt);
            }
        });

        io_jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(io_jRadioButton4);
        io_jRadioButton4.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        io_jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        io_jRadioButton4.setText("IOException ");
        io_jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_jRadioButton4ActionPerformed(evt);
            }
        });

        interrupt_jRadioButton5.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(interrupt_jRadioButton5);
        interrupt_jRadioButton5.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        interrupt_jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        interrupt_jRadioButton5.setText("InterruptedException ");
        interrupt_jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interrupt_jRadioButton5ActionPerformed(evt);
            }
        });

        noSuchFile_jRadioButton6.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(noSuchFile_jRadioButton6);
        noSuchFile_jRadioButton6.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        noSuchFile_jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        noSuchFile_jRadioButton6.setText("NoSuchFieldException");
        noSuchFile_jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSuchFile_jRadioButton6ActionPerformed(evt);
            }
        });

        noSuchMethod_jRadioButton7.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(noSuchMethod_jRadioButton7);
        noSuchMethod_jRadioButton7.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        noSuchMethod_jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        noSuchMethod_jRadioButton7.setText("NoSuchMethod");
        noSuchMethod_jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSuchMethod_jRadioButton7ActionPerformed(evt);
            }
        });

        string_jRadioButton12.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(string_jRadioButton12);
        string_jRadioButton12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        string_jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        string_jRadioButton12.setText("StringIndexOutOfBounds");
        string_jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                string_jRadioButton12ActionPerformed(evt);
            }
        });

        runTime_jRadioButton13.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(runTime_jRadioButton13);
        runTime_jRadioButton13.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        runTime_jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        runTime_jRadioButton13.setText("RuntimeException");
        runTime_jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runTime_jRadioButton13ActionPerformed(evt);
            }
        });

        numberFormat_jRadioButton14.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(numberFormat_jRadioButton14);
        numberFormat_jRadioButton14.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        numberFormat_jRadioButton14.setForeground(new java.awt.Color(255, 255, 255));
        numberFormat_jRadioButton14.setText("NumberFormat");
        numberFormat_jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFormat_jRadioButton14ActionPerformed(evt);
            }
        });

        null_jRadioButton15.setBackground(new java.awt.Color(0, 0, 0));
        exception_buttonGroup.add(null_jRadioButton15);
        null_jRadioButton15.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        null_jRadioButton15.setForeground(new java.awt.Color(255, 255, 255));
        null_jRadioButton15.setText("NullPointerException");
        null_jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                null_jRadioButton15ActionPerformed(evt);
            }
        });

        theory_jTextArea.setEditable(false);
        theory_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        theory_jTextArea.setColumns(20);
        theory_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        theory_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        theory_jTextArea.setRows(5);
        jScrollPane3.setViewportView(theory_jTextArea);

        code_jTextArea.setEditable(false);
        code_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        code_jTextArea.setColumns(20);
        code_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        code_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        code_jTextArea.setRows(5);
        jScrollPane4.setViewportView(code_jTextArea);

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("GENERATE CODE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(arithmatic_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(class_jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(file_jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(io_jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(interrupt_jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noSuchFile_jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noSuchMethod_jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(null_jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numberFormat_jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(runTime_jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(string_jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(array_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(title_jLabel)
                                .addGap(67, 67, 67))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(arithmatic_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(array_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(class_jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(file_jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(io_jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(interrupt_jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noSuchFile_jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noSuchMethod_jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(null_jRadioButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberFormat_jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(runTime_jRadioButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(string_jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void arithmatic_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arithmatic_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arithmatic_jRadioButtonActionPerformed

    private void array_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_array_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_array_jRadioButtonActionPerformed

    private void class_jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class_jRadioButton2ActionPerformed

    private void file_jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_jRadioButton3ActionPerformed

    private void io_jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_io_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_io_jRadioButton4ActionPerformed

    private void interrupt_jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interrupt_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interrupt_jRadioButton5ActionPerformed

    private void noSuchFile_jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSuchFile_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noSuchFile_jRadioButton6ActionPerformed

    private void noSuchMethod_jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSuchMethod_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noSuchMethod_jRadioButton7ActionPerformed

    private void string_jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_string_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_string_jRadioButton12ActionPerformed

    private void runTime_jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runTime_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runTime_jRadioButton13ActionPerformed

    private void numberFormat_jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFormat_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFormat_jRadioButton14ActionPerformed

    private void null_jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_null_jRadioButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_null_jRadioButton15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Utility util = new Utility();

        if(arithmatic_jRadioButton.isSelected() == true){String line = util.read("ArithmeticException .txt");code_jTextArea.setText(line);}
        else if(array_jRadioButton.isSelected() == true){String line = util.read("ArrayIndexOutOfBoundsException .txt");code_jTextArea.setText(line);}
        else if(class_jRadioButton2.isSelected() == true){String line = util.read("ClassNotFoundException .txt");code_jTextArea.setText(line);}
        else if(file_jRadioButton3.isSelected() == true){String line = util.read("FileNotFoundException.txt");code_jTextArea.setText(line);}
        else if(io_jRadioButton4.isSelected() == true){String line = util.read("IOException.txt");code_jTextArea.setText(line);}
        else if(interrupt_jRadioButton5.isSelected() == true){String line = util.read("InterruptedException.txt");code_jTextArea.setText(line);}
        else if(noSuchFile_jRadioButton6.isSelected() == true){String line = util.read("NoSuchFieldException.txt");code_jTextArea.setText(line);}
        else if(noSuchMethod_jRadioButton7.isSelected() == true){String line = util.read("NoSuchMethodException .txt");code_jTextArea.setText(line);}
        else if(null_jRadioButton15.isSelected() == true){String line = util.read("NullPointerException .txt");code_jTextArea.setText(line);}
        else if(numberFormat_jRadioButton14.isSelected() == true){String line = util.read("NumberFormatException.txt");code_jTextArea.setText(line);}
        else if(runTime_jRadioButton13.isSelected() == true){String line = util.read("RuntimeException.txt");code_jTextArea.setText(line);}
        else if(string_jRadioButton12.isSelected() == true){String line = util.read("StringIndexOutOfBoundException.txt");code_jTextArea.setText(line);}
        else{JOptionPane.showMessageDialog(null, "Please Select an Option First","Option Not Found",JOptionPane.ERROR_MESSAGE);}

    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Exception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton arithmatic_jRadioButton;
    private javax.swing.JRadioButton array_jRadioButton;
    private javax.swing.JRadioButton class_jRadioButton2;
    private javax.swing.JTextArea code_jTextArea;
    private javax.swing.ButtonGroup exception_buttonGroup;
    private javax.swing.JRadioButton file_jRadioButton3;
    private javax.swing.JRadioButton interrupt_jRadioButton5;
    private javax.swing.JRadioButton io_jRadioButton4;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton noSuchFile_jRadioButton6;
    private javax.swing.JRadioButton noSuchMethod_jRadioButton7;
    private javax.swing.JRadioButton null_jRadioButton15;
    private javax.swing.JRadioButton numberFormat_jRadioButton14;
    private javax.swing.JRadioButton runTime_jRadioButton13;
    private javax.swing.JRadioButton string_jRadioButton12;
    private javax.swing.JTextArea theory_jTextArea;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration//GEN-END:variables
}
