package test;
import static org.junit.Assert.*;
import org.junit.Test;

import lab3.model.Scania;

public class ScaniaTest {

    @Test
    public void lowerRamp(){
        Scania truck = new Scania(0,0);
        truck.adjustPlatform(-10);
        int newValue = truck.getPlatformAngle();
        assertEquals(0, newValue);
    }

    @Test
    public void raiseRamp(){
        Scania truck = new Scania(0,0);
        truck.adjustPlatform(30);
        int newValue = truck.getPlatformAngle();
        assertEquals(30, newValue);
    }

    @Test
    public void moveWhenDown(){
        Scania truck = new Scania(0,0);
        truck.gas(1);
        double newValue = truck.getCurrentSpeed();
        double expectedValue = truck.getEnginePower() * 0.01 * 1;
        assertTrue(expectedValue == newValue);
    }


}
