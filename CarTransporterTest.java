import static org.junit.Assert.*;
import org.junit.Test;

public class CarTransporterTest {

    @Test
    public void lowerRamp(){
        CarTransporter truck = new CarTransporter(10);
        truck.adjustPlatform();
        boolean newValue = truck.isPlatformRaised();
        assertEquals(false, newValue);
    }

    @Test
    public void raiseRamp(){
        CarTransporter truck = new CarTransporter(10);
        truck.adjustPlatform();
        truck.adjustPlatform();
        boolean newValue = truck.isPlatformRaised();
        assertEquals(true, newValue);
    }

    @Test
    public void moveWhenRaised(){
        CarTransporter truck = new CarTransporter(10);
        truck.gas(1);
        double newValue = truck.getCurrentSpeed();
        double expectedValue = truck.getEnginePower() * 0.01 * 1;
        assertTrue(expectedValue == newValue);
    }


}
