package datakaryawangui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LK3NO22UTY
 */
public class KoneksiDB {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi==null) {
            try{
                String url = "jdbc:mysql://localhost:3306/datakaryawan",
                       username = "root",
                       password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
            }catch(SQLException e){
                System.out.println("Gagal membuat koneksi!");
            }
        }
        return koneksi;
    }
}
