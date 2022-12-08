import java.awt.*;
public abstract class Dumptruck extends Truck{
    private double platformAngle = 0; 

    public Dumptruck(int nr_doors, Color color, int power, String model, double x, double y){
        super(nr_doors, color, power, model, x, y);
    }

    public void raisePlatform(double amount){
        if(amount <= 70 && amount >=0 && getCurrentSpeed() == 0){
            platformAngle = Math.min (platformAngle + amount, 70);
        }
    }

    public void lowerPlatform(double amount){
        if(amount <= 70 && amount >= 0){
            platformAngle = Math.max(platformAngle + amount, 0);
        }
    }

    public double getPlatformAngle(){
        return platformAngle;
    }

    protected boolean isMovable(){
        return platformAngle == 0;
    }

    


}
