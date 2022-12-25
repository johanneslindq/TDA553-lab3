package test;
import static org.junit.Assert.*;
import org.junit.Test;

import lab3.model.CarTransporter;
import lab3.model.Volvo240;


public class CarTransporterTest {

    @Test
    public void lowerRamp(){
        CarTransporter truck = new CarTransporter(10, 0, 0);
        truck.adjustPlatform();
        boolean newValue = truck.isPlatformRaised();
        assertEquals(false, newValue);
    }

    @Test
    public void raiseRamp(){
        CarTransporter truck = new CarTransporter(10, 0, 0);
        truck.adjustPlatform();
        truck.adjustPlatform();
        boolean newValue = truck.isPlatformRaised();
        assertEquals(true, newValue);
    }

    @Test
    public void moveWhenRaised(){
        CarTransporter truck = new CarTransporter(10, 0, 0);
        truck.gas(1);
        double newValue = truck.getCurrentSpeed();
        double expectedValue = truck.getEnginePower() * 0.01 * 1;
        assertTrue(expectedValue == newValue);
    }

    @Test
    public void loadTest(){
        CarTransporter truck = new CarTransporter(10, 0, 0);
        Volvo240 car = new Volvo240(0, 0);

        truck.adjustPlatform();
        truck.loadCar(car);
        truck.adjustPlatform();

        for (int i = 1 ; i<10; i++){
        truck.gas(1);
        }

        for (int i = 1 ; i<10; i++){
            truck.move();
        }

        for (int i = 1 ; i<30 ; i++){
            truck.brake(1);
        }

        truck.adjustPlatform();
        truck.unloadCar(car);
        truck.adjustPlatform();

        assertEquals(truck.getX() - 10, car.getX() , 0.001);
        assertEquals(truck.getY() - 10, car.getY(),  0.001);
    }


}
