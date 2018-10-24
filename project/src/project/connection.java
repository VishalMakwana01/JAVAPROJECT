/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Admin
 */
public class connection {
     public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\Vishal\\Desktop\\project.sqlite";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            Statement stmt=(Statement)conn.createStatement();
            
       

            System.out.println("Connection to SQLite has been established.");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
         return null;
         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
    
}
