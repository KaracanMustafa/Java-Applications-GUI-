/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritesites;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author karac
 */
public class CheckValidations {
Connection myConn=new DatabaseConnection().databaseConn();




    public boolean checkFriendUsernameExists(String username1) {
        boolean usernameExists = false;
            try {
                PreparedStatement statement = myConn.prepareStatement("SELECT * FROM userinfo WHERE username = ?") ;
                statement.setString(1, username1);
                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        usernameExists = (count > 0);
                    }
                
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return usernameExists;
    }
    
    public boolean checkYearValidation(String year){
         if (Integer.parseInt(year)<1920||Integer.parseInt(year)>2024){
            JOptionPane.showMessageDialog(null, "Invalid year !","ERROR !",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean checkRatingValidation(String rating){
        if (Integer.parseInt(rating)<1||Integer.parseInt(rating)>5){
            JOptionPane.showMessageDialog(null, "Please enter a value between 1 and 5 for rating !","ERROR !",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean checkVisitID(String ID){
         boolean idExists = false;
            try {
                PreparedStatement statement = myConn.prepareStatement("SELECT * FROM visits WHERE visit_id = ?") ;
                statement.setString(1, ID);
                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        idExists = (count > 0);
                    }
                
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return idExists;
    }
    
    public boolean checkUsernameAndVisit(String username,String visitID){
        boolean usernameVisit = false;
            try {
                PreparedStatement statement = myConn.prepareStatement("SELECT * FROM visits WHERE username = ? and visit_id = ?") ;
                statement.setString(1, username);
                statement.setString(2, visitID);
                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        usernameVisit = (count > 0);
                    }
                
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return usernameVisit;
    }
    public boolean checkSqlExistYear(String year){
        boolean visitYear = false;
            try {
                PreparedStatement statement = myConn.prepareStatement("SELECT * FROM visits WHERE  visit_year = ?") ;
                
                statement.setString(1, year);
                    ResultSet resultSet = statement.executeQuery();
                    if (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        visitYear = (count > 0);
                    }
                
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return visitYear;
    }
    
}
