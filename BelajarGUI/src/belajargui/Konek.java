package belajargui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Muhammad Rosyid Izzulkhaq
 */
public class Konek {
    private static Connection koneksi;
    
    public static Connection getK() {
        if (koneksi==null) {
            try{
                String url = "jdbc:mysql://localhost:3306/rsdiz",
                       username = "root",
                       password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
            }catch(SQLException e){
                System.out.println("Gagal Konek!");
            }
        }
        return koneksi;
    }
}
