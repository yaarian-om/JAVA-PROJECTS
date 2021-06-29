public class Introduction extends javax.swing.JFrame {

    
    public Introduction() {
        initComponents();
        initComponents2();
    }
    
     private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("Introduction");
        setDefaultCloseOperation(WIDTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dataType__jButton = new javax.swing.JButton();
        classObject_jButton = new javax.swing.JButton();
        variableType_jButton = new javax.swing.JButton();
        staticBlock_jButton = new javax.swing.JButton();
        stringScanner_jButton = new javax.swing.JButton();
        array_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INTRODUCTION");

        dataType__jButton.setBackground(new java.awt.Color(51, 255, 51));
        dataType__jButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dataType__jButton.setForeground(new java.awt.Color(0, 0, 0));
        dataType__jButton.setText("Data Type & Type Casting");
        dataType__jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataType__jButtonActionPerformed(evt);
            }
        });

        classObject_jButton.setBackground(new java.awt.Color(51, 255, 51));
        classObject_jButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        classObject_jButton.setForeground(new java.awt.Color(0, 0, 0));
        classObject_jButton.setText("Class & Object");
        classObject_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classObject_jButtonActionPerformed(evt);
            }
        });

        variableType_jButton.setBackground(new java.awt.Color(51, 255, 51));
        variableType_jButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        variableType_jButton.setForeground(new java.awt.Color(0, 0, 0));
        variableType_jButton.setText("Variable Types");
        variableType_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variableType_jButtonActionPerformed(evt);
            }
        });

        staticBlock_jButton.setBackground(new java.awt.Color(51, 255, 51));
        staticBlock_jButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        staticBlock_jButton.setForeground(new java.awt.Color(0, 0, 0));
        staticBlock_jButton.setText("Static Block");
        staticBlock_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticBlock_jButtonActionPerformed(evt);
            }
        });

        stringScanner_jButton.setBackground(new java.awt.Color(51, 255, 51));
        stringScanner_jButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        stringScanner_jButton.setForeground(new java.awt.Color(0, 0, 0));
        stringScanner_jButton.setText("String & Scanner");
        stringScanner_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stringScanner_jButtonActionPerformed(evt);
            }
        });

        array_jButton.setBackground(new java.awt.Color(51, 255, 51));
        array_jButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        array_jButton.setForeground(new java.awt.Color(0, 0, 0));
        array_jButton.setText("Array");
        array_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                array_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataType__jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classObject_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(variableType_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticBlock_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stringScanner_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(array_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataType__jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classObject_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variableType_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticBlock_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stringScanner_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(array_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
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

    private void array_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_array_jButtonActionPerformed
        // TODO add your handling code here:
        
        
        Array array = new Array();
        
        
    }//GEN-LAST:event_array_jButtonActionPerformed

    private void stringScanner_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stringScanner_jButtonActionPerformed
        // TODO add your handling code here:
        
        String_and_Scanner ss = new String_and_Scanner();
        
    }//GEN-LAST:event_stringScanner_jButtonActionPerformed

    private void dataType__jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataType__jButtonActionPerformed
        // TODO add your handling code here:
        
        DataType_TypeCasting dttc = new DataType_TypeCasting();
        
        
        
        
    }//GEN-LAST:event_dataType__jButtonActionPerformed

    private void variableType_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variableType_jButtonActionPerformed
        // TODO add your handling code here:
        Variable_Types vt = new Variable_Types();
    }//GEN-LAST:event_variableType_jButtonActionPerformed

    private void classObject_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classObject_jButtonActionPerformed
        // TODO add your handling code here:
        Class_Object co =new Class_Object();
        
    }//GEN-LAST:event_classObject_jButtonActionPerformed

    private void staticBlock_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticBlock_jButtonActionPerformed
        // TODO add your handling code here:
        Static_Block sb = new Static_Block();
        
    }//GEN-LAST:event_staticBlock_jButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Introduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Introduction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton array_jButton;
    private javax.swing.JButton classObject_jButton;
    private javax.swing.JButton dataType__jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton staticBlock_jButton;
    private javax.swing.JButton stringScanner_jButton;
    private javax.swing.JButton variableType_jButton;
    // End of variables declaration//GEN-END:variables
}
