/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coffeemaker;

/**
 *
 * @author karac
 */
public interface MachineState {
    void pressStartButton(CoffeeMachine machine);
    void pressFilledButton(CoffeeMachine machine, int cups);
    void pressResetButton(CoffeeMachine machine);
    void displayState(CoffeeMachine machine);
}
