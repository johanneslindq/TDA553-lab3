import lab3.view.*;
import lab3.controller.*;
import lab3.model.*;

public class Main {
    public static void main(String[] args) {
        Car volvo = new Volvo240();
        TurboCar saab = new Saab95();
        Scania scania = new Scania();

        ArrayList<Vehicle> cars = new ArrayList<>();

        cars.add(volvo);
        cars.add(saab);
        cars.add(scania);

        CarController cc = new CarController();
        cc.frame = new CarView("CarSim 1.0", cc);
        CarView frame;
        

        ArrayList<Vehicle> paintableVehicles = new ArrayList<>();

        PaintableVehicle volvoImage = new PaintableVehicle("../pics/Volvo240.jpg", volvo);
        PaintableVehicle saabImage = new PaintableVehicle("../pics/Saab95.jpg", saab);
        PaintableVehicle scaniaImage = new PaintableVehicle("../pics/Scania.jpg", scania);

        paintableVehicles.add(saabImage);
        paintableVehicles.add(volvoImage);
        paintableVehicles.add(scaniaImage);


        DrawPanel view = new DrawPanel(paintableVehicles);

        cc.start_timer();

    }
}