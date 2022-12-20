package lab3.model;
import java.awt.*;
public abstract class Dumptruck extends Truck{
    private DumpRamp ramp;


    public Dumptruck(int nr_doors, Color color, int power, String model, double x, double y){
        super(nr_doors, color, power, model, x, y);
        this.ramp = new DumpRamp(this, 70);
    }

    public int getPlatformAngle(){
        return ramp.getPlatformAngle();
    }
    
    public void adjustPlatform(int amount){
        ramp.adjustPlatform(amount);
    }

    protected boolean isMovable(){
        return ramp.getPlatformAngle() == 0;
    }

    


}
