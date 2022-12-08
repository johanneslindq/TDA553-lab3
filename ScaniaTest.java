import static org.junit.Assert.*;
import org.junit.Test;

public class ScaniaTest {

    @Test
    public void raiseWhenMoving() {
        Scania truck = new Scania();
        truck.gas(1);
        truck.raisePlatform(10);
        assertTrue(truck.getPlatformAngle() == 0);
    }

    @Test
    public void gasWhenRaised() {
        Scania truck = new Scania();
        truck.raisePlatform(10);
        truck.gas(1);
        assertTrue(truck.getCurrentSpeed() == 0);
    }


}
