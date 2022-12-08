import java.awt.*;
public abstract class Truck extends Car{

    public Truck(int nr_doors, Color color, int power, String model, double x, double y){
        super(nr_doors, color, power, model, x, y);
    }

    protected double speedFactor(){
        return getEnginePower() * 0.01;
    }
    protected void truckIsMoving(){
        System.out.println("Truck is moving.");
    }

    protected abstract void raisePlatform();
    protected abstract void lowerPlatform();

    }

