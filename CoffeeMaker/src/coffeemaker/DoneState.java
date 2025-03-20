/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemaker;

import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDateTime;
/**
 *
 * @author karac
 */
public class DoneState implements MachineState{
    Connection myConn=new DatabaseConnection().databaseConn();
    public void pressStartButton(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Machine is done. Please reset.");
    }

    public void pressFilledButton(CoffeeMachine machine, int cups) {
        JOptionPane.showMessageDialog(null, "Machine is done. Please reset first.");
    }

    public void pressResetButton(CoffeeMachine machine) {
        machine.setState(new EmptyState());
    }

    public void displayState(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Current State: DONE");
        
        saveData(machine);
    }
    
     private void saveData(CoffeeMachine machine) {
        try {
            PreparedStatement ps = myConn.prepareStatement("INSERT INTO coffee_data (cups, date) VALUES (?, ?)");
            ps.setInt(1, machine.getNumCups());
            ps.setString(2, LocalDateTime.now().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data saved: " + machine.getNumCups() + " cups brewed on " + LocalDateTime.now());
            machine.setState(new DoneState());
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving data to database.");
        }
    }
}
