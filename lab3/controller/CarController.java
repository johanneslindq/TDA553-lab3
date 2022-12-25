package lab3.controller;



import lab3.model.Scania;
import lab3.model.TurboCar;
import lab3.model.Vehicle;


import java.util.ArrayList;

import javax.swing.JPanel;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController extends JPanel{


    public CarController(ArrayList<Vehicle> cars,ArrayList<Scania> scanias, ArrayList<TurboCar> turboCars){
        add(new ButtonPanel(cars, scanias, turboCars));
        add(new StartButton(cars));
        add(new StopButton(cars));
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
}
