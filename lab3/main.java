package lab3;
import lab3.controller.*;
import lab3.model.*;
import lab3.view.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car volvo = new Volvo240(0, 0);
        TurboCar saab = new Saab95(0, 100);
        Scania scania = new Scania(0, 200);

        ArrayList<Vehicle> cars = new ArrayList<>();
        ArrayList<Scania> scanias = new ArrayList<>();
        ArrayList<TurboCar> turboCars = new ArrayList<>();

        cars.add(volvo);
        cars.add(saab);
        cars.add(scania);

        scanias.add(scania);
        turboCars.add(saab);

        CarController cc = new CarController(cars, scanias, turboCars);

        ArrayList<PaintableVehicle> paintableVehicles = new ArrayList<>();

        paintableVehicles.add(new PaintableVehicle("../pics/Saab95.jpg", saab));
        paintableVehicles.add(new PaintableVehicle("../pics/Volvo240.jpg", volvo));
        paintableVehicles.add(new PaintableVehicle("../pics/Scania.jpg", scania));

        DrawPanel view = new DrawPanel(paintableVehicles);

        new CarView("CarSim 1.0", cc, view); 

        ClockTimer timer = new ClockTimer(cars, view);
        timer.start();
    }
}