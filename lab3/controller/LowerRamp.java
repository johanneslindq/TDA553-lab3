package lab3.controller;

import lab3.model.Scania;

import javax.swing.*;

import java.util.ArrayList;

public class LowerRamp extends JButton {
    private static final int RAISE_ANGLE = 10;

    public LowerRamp(ArrayList<Scania> cars) {
        super("Scania Lower Bed");
        addActionListener(e -> {
            for (Scania scania : cars) {
                scania.adjustPlatform(scania.getPlatformAngle() - RAISE_ANGLE);
            }
        });
    }
}
