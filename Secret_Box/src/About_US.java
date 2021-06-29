
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class About_US extends javax.swing.JFrame {

    public About_US() {
        initComponents();
        initComponents2();
    }
    
    private void initComponents2(){
        
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WIDTH);
        setTitle("About US");
        
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Programmer.jpg")));
        Image img1 = myImage.getImage();
        
        Image img2 = img1.getScaledInstance(Wallpaper_jLabel.getWidth(), Wallpaper_jLabel.getWidth(), Image.SCALE_SMOOTH); //
        
        ImageIcon i = new ImageIcon(img2);
        Wallpaper_jLabel.setIcon(i);
        
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_US_Main_jPanel = new javax.swing.JPanel();
        title_jLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Wallpaper_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        about_US_Main_jPanel.setBackground(new java.awt.Color(0, 0, 0));
        about_US_Main_jPanel.setLayout(null);

        title_jLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        title_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        title_jLabel.setText("D E V  E  L O P E R     I N F O R M A T I O N");
        about_US_Main_jPanel.add(title_jLabel);
        title_jLabel.setBounds(30, 130, 440, 60);

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sudipta Kumar Das (OM)");
        about_US_Main_jPanel.add(jLabel1);
        jLabel1.setBounds(120, 210, 260, 50);

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mail : dip.kumar020@gmail.com");
        about_US_Main_jPanel.add(jLabel2);
        jLabel2.setBounds(90, 270, 300, 40);

        Wallpaper_jLabel.setBackground(new java.awt.Color(0, 0, 0));
        about_US_Main_jPanel.add(Wallpaper_jLabel);
        Wallpaper_jLabel.setBounds(0, 0, 500, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about_US_Main_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(about_US_Main_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(About_US.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About_US.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About_US.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About_US.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About_US().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper_jLabel;
    private javax.swing.JPanel about_US_Main_jPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration//GEN-END:variables
}
