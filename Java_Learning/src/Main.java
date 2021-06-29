


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        initComponents2();
    }
    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("Java Learning");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        main_Title_jLabel = new javax.swing.JLabel();
        introduction_jButton = new javax.swing.JButton();
        basic_jButton = new javax.swing.JButton();
        oop_jButton = new javax.swing.JButton();
        project_jButton = new javax.swing.JButton();
        examples_jButton = new javax.swing.JButton();
        support_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        main_Title_jLabel.setBackground(new java.awt.Color(0, 0, 0));
        main_Title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        main_Title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        main_Title_jLabel.setText("Welcome to Java Learning");

        introduction_jButton.setBackground(new java.awt.Color(51, 255, 51));
        introduction_jButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        introduction_jButton.setForeground(new java.awt.Color(0, 0, 0));
        introduction_jButton.setText("Intoduction");
        introduction_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introduction_jButtonActionPerformed(evt);
            }
        });

        basic_jButton.setBackground(new java.awt.Color(51, 255, 51));
        basic_jButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        basic_jButton.setForeground(new java.awt.Color(0, 0, 0));
        basic_jButton.setText("Basic");
        basic_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basic_jButtonActionPerformed(evt);
            }
        });

        oop_jButton.setBackground(new java.awt.Color(51, 255, 51));
        oop_jButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        oop_jButton.setForeground(new java.awt.Color(0, 0, 0));
        oop_jButton.setText("Object Oriented Programming");
        oop_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oop_jButtonActionPerformed(evt);
            }
        });

        project_jButton.setBackground(new java.awt.Color(51, 255, 51));
        project_jButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        project_jButton.setForeground(new java.awt.Color(0, 0, 0));
        project_jButton.setText("Projects Ideas");
        project_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                project_jButtonActionPerformed(evt);
            }
        });

        examples_jButton.setBackground(new java.awt.Color(51, 255, 51));
        examples_jButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        examples_jButton.setForeground(new java.awt.Color(0, 0, 0));
        examples_jButton.setText("Examples");
        examples_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examples_jButtonActionPerformed(evt);
            }
        });

        support_jLabel.setBackground(new java.awt.Color(0, 0, 0));
        support_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        support_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        support_jLabel.setText("SUPPORT");
        support_jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                support_jLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(project_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oop_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(introduction_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(basic_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(examples_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(main_Title_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(support_jLabel)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(main_Title_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(introduction_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basic_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(examples_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oop_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(project_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(support_jLabel)
                .addContainerGap())
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

    private void introduction_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introduction_jButtonActionPerformed
        // TODO add your handling code here:
        Introduction intro = new Introduction();
    }//GEN-LAST:event_introduction_jButtonActionPerformed

    private void examples_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examples_jButtonActionPerformed
        // TODO add your handling code here:
        
        Examples ex = new Examples();
        
    }//GEN-LAST:event_examples_jButtonActionPerformed

    private void basic_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basic_jButtonActionPerformed
        // TODO add your handling code here:
        
        Basic b = new Basic();
        
    }//GEN-LAST:event_basic_jButtonActionPerformed

    private void oop_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oop_jButtonActionPerformed
        // TODO add your handling code here:
        Object_Oriented_Programming oop = new Object_Oriented_Programming();
    }//GEN-LAST:event_oop_jButtonActionPerformed

    private void project_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_project_jButtonActionPerformed
       Project_Idea pi = new Project_Idea();
    }//GEN-LAST:event_project_jButtonActionPerformed

    private void support_jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_support_jLabelMouseClicked
        About_US au = new About_US();
    }//GEN-LAST:event_support_jLabelMouseClicked

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basic_jButton;
    private javax.swing.JButton examples_jButton;
    private javax.swing.JButton introduction_jButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_Title_jLabel;
    private javax.swing.JButton oop_jButton;
    private javax.swing.JButton project_jButton;
    private javax.swing.JLabel support_jLabel;
    // End of variables declaration//GEN-END:variables
}
