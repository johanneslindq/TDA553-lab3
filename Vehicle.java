
import java.awt.*;

public abstract class Vehicle extends Movable{

    private final int nrDoors; // Number of doors on the car
    private final double enginePower; // Engine power of the car
    private Color color; // Color of the car
    private final String modelName; // The car model name
    private boolean isLoaded;
    private CarLoader carLoader;

    public Vehicle(int nr_doors, Color car_color, int power, String model, double xPos, double yPos){
        super(xPos, yPos);
        this.nrDoors = nr_doors;
        this.color = car_color;
        this.enginePower = power;
        this.modelName = model;
        this.isLoaded = false;
        stopEngine();
    }
    

    public void setVehicleLoaded(CarLoader carLoader){
        if (!isLoaded){
            isLoaded = true;
            this.carLoader = carLoader;
        }
    }

    public void setVehicleUnloaded(Positionable carLoaderOwner){
        if (isLoaded){
            isLoaded = false;
            setX(carLoaderOwner.getX() - 10);
            setY(carLoaderOwner.getY() - 10);
            carLoader = null;
        }
    }

    public void startEngine(){
        setCurrentSpeed(0.1);
    }
    
    public void stopEngine(){
        setCurrentSpeed(0);
    }
    
    public void gas(double amount){
        if (isMovable()){
            if (amount > 0 && amount <= 1){
                incrementSpeed(amount);
            }
            else{
              System.out.println("Fel gas värde, värdet ska ligga mellan 0 och 1.");
            }
        }
    }
    
    public void brake(double amount){
    
        if (amount < 0 || amount > 1){
            System.out.println("Fel broms värde, värdet ska ligga mellan 0 och 1.");
        }
        else{
            decrementSpeed(amount);
        }
    }
    
    protected void incrementSpeed(double amount){
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower));
    }
    
    protected void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }
    
    protected abstract double speedFactor();    
    
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setColor(Color clr){
        color = clr;
    }
    
    
    

}
