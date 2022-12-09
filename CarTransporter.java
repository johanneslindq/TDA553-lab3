import java.awt.Color;



public class CarTransporter extends Truck{
    private CarLoader carLoader;
    private FlatRamp ramp;

    public CarTransporter(int maxCars){
        super(2, Color.GRAY, 100, "Car Transporter", 0, 0);
        this.carLoader = new CarLoader(this, 10);
        this.ramp = new FlatRamp(this);
        };


    public boolean isPlatformRaised(){
        return ramp.isPlatformRaised();
    }

    public void adjustPlatform(){
        ramp.adjustPlatform();
    }

    protected boolean isMovable(){
        return ramp.isPlatformRaised();
    }

    public void loadCar(Car car){
        if(!ramp.isPlatformRaised()){
            carLoader.loadCar(car);
        }
    }

    public void unloadCar(Car car){
        if(!ramp.isPlatformRaised()){
            carLoader.unloadCar(car);
        }
    }

}
