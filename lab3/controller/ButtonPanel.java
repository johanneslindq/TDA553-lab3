package lab3.controller;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JPanel;

import lab3.model.*;

public class ButtonPanel extends JPanel{
    private static final int X = 800;

    public ButtonPanel(ArrayList<Vehicle> cars, ArrayList<Scania> scanias, ArrayList<TurboCar> turboCars) {
        setLayout(new GridLayout(2,4));
        add(new GasButton(cars), 0);
        add(new TurboOnButton(turboCars), 1);
        add(new RaiseRamp(scanias), 2);
        add(new BrakeButton(cars), 3);
        add(new TurboOffButton(turboCars), 4);
        add(new LowerRamp(scanias), 5);

        setPreferredSize(new Dimension((X/2)+4, 200));
        setBackground(Color.CYAN);
    }
}

