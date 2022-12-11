
import java.awt.*;

public abstract class Vehicle{

    private final int nrDoors; // Number of doors on the car
    private final double enginePower; // Engine power of the car
    private Color color; // Color of the car
    private final String modelName; // The car model name
    private boolean isLoaded;
    private CarStorage carStorage;
    private Vector vector;

    public Vehicle(int nr_doors, Color car_color, int power, String model, double xPos, double yPos){
        this.vector = new Vector(xPos, yPos);
        this.nrDoors = nr_doors;
        this.color = car_color;
        this.enginePower = power;
        this.modelName = model;
        this.isLoaded = false;
        stopEngine();
    }
    

    /* Methods to load and unload the vehicle. When unloaded, the vehicle is placed some distance away from it's "carrier". */
    public void setVehicleLoaded(CarStorage carStorage){
        if (!isLoaded){
            isLoaded = true;
            this.carStorage = carStorage;
        }
    }

    public void setVehicleUnloaded(CarLoader carStorageOwner){
        if (isLoaded){
            isLoaded = false;
            vector.setX(carStorageOwner.getX() - 10);
            vector.setY(carStorageOwner.getY() - 10);
            carStorage = null;
        }
    }

    public void startEngine(){
        vector.setCurrentSpeed(0.1);
    }
    
    public void stopEngine(){
        vector.setCurrentSpeed(0);
    }
    

    /* Methods to gas and brake, has sanity checks to make sure the values is between 0 and 1 and gives an error message if not. */
    public void gas(double amount){
        if (isMovable()){
            if (isValidAmount(amount)){
                incrementSpeed(amount);
            }
            else{
              System.out.println("Fel värde, värdet ska ligga mellan 0 och 1.");
            }
        }
    }
    
    public void brake(double amount){
        if (isValidAmount(amount)){
            decrementSpeed(amount);
        }
        else{
            System.out.println("Fel värde, värdet ska ligga mellan 0 och 1.");
        }
    }
    

    /* Methods to increase or decrease the speed, has sanity checks to make sure it doesn't go above it's limits. */

    protected void incrementSpeed(double amount){
        vector.setCurrentSpeed(Math.min(vector.getCurrentSpeed() + speedFactor() * amount, enginePower));
    }
    
    protected void decrementSpeed(double amount){
        vector.setCurrentSpeed(Math.max(vector.getCurrentSpeed() - speedFactor() * amount,0));
    }
    
    
    

    /* Getters for the attributes you might want, aswell as a setColor in case you want to repaint your vehicle */

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }
    public String getModelName(){
        return modelName;
    }
    public Color getColor(){
        return color;
    }

    public double getCurrentSpeed(){
        return vector.getCurrentSpeed();
    }

    public double getDirection(){
        return vector.getDirection();
    }

    public double getX(){
        return vector.getX();
    }

    public double getY(){
        return vector.getY();
    }

    public void move(){
        vector.move();
    }
    
    public void setColor(Color clr){
        color = clr;
    }

    /* Method to check if the gas/brake is between 0 and 1, as to reduce code redundancy. */

    private boolean isValidAmount(double amount){
        return amount > 0 && amount <= 1;
    }
    
    /* Abstract method for isMovable and speedFactor that needs to be implemented by all subclasses */
    protected abstract boolean isMovable();
    protected abstract double speedFactor();    
    
    

}
