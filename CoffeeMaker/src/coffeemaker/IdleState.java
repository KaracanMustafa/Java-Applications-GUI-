/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemaker;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author karac
 */
public class IdleState implements MachineState{
    public void pressStartButton(CoffeeMachine machine) {
        machine.setState(new BrewingState());
        machine.startBrewing();
    }

    public void pressFilledButton(CoffeeMachine machine, int cups) {
        JOptionPane.showMessageDialog(null, "Machine is already filled.");
    }

    public void pressResetButton(CoffeeMachine machine) {
        machine.setState(new EmptyState());
    }

    public void displayState(CoffeeMachine machine) {
        JOptionPane.showMessageDialog(null, "Current State: IDLE");
    }
}
