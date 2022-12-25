package lab3.controller;

import javax.swing.*;
import java.util.ArrayList;
import lab3.model.Vehicle;
import lab3.view.DrawPanel;

public class ClockTimer {
    private final int delay = 50;
    private Timer timer;

    public ClockTimer(ArrayList<Vehicle> cars, DrawPanel view){
        timer = new Timer(delay, e -> update(cars, view));
    }
    private void update(ArrayList<Vehicle> cars, DrawPanel view){
        for (Vehicle car : cars){
        car.move();
        }
        view.repaint();
    }

    public void start() {
        timer.start();
    }
}
