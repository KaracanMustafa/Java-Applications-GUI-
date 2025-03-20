/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemaker;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

/**
 *
 * @author karac
 */
public class CoffeeMachine {
    private MachineState state;
    private int numCups;
    private Timer timer;

    public CoffeeMachine() {
        this.state = new EmptyState();  // Initial state
        this.numCups = 0;
    }
    
    public MachineState getState(){
        return state;
    }
    
    public void setState(MachineState state) {
        this.state = state;
    }

    public void pressStartButton() {
        state.pressStartButton(this);
    }

    public void pressFilledButton(int cups) {
        state.pressFilledButton(this, cups);
    }

    public void pressResetButton() {
        state.pressResetButton(this);
    }

    public void displayState() {
        state.displayState(this);
    }

    public void setNumCups(int numCups) {
        this.numCups = numCups;
    }

    public int getNumCups() {
        return numCups;
    }

    public void startBrewing() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                setState(new DoneState());
                displayState();
                System.out.println(getState());
            }
        }, 5000);
        
    }

   
}
