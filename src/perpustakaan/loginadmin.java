/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class loginadmin extends javax.swing.JFrame {

    /**
     * Creates new form loginadmin
     */
    public loginadmin() {
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

        jLabel2 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perpustakaan SMKN 2 Padang");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Login Admin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 24, -1, -1));

        Username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Username.setText("Username");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 104, -1, -1));

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 104, 144, -1));

        Password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 157, -1, -1));

        login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 238, -1, -1));

        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 238, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 238, -1, -1));

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 154, 144, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\SMKN 2 Padang\\XI-RPL\\Pemrograman Berorientasi Objek\\Aplikasi & Program\\Aplikasi Perpustakaan\\Asset\\logAdm.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 330));

        setSize(new java.awt.Dimension(471, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if(user.getText().equals("Admin")){
            if(pass.getText().equals("Databuku")){
                new databuku().show();
                this.dispose();
            }
        }
        
        if(user.getText().equals("Admin")){
            if(pass.getText().equals("Anggota")){
                new anggota().show();
                this.dispose();
            }
        }
        
        if(user.getText().equals("Admin")){
            if(pass.getText().equals("Peminjam")){
                new transaksi().show();
                this.dispose();
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?","Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new menuutama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JButton back;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
