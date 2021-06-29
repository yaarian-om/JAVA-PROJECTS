
import javax.swing.JOptionPane;

public class Examples extends javax.swing.JFrame {

    public Examples() {
        initComponents();
        initComponents2();
    }

    
    private void initComponents2(){
        setVisible(true);
        setResizable(false);
        setTitle("EXAMPLES");
        setDefaultCloseOperation(WIDTH);
    }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        example_buttonGroup = new javax.swing.ButtonGroup();
        example_jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        armstrong_Number_jRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        example_jTextArea = new javax.swing.JTextArea();
        bitwiseOperator_jRadioButton = new javax.swing.JRadioButton();
        cap_Small_jRadioButton = new javax.swing.JRadioButton();
        vowel_Consonant_jRadioButton = new javax.swing.JRadioButton();
        circle_Area_jRadioButton = new javax.swing.JRadioButton();
        even_Odd_jRadioButton = new javax.swing.JRadioButton();
        factorial_jRadioButton = new javax.swing.JRadioButton();
        fibonacci_jRadioButton = new javax.swing.JRadioButton();
        mult_table_jRadioButton = new javax.swing.JRadioButton();
        Palindrome_Number_jRadioButton = new javax.swing.JRadioButton();
        prime_Demo_jRadioButton = new javax.swing.JRadioButton();
        random_jRadioButton = new javax.swing.JRadioButton();
        reverse_a_Number_jRadioButton = new javax.swing.JRadioButton();
        square_Linear_Series_jRadioButton = new javax.swing.JRadioButton();
        temperature_jRadioButton = new javax.swing.JRadioButton();
        ternary_Operator_jRadioButton = new javax.swing.JRadioButton();
        triangle_Area_jRadioButton = new javax.swing.JRadioButton();
        generate_jButton = new javax.swing.JButton();
        arithmatic_jRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(WIDTH);

        example_jPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EXAMPLES");

        armstrong_Number_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(armstrong_Number_jRadioButton);
        armstrong_Number_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        armstrong_Number_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        armstrong_Number_jRadioButton.setText("Armstrong Number");

        example_jTextArea.setEditable(false);
        example_jTextArea.setBackground(new java.awt.Color(255, 255, 255));
        example_jTextArea.setColumns(20);
        example_jTextArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        example_jTextArea.setForeground(new java.awt.Color(0, 0, 0));
        example_jTextArea.setRows(5);
        jScrollPane1.setViewportView(example_jTextArea);

        bitwiseOperator_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(bitwiseOperator_jRadioButton);
        bitwiseOperator_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bitwiseOperator_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        bitwiseOperator_jRadioButton.setText("BitwiseOperator");

        cap_Small_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(cap_Small_jRadioButton);
        cap_Small_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cap_Small_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        cap_Small_jRadioButton.setText("Capital Letter/Small Letter");

