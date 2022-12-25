package lab3.controller;

import lab3.model.Scania;
import javax.swing.*;
import java.util.ArrayList;


public class RaiseRamp extends JButton {
    private static final int RAISE_ANGLE = 10;

    public RaiseRamp(ArrayList<Scania> cars) {
        super("Scania Lift Bed");
        addActionListener(e -> {
            for (Scania scania : cars) {
                scania.adjustPlatform(scania.getPlatformAngle() + RAISE_ANGLE);
            }
        });
    }
}
