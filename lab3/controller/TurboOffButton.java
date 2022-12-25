package lab3.controller;

import lab3.model.TurboCar;

import javax.swing.*;

import java.util.ArrayList;

public class TurboOffButton extends JButton {

    public TurboOffButton(ArrayList<TurboCar> cars) {
        super("Switch turbo off");
        addActionListener(e -> {
            for (TurboCar turbocar : cars) {
                turbocar.setTurboOff();
            }
        });
    }
}
