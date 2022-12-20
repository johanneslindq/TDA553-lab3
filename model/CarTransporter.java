import java.awt.Color;



public class CarTransporter extends Truck implements CarLoader{
    private CarStorage carStorage;
    private FlatRamp ramp;

    public CarTransporter(int maxCars){
        super(2, Color.GRAY, 100, "Car Transporter", 0, 0);
        this.carStorage = new CarStorage(this, 10);
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
            carStorage.loadCar(car);
        }
    }

    public void unloadCar(Car car){
        if(!ramp.isPlatformRaised()){
            carStorage.unloadCar(car);
        }
    }

}
