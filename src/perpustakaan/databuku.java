/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author User
 */
public class databuku extends javax.swing.JFrame {
    
    Connection con;
    Statement stat;
    ResultSet res;
    PreparedStatement st;

    /**
     * Creates new form databuku
     */
    
    private void loaddata(){
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("Kode Buku");
        t.addColumn("Nama Buku");
        t.addColumn("Nama Pengarang");
        t.addColumn("Penerbit");
        t.addColumn("Tahun Terbit");
        tabuk.setModel(t);
        try{
            res=stat.executeQuery("Select * from data_buku");

            while (res.next()){
                t.addRow(new Object[]
                {
                    res.getString("kode_buku"),
                    res.getString("nama_buku"),
                    res.getString("nama_pengarang"),
                    res.getString("penerbit"),
                    res.getString("tahun_terbit")
                });
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    public databuku() {
        initComponents();
        setLocationRelativeTo(null);
        koneksi();
        loaddata();
    }
    
    private void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/database_perpustakaan","root","");
            stat = con.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kodebuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namabuku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pengarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        penerbit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tahunterbit = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabuk = new javax.swing.JTable();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perpustakaan SMKN 2 Padang");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Data Buku");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 108, -1, -1));

        kodebuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(kodebuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 105, 219, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nama Buku");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 151, -1, -1));

        namabuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(namabuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 148, 219, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Pengarang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 194, -1, -1));

        pengarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 191, 219, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Penerbit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 236, -1, -1));

        penerbit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(penerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 233, 219, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tahun Terbit");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 277, -1, -1));

        tahunterbit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(tahunterbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 274, 219, -1));

        tabuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabuk);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 339, 741, 145));

        save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 190, 75, -1));

        exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 190, 79, -1));

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 147, 79, -1));

        edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 147, 75, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 104, -1, -1));

        refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 104, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\SMKN 2 Padang\\XI-RPL\\Pemrograman Berorientasi Objek\\Aplikasi & Program\\Aplikasi Perpustakaan\\Asset\\bgDataBuku.png")); // NOI18N
        jLabel7.setText("7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

        setSize(new java.awt.Dimension(826, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabukMouseClicked
        // TODO add your handling code here:
        int i = tabuk.getSelectedRow();

        if(i == -1){
            return;
        }

        String code = (String)tabuk.getValueAt(i,0);
        String code1 = (String)tabuk.getValueAt(i,1);
        String code2 = (String)tabuk.getValueAt(i,2);
        String code3 = (String)tabuk.getValueAt(i,3);
        String code4 = (String)tabuk.getValueAt(i,4);

        kodebuku.setText(code);
        namabuku.setText(code1);
        pengarang.setText(code2);
        penerbit.setText(code3);
        tahunterbit.setText(code4);
    }//GEN-LAST:event_tabukMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try{
            String sqlnya = ("insert into data_buku values ('"
                +kodebuku.getText()+"','"
                +namabuku.getText()+"','"
                +pengarang.getText()+"','"
                +penerbit.getText()+"','"
                +tahunterbit.getText()+"')");

            stat.executeUpdate(sqlnya);
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            loaddata();

        } catch (Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?","Yakin", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
            new menuutama().show();
        }
    }//GEN-LAST:event_exitActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String x = kodebuku.getText();

        try{
            String sql="delete from data_buku where Kode_Buku='"+x+"'";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data telah dihapus");
            loaddata();
            kodebuku.setText(null);
            namabuku.setText(null);
            pengarang.setText(null);
            penerbit.setText(null);
            tahunterbit.setText(null);

        } catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        int coba = JOptionPane.showConfirmDialog(null, "Yakin untuk mengubah data ini?","Confirmation", JOptionPane.YES_NO_OPTION);
        try{
            String sql = "update data_buku set kode_buku=?, nama_buku=?, nama_pengarang=?,Penerbit=?,Tahun_Terbit=? where " + "Kode_Buku='"+kodebuku.getText()+"'";
            st=con.prepareStatement(sql);

            if(coba==0){
                try{
                    st.setString(1, kodebuku.getText());
                    st.setString(2, namabuku.getText());
                    st.setString(3, pengarang.getText());
                    st.setString(4, penerbit.getText());
                    st.setString(5, tahunterbit.getText());
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Update data sukses");
                    loaddata();
                } catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Update data Gagal" + e);
                }
            }
        } catch(Exception e){

        }
    }//GEN-LAST:event_editActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String x = JOptionPane.showInputDialog(null, "Masukkan Kode Buku!!");
        try{
            res = stat.executeQuery("select * from data_buku where kode_buku='"+x+"'");

            if(res.next()){
                System.out.println(res.getString(1));
                JOptionPane.showMessageDialog(null, "Data ditemukan");
                kodebuku.setText(res.getString(1));
                namabuku.setText(res.getString(2));
                pengarang.setText(res.getString(3));
                penerbit.setText(res.getString(4));
                tahunterbit.setText(res.getString(5));
            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak ditemukan");
            }
        } catch (Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        kodebuku.setText(null);
        namabuku.setText(null);
        pengarang.setText(null);
        penerbit.setText(null);
        tahunterbit.setText(null);
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(databuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new databuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kodebuku;
    private javax.swing.JTextField namabuku;
    private javax.swing.JTextField penerbit;
    private javax.swing.JTextField pengarang;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTable tabuk;
    private javax.swing.JTextField tahunterbit;
    // End of variables declaration//GEN-END:variables
}
