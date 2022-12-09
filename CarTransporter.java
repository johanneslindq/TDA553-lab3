import java.awt.Color;

public class CarTransporter extends Truck{
    private int carCapacity;
    private Car[] loadedCars;
    private FlatRamp ramp;

    public CarTransporter(int maxCars){
        super(2, Color.GRAY, 100, "Car Transporter", 0, 0);
        this.carCapacity = maxCars;
        this.ramp = new FlatRamp(this);
    }

    public boolean isPlatformRaised(){
        return ramp.isPlatformRaised();
    }
    public void adjustPlatform(){
        ramp.adjustPlatform();
    }

    protected boolean isMovable(){
        return ramp.isPlatformRaised();
    }



    
}
