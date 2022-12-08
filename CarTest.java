
import static org.junit.Assert.*;
import org.junit.Test;



public class CarTest {
    @Test
    public void tooSmallGasAmount() {
        Volvo240 volvo = new Volvo240();
        volvo.gas(50);
        double firstValue = volvo.getCurrentSpeed();
        volvo.gas(-100);
        double newValue = volvo.getCurrentSpeed();
        assertTrue(firstValue == newValue);
    }

    @Test
    public void tooLargeGasAmount() {
        Volvo240 volvo = new Volvo240();
        volvo.gas(50);
        double firstValue = volvo.getCurrentSpeed();
        volvo.gas(100000);
        double newValue = volvo.getCurrentSpeed();
        assertTrue(firstValue == newValue);
    }

    @Test
    public void tooLargeBrakeAmount() {
        Volvo240 volvo = new Volvo240();
        volvo.gas(50);
        double firstValue = volvo.getCurrentSpeed();
        volvo.brake(100000);
        double newValue = volvo.getCurrentSpeed();
        assertTrue(firstValue == newValue);
    }

    @Test
    public void tooSmallBrakeAmount() {
        Volvo240 volvo = new Volvo240();
        volvo.gas(50);
        double firstValue = volvo.getCurrentSpeed();
        volvo.brake(-1000);
        double newValue = volvo.getCurrentSpeed();
        assertTrue(firstValue == newValue);
    }

    @Test
    public void turnLeftTest() {
        Volvo240 volvo = new Volvo240();
        int initialDirection = volvo.getDirection();
        volvo.turnLeft();
        int newDirection = volvo.getDirection();
        int expectedDirection = (initialDirection + 1) % 4;
        assertTrue(expectedDirection == newDirection);
    }

    @Test
    public void turnRightTest() {
        Volvo240 volvo = new Volvo240();
        int initialDirection = volvo.getDirection();
        volvo.turnRight();
        int newDirection = volvo.getDirection();
        int expectedDirection = (((initialDirection -1) % 4) + 4) % 4;
        assertTrue(expectedDirection == newDirection);
    }

    @Test
    public void moveTest() {
        Volvo240 volvo = new Volvo240();
        double initialXPos = volvo.getX();
        double initialYPos = volvo.getY();
        volvo.move();
        double newXPos = volvo.getX();
        double newYPos = volvo.getY();
        assertTrue(initialXPos == newXPos || initialYPos == newYPos);
    }
}
