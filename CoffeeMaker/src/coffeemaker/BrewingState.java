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
public class BrewingState implements MachineState{
    public void pressStartButton(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Already brewing...");
    }

    public void pressFilledButton(CoffeeMachine machine, int cups) {
        JOptionPane.showMessageDialog(null, "Cannot fill while brewing.");
    }

    public void pressResetButton(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Resetting the machine...");
        machine.setState(new EmptyState());
    }

    public void displayState(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Current State: BREWING");
    }
}
