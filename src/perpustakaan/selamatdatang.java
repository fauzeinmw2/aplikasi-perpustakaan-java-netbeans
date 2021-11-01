package perpustakaan;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class selamatdatang {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Selamat Datang di Perpustakaan SMKN 2 Padang");
        new login().setVisible(true);
    }
    
}
