package lab3.controller;

import java.util.ArrayList;
import java.awt.*;

import javax.swing.JButton;
import lab3.model.Vehicle;

public class BrakeButton extends JButton{
    private static final int X = 800;

    public BrakeButton(ArrayList<Vehicle> cars){
        super("Brake");
        setBackground(Color.blue);
        setForeground(Color.green);
        setPreferredSize(new Dimension(X/5-15,200));
        
        addActionListener(e -> {
            for (Vehicle car : cars) {
                    car.brake(1);
            }
        });
    }
}