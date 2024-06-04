/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autentikasi;

import com.mycompany.FantasyFittings.koneksiDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TombolRegister = new javax.swing.JToggleButton();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        KPassword = new javax.swing.JPasswordField();
        LabelUsername = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        LabelKonfirmasiPassword = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();
        TombolLogin = new javax.swing.JLabel();
        PesanLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 380));

        TombolRegister.setBackground(new java.awt.Color(0, 153, 255));
        TombolRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TombolRegister.setForeground(new java.awt.Color(255, 255, 255));
        TombolRegister.setText("Register");
        TombolRegister.setHideActionText(true);
        TombolRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolRegisterActionPerformed(evt);
            }
        });

        LabelUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelUsername.setText("User");

        LabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelPassword.setText("Password");

        LabelKonfirmasiPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelKonfirmasiPassword.setText("Konfirmasi Password");

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setText("Register");

        BackGround.setBackground(new java.awt.Color(0, 0, 0));
        BackGround.setForeground(new java.awt.Color(255, 255, 255));
        BackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-name-2.png"))); // NOI18N
        BackGround.setOpaque(true);

        TombolLogin.setForeground(new java.awt.Color(0, 102, 204));
        TombolLogin.setText("Login");
        TombolLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TombolLoginMouseClicked(evt);
            }
        });

        PesanLogin.setText("Sudah punya akun?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PesanLogin)
                        .addGap(7, 7, 7)
                        .addComponent(TombolLogin)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsername)
                            .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelPassword)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelKonfirmasiPassword)
                            .addComponent(KPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TombolRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(LabelUsername)
                .addGap(4, 4, 4)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(LabelPassword)
                .addGap(4, 4, 4)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(LabelKonfirmasiPassword)
                .addGap(4, 4, 4)
                .addComponent(KPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(TombolRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PesanLogin)
                    .addComponent(TombolLogin))
                .addGap(49, 49, 49))
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void clearForm() {
        Username.setText("");
        Password.setText("");
        KPassword.setText("");
    }
    
    private void TombolRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolRegisterActionPerformed
        try {
            // 01. Tangkap variabel inputan 
            String uname = Username.getText();
            String pw = new String(Password.getPassword());
            String kpw = new String(KPassword.getPassword());

            // 01.1. Konfirmasi Inputan
            if (!pw.equals(kpw)) {
                JOptionPane.showMessageDialog(null, "Pastikan konfirmasi password sesuai");
                return;
            }

            // 02. Query SQL - INSERT
            String perintahInsert_SQL = "INSERT INTO pengguna (username, password) VALUES (?, ?)";

            // 03. Menghubungkan SQL - Java
            Connection penghubung = koneksiDB.konfigurasi_koneksiDB();
            if (penghubung == null) {
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal. Silakan cek konfigurasi database Anda.");
                return;
            }

            // 04. Membuat PreparedStatement
            PreparedStatement pernyataanSQL = penghubung.prepareStatement(perintahInsert_SQL);
            pernyataanSQL.setString(1, uname);
            pernyataanSQL.setString(2, pw);

            // 05. Mengeksekusi perintah SQL
            int rowsInserted = pernyataanSQL.executeUpdate();

            // 06. Validasi data SQL
            if (rowsInserted > 0) {
                // Kondisi Berhasil
                JOptionPane.showMessageDialog(null, "Register Berhasil");
                new Login().setVisible(true); //Meredirect ke object Login
                this.dispose(); // Menutup window login
            } else {
                // Kondisi Gagal 
                JOptionPane.showMessageDialog(null, "Gagal melakukan registrasi");
                clearForm();
            }

            // Tutup pernyataanSQL dan penghubung
            pernyataanSQL.close();
            penghubung.close();

        } catch (SQLException e) {
            // 07. Exception()
            JOptionPane.showMessageDialog(null, "Registrasi Gagal \n" + e.getMessage());
        }
    }//GEN-LAST:event_TombolRegisterActionPerformed

    private void TombolLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TombolLoginMouseClicked
        new Login().setVisible(true); //Meredirect ke object Register
        this.dispose();
    }//GEN-LAST:event_TombolLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JPasswordField KPassword;
    private javax.swing.JLabel LabelKonfirmasiPassword;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUsername;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PesanLogin;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TombolLogin;
    private javax.swing.JToggleButton TombolRegister;
    private javax.swing.JTextField Username;
    // End of variables declaration//GEN-END:variables
}