        vowel_Consonant_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(vowel_Consonant_jRadioButton);
        vowel_Consonant_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vowel_Consonant_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        vowel_Consonant_jRadioButton.setText("Checking Vowel Constant");
        vowel_Consonant_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vowel_Consonant_jRadioButtonActionPerformed(evt);
            }
        });

        circle_Area_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(circle_Area_jRadioButton);
        circle_Area_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        circle_Area_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        circle_Area_jRadioButton.setText("Circle Area");
        circle_Area_jRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circle_Area_jRadioButtonActionPerformed(evt);
            }
        });

        even_Odd_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(even_Odd_jRadioButton);
        even_Odd_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        even_Odd_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        even_Odd_jRadioButton.setText("Even Odd Checking");

        factorial_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(factorial_jRadioButton);
        factorial_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        factorial_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        factorial_jRadioButton.setText("Factorial Demo");

        fibonacci_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(fibonacci_jRadioButton);
        fibonacci_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fibonacci_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        fibonacci_jRadioButton.setText("Fiboacci Demo");

        mult_table_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(mult_table_jRadioButton);
        mult_table_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mult_table_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        mult_table_jRadioButton.setText("Multiplication Demo");

        Palindrome_Number_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(Palindrome_Number_jRadioButton);
        Palindrome_Number_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Palindrome_Number_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        Palindrome_Number_jRadioButton.setText("Palindrome Number");

        prime_Demo_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(prime_Demo_jRadioButton);
        prime_Demo_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        prime_Demo_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        prime_Demo_jRadioButton.setText("Prime Demo");

        random_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(random_jRadioButton);
        random_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        random_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        random_jRadioButton.setText("Random Number");

        reverse_a_Number_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(reverse_a_Number_jRadioButton);
        reverse_a_Number_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reverse_a_Number_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        reverse_a_Number_jRadioButton.setText("Reverse A Number");

        square_Linear_Series_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(square_Linear_Series_jRadioButton);
        square_Linear_Series_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        square_Linear_Series_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        square_Linear_Series_jRadioButton.setText("Square Linear Series");

        temperature_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(temperature_jRadioButton);
        temperature_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        temperature_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        temperature_jRadioButton.setText("Temperature");

        ternary_Operator_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(ternary_Operator_jRadioButton);
        ternary_Operator_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ternary_Operator_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        ternary_Operator_jRadioButton.setText("Ternary Operator");

        triangle_Area_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(triangle_Area_jRadioButton);
        triangle_Area_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        triangle_Area_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        triangle_Area_jRadioButton.setText("Triangle Area");

        generate_jButton.setBackground(new java.awt.Color(51, 255, 51));
        generate_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        generate_jButton.setForeground(new java.awt.Color(0, 0, 0));
        generate_jButton.setText("GENERATE CODE");
        generate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_jButtonActionPerformed(evt);
            }
        });

        arithmatic_jRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        example_buttonGroup.add(arithmatic_jRadioButton);
        arithmatic_jRadioButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        arithmatic_jRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        arithmatic_jRadioButton.setText("Arithmetic Demo");

        javax.swing.GroupLayout example_jPanelLayout = new javax.swing.GroupLayout(example_jPanel);
        example_jPanel.setLayout(example_jPanelLayout);
        example_jPanelLayout.setHorizontalGroup(
            example_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, example_jPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(example_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bitwiseOperator_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(armstrong_Number_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap_Small_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vowel_Consonant_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(circle_Area_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(even_Odd_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(factorial_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fibonacci_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mult_table_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Palindrome_Number_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prime_Demo_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(random_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reverse_a_Number_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(square_Linear_Series_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(temperature_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ternary_Operator_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(triangle_Area_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arithmatic_jRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, example_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(example_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, example_jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, example_jPanelLayout.createSequentialGroup()
                        .addComponent(generate_jButton)
                        .addGap(239, 239, 239))))
        );
        example_jPanelLayout.setVerticalGroup(
            example_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(example_jPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(example_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(example_jPanelLayout.createSequentialGroup()
                        .addComponent(arithmatic_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(armstrong_Number_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bitwiseOperator_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cap_Small_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vowel_Consonant_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(circle_Area_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(even_Odd_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(factorial_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fibonacci_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mult_table_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Palindrome_Number_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prime_Demo_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(random_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reverse_a_Number_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(square_Linear_Series_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temperature_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ternary_Operator_jRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(triangle_Area_jRadioButton))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generate_jButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(example_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(example_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vowel_Consonant_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vowel_Consonant_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vowel_Consonant_jRadioButtonActionPerformed

    private void generate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_jButtonActionPerformed
        // TODO add your handling code here:
        Utility util = new Utility();
        if(arithmatic_jRadioButton.isSelected() == true){String line =util.read("Arithmetic_Demo.txt");example_jTextArea.setText(line);}
        else if(armstrong_Number_jRadioButton.isSelected() == true){String line =util.read("Armstrong_Number.txt");example_jTextArea.setText(line);}
        else if(bitwiseOperator_jRadioButton.isSelected() == true){String line =util.read("BitwiseOperator.txt");example_jTextArea.setText(line);}
        else if(cap_Small_jRadioButton.isSelected() == true){String line =util.read("CapitalLetter_SmallLetter.txt");example_jTextArea.setText(line);}
        else if(vowel_Consonant_jRadioButton.isSelected() == true){String line =util.read("Checking_VOWEL__CONSTANT.txt");example_jTextArea.setText(line);}
        else if(circle_Area_jRadioButton.isSelected() == true){String line =util.read("Circle_Area.txt");example_jTextArea.setText(line);}
        else if(even_Odd_jRadioButton.isSelected() == true){String line =util.read("EvenOdd.txt");example_jTextArea.setText(line);}
        else if(factorial_jRadioButton.isSelected() == true){String line =util.read("Factorial_Demo.txt");example_jTextArea.setText(line);}
        else if(fibonacci_jRadioButton.isSelected() == true){String line =util.read("Fibonacci_Demo.txt");example_jTextArea.setText(line);}
        else if(mult_table_jRadioButton.isSelected() == true){String line =util.read("Multiplication_Table.txt");example_jTextArea.setText(line);}
        else if(Palindrome_Number_jRadioButton.isSelected() == true){String line =util.read("Palindrome_Number.txt");example_jTextArea.setText(line);}
        else if(prime_Demo_jRadioButton.isSelected() == true){String line =util.read("Prime_Number.txt");example_jTextArea.setText(line);}
        else if(random_jRadioButton.isSelected() == true){String line =util.read("Random_Number.txt");example_jTextArea.setText(line);}
        else if(reverse_a_Number_jRadioButton.isSelected() == true){String line =util.read("Reverse_a_Number.txt");example_jTextArea.setText(line);}
        else if(square_Linear_Series_jRadioButton.isSelected() == true){String line =util.read("Square_Linear_Series.txt");example_jTextArea.setText(line);}
        else if(temperature_jRadioButton.isSelected() == true){String line =util.read("Temperature.txt");example_jTextArea.setText(line);}
        else if(ternary_Operator_jRadioButton.isSelected() == true){String line =util.read("TernaryOperator.txt");example_jTextArea.setText(line);}
        else if(triangle_Area_jRadioButton.isSelected() == true){String line =util.read("Triangle_Area.txt");example_jTextArea.setText(line);}
        else{JOptionPane.showMessageDialog(null, "Please Select an Option First", "Option Not Found", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_generate_jButtonActionPerformed

    private void circle_Area_jRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circle_Area_jRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_circle_Area_jRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Examples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examples().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Palindrome_Number_jRadioButton;
    private javax.swing.JRadioButton arithmatic_jRadioButton;
    private javax.swing.JRadioButton armstrong_Number_jRadioButton;
    private javax.swing.JRadioButton bitwiseOperator_jRadioButton;
    private javax.swing.JRadioButton cap_Small_jRadioButton;
    private javax.swing.JRadioButton circle_Area_jRadioButton;
    private javax.swing.JRadioButton even_Odd_jRadioButton;
    private javax.swing.ButtonGroup example_buttonGroup;
    private javax.swing.JPanel example_jPanel;
    private javax.swing.JTextArea example_jTextArea;
    private javax.swing.JRadioButton factorial_jRadioButton;
    private javax.swing.JRadioButton fibonacci_jRadioButton;
    private javax.swing.JButton generate_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mult_table_jRadioButton;
    private javax.swing.JRadioButton prime_Demo_jRadioButton;
    private javax.swing.JRadioButton random_jRadioButton;
    private javax.swing.JRadioButton reverse_a_Number_jRadioButton;
    private javax.swing.JRadioButton square_Linear_Series_jRadioButton;
    private javax.swing.JRadioButton temperature_jRadioButton;
    private javax.swing.JRadioButton ternary_Operator_jRadioButton;
    private javax.swing.JRadioButton triangle_Area_jRadioButton;
    private javax.swing.JRadioButton vowel_Consonant_jRadioButton;
    // End of variables declaration//GEN-END:variables
}
