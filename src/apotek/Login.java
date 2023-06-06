/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apotek;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fahri
 */
public class Login extends javax.swing.JFrame {
    private PreparedStatement stat;//query yang bakal di eksekusi
    private ResultSet rs;//menyimpan hasil eksekusi
    koneksi k = new koneksi();//sambungan ke database

  
    public Login() {//konstruktor bawaan
        initComponents();
        k.connect();//pas buka menu login langsung membka koneksi ketika menu login di buat
    }

    void bersih(){
        klm_user.setText("username");
        klm_pass.setText("password");
    }
    
    class user {
        int id_user,id_level;
        String username, password;
        
        public user(){
            this.id_user  = 0;//mereverensi ke objek yang sedang di akses
            this.username = klm_user.getText();
            this.password = klm_pass.getText();
            this.id_level = 0;//0, buat reverensi kalo id nya gaa ada
            
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Login = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Btn_Exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        klm_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        klm_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel_Login.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Login.setPreferredSize(new java.awt.Dimension(600, 400));
        Panel_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_LoginMousePressed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LAYAR.png"))); // NOI18N

        Btn_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        Btn_Exit.setText("jLabel1");
        Btn_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_ExitMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N

        klm_user.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        klm_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        klm_user.setText("username");
        klm_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        klm_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                klm_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                klm_userFocusLost(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        klm_pass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        klm_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        klm_pass.setText("password");
        klm_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        klm_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                klm_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                klm_passFocusLost(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N

        btn_login.setBackground(new java.awt.Color(0, 153, 102));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_LoginLayout = new javax.swing.GroupLayout(Panel_Login);
        Panel_Login.setLayout(Panel_LoginLayout);
        Panel_LoginLayout.setHorizontalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(klm_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_LoginLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(klm_user, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100))))
        );
        Panel_LoginLayout.setVerticalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_LoginLayout.createSequentialGroup()
                                .addComponent(Btn_Exit)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(klm_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(klm_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void Btn_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Btn_ExitMouseClicked

    private void klm_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_klm_userFocusGained
        // TODO add your handling code here:
        String uname = klm_user.getText();
        if(uname.equals("username")){
            klm_user.setText("");
        } 
    }//GEN-LAST:event_klm_userFocusGained

    private void klm_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_klm_passFocusGained
        // TODO add your handling code here:
         String pass = klm_pass.getText();
        if(pass.equals("password")){
            klm_pass.setText("");
        } 
    }//GEN-LAST:event_klm_passFocusGained

    private void klm_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_klm_userFocusLost
        // TODO add your handling code here:
        String uname = klm_user.getText();
        if(uname.equals("")||uname.equals("username")){
            klm_user.setText("username");
        }
    }//GEN-LAST:event_klm_userFocusLost

    private void klm_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_klm_passFocusLost
        // TODO add your handling code here:
        String pass = klm_pass.getText();
        if(pass.equals("")||pass.equals("password")){
            klm_pass.setText("password");
        }
    }//GEN-LAST:event_klm_passFocusLost

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        user u = new user();
        try {
            this.stat = k.getCon().prepareStatement("select * from user where "
                        + "username='"+u.username+"' and password='"+u.password+"';");
            this.rs = this.stat.executeQuery();
            while (rs.next()){
                u.id_level = rs.getInt("id_level");
            }
            
            //ini ga perlu pake if sih
            //bisa masuk ke switch nya aja pake default
              if (u.id_level==0){
                  JOptionPane.showMessageDialog(null, "Akun Tidak Ditemukan");
              }else {
                  switch(u.id_level){
                      case 1:
                          menu_kasir kasir = new menu_kasir();
                          kasir.setVisible(true);
                          this.setVisible(false);
                          break;
                      case 2:
                          menu_store store = new menu_store();
                          store.setVisible(true);
                          this.setVisible(false);
                          break;
                  }
              }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void Panel_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_LoginMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_Panel_LoginMousePressed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_Exit;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Panel_Login;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField klm_pass;
    private javax.swing.JTextField klm_user;
    // End of variables declaration//GEN-END:variables
}
