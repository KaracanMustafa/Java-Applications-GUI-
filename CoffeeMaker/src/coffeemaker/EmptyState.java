/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemaker;

import javax.swing.JOptionPane;

/**
 *
 * @author karac
 */
public class EmptyState implements MachineState{
    public void pressStartButton(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Warning: Machine is empty. Please fill it first.");
    }
    
    public void pressFilledButton(CoffeeMachine machine, int cups) {
        machine.setNumCups(cups);
        machine.setState(new IdleState());
    }
    
    public void pressResetButton(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Machine is already empty.");
    }

    public void displayState(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Current State: EMPTY");
    }
}
