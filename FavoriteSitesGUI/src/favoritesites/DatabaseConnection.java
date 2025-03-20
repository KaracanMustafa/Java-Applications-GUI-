/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritesites;


import java.sql.*;

/**
 *
 * @author karac
 */
public class DatabaseConnection {
    public Connection databaseConn(){
         Connection myConn=null;
         String url = "jdbc:mysql://localhost:3306/favoritesitesdatabase"; 
         String username = "root"; 
         String password = "12345678"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            myConn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver could not be found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("An error occurred connecting to the MySQL database.");
            e.printStackTrace();
        }
        return myConn;
    }
}
