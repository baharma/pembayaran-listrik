/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class koneksi {
    Connection koneksidb;
    public Connection getConnection(){
        try {
            koneksidb =DriverManager.getConnection("jdbc:mysql://localhost/dbpln","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi database gagal","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
    return koneksidb;
    }
}
