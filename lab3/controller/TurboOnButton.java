package lab3.controller;

import lab3.model.TurboCar;
import javax.swing.*;
import java.util.ArrayList;

public class TurboOnButton extends JButton {

    public TurboOnButton(ArrayList<TurboCar> cars) {
        super("Switch turbo on");
        addActionListener(e -> {
            for (TurboCar turbocar : cars) {
                turbocar.setTurboOn();;
            }
        });
    }
}
