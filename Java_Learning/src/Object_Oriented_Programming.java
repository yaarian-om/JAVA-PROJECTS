
public class Object_Oriented_Programming extends javax.swing.JFrame {

   
    public Object_Oriented_Programming() {
        initComponents();
        initComponents2();
    }
    
    
    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("OBJECT ORIENTED PROGRAMMING");
        setDefaultCloseOperation(WIDTH); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_jPanel = new javax.swing.JPanel();
        oop_JLabel = new javax.swing.JLabel();
        encapsulation_jButton = new javax.swing.JButton();
        inheritance_jButton = new javax.swing.JButton();
        abstraction_jButton = new javax.swing.JButton();
        polymorphism_jButton = new javax.swing.JButton();
        association_jButton = new javax.swing.JButton();
        final_jButton = new javax.swing.JButton();
        interface_jButton = new javax.swing.JButton();
        package_jButton = new javax.swing.JButton();
        exception_jButton = new javax.swing.JButton();
        file_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(WIDTH);

        main_jPanel.setBackground(new java.awt.Color(0, 0, 0));

        oop_JLabel.setBackground(new java.awt.Color(0, 0, 0));
        oop_JLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        oop_JLabel.setForeground(new java.awt.Color(255, 255, 255));
        oop_JLabel.setText("Object Oriented Programming");

        encapsulation_jButton.setBackground(new java.awt.Color(51, 255, 51));
        encapsulation_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        encapsulation_jButton.setForeground(new java.awt.Color(0, 0, 0));
        encapsulation_jButton.setText("Encapsulation");
        encapsulation_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encapsulation_jButtonActionPerformed(evt);
            }
        });

        inheritance_jButton.setBackground(new java.awt.Color(51, 255, 51));
        inheritance_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        inheritance_jButton.setForeground(new java.awt.Color(0, 0, 0));
        inheritance_jButton.setText("Inheritance");
        inheritance_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inheritance_jButtonActionPerformed(evt);
            }
        });

        abstraction_jButton.setBackground(new java.awt.Color(51, 255, 51));
        abstraction_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        abstraction_jButton.setForeground(new java.awt.Color(0, 0, 0));
        abstraction_jButton.setText("Abstraction");
        abstraction_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abstraction_jButtonActionPerformed(evt);
            }
        });

        polymorphism_jButton.setBackground(new java.awt.Color(51, 255, 51));
        polymorphism_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        polymorphism_jButton.setForeground(new java.awt.Color(0, 0, 0));
        polymorphism_jButton.setText("Polymorphism");
        polymorphism_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polymorphism_jButtonActionPerformed(evt);
            }
        });

        association_jButton.setBackground(new java.awt.Color(51, 255, 51));
        association_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        association_jButton.setForeground(new java.awt.Color(0, 0, 0));
        association_jButton.setText("Association");
        association_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                association_jButtonActionPerformed(evt);
            }
        });

        final_jButton.setBackground(new java.awt.Color(51, 255, 51));
        final_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        final_jButton.setForeground(new java.awt.Color(0, 0, 0));
        final_jButton.setText("Final Keyword");
        final_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                final_jButtonActionPerformed(evt);
            }
        });

        interface_jButton.setBackground(new java.awt.Color(51, 255, 51));
        interface_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        interface_jButton.setForeground(new java.awt.Color(0, 0, 0));
        interface_jButton.setText("Interface");
        interface_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interface_jButtonActionPerformed(evt);
            }
        });

        package_jButton.setBackground(new java.awt.Color(51, 255, 51));
        package_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        package_jButton.setForeground(new java.awt.Color(0, 0, 0));
        package_jButton.setText("Package");
        package_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                package_jButtonActionPerformed(evt);
            }
        });

        exception_jButton.setBackground(new java.awt.Color(51, 255, 51));
        exception_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exception_jButton.setForeground(new java.awt.Color(0, 0, 0));
        exception_jButton.setText("Exception Handling");
        exception_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exception_jButtonActionPerformed(evt);
            }
        });

        file_jButton.setBackground(new java.awt.Color(51, 255, 51));
        file_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        file_jButton.setForeground(new java.awt.Color(0, 0, 0));
        file_jButton.setText("File i.o");
        file_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_jPanelLayout = new javax.swing.GroupLayout(main_jPanel);
        main_jPanel.setLayout(main_jPanelLayout);
        main_jPanelLayout.setHorizontalGroup(
            main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oop_JLabel)
                .addContainerGap())
            .addGroup(main_jPanelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(file_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exception_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(package_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interface_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(final_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(association_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polymorphism_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abstraction_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inheritance_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encapsulation_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_jPanelLayout.setVerticalGroup(
            main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_jPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(oop_JLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encapsulation_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inheritance_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abstraction_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(polymorphism_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(association_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(final_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interface_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(package_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exception_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(file_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inheritance_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inheritance_jButtonActionPerformed
        Inheritance i = new Inheritance();
    }//GEN-LAST:event_inheritance_jButtonActionPerformed

    private void abstraction_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abstraction_jButtonActionPerformed
        Abstraction ab = new Abstraction();
    }//GEN-LAST:event_abstraction_jButtonActionPerformed

    private void polymorphism_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polymorphism_jButtonActionPerformed
        Polymorphism p = new Polymorphism();
    }//GEN-LAST:event_polymorphism_jButtonActionPerformed

    private void association_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_association_jButtonActionPerformed
        Association a = new Association();
    }//GEN-LAST:event_association_jButtonActionPerformed

    private void final_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_final_jButtonActionPerformed
        Final f = new Final();
    }//GEN-LAST:event_final_jButtonActionPerformed

    private void interface_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interface_jButtonActionPerformed
        Interface i = new Interface();
    }//GEN-LAST:event_interface_jButtonActionPerformed

    private void package_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_package_jButtonActionPerformed
        Package p = new Package();
    }//GEN-LAST:event_package_jButtonActionPerformed

    private void exception_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exception_jButtonActionPerformed
        Exception e = new Exception();
    }//GEN-LAST:event_exception_jButtonActionPerformed

    private void file_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_jButtonActionPerformed
        File file = new File();
    }//GEN-LAST:event_file_jButtonActionPerformed

    private void encapsulation_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encapsulation_jButtonActionPerformed
        Encapsulation e = new Encapsulation();
    }//GEN-LAST:event_encapsulation_jButtonActionPerformed

   
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
            java.util.logging.Logger.getLogger(Object_Oriented_Programming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Object_Oriented_Programming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Object_Oriented_Programming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Object_Oriented_Programming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Object_Oriented_Programming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abstraction_jButton;
    private javax.swing.JButton association_jButton;
    private javax.swing.JButton encapsulation_jButton;
    private javax.swing.JButton exception_jButton;
    private javax.swing.JButton file_jButton;
    private javax.swing.JButton final_jButton;
    private javax.swing.JButton inheritance_jButton;
    private javax.swing.JButton interface_jButton;
    private javax.swing.JPanel main_jPanel;
    private javax.swing.JLabel oop_JLabel;
    private javax.swing.JButton package_jButton;
    private javax.swing.JButton polymorphism_jButton;
    // End of variables declaration//GEN-END:variables
}
