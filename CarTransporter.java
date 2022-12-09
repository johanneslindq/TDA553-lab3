import java.awt.Color;
import java.util.ArrayList;
import java.lang.Math;


    public class CarTransporter extends Truck implements CarLoader{
    private int carCapacity;
    private ArrayList<Car> loadedCars;
    private FlatRamp ramp;

    public CarTransporter(int maxCars){
        super(2, Color.GRAY, 100, "Car Transporter", 0, 0);
        this.carCapacity = maxCars;
        this.ramp = new FlatRamp(this);
        this.loadedCars = new ArrayList<>(){
        };
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

    public int getAmountOfLoadedCars(){
        return loadedCars.size();
    }

    public void loadCar(Car car){
        if(loadedCars.size() < carCapacity && Math.abs(this.getX() - car.getX()) <= 10 && Math.abs(this.getY() - car.getY()) <= 10 && !ramp.isPlatformRaised())  {
            car.setVehicleLoaded(this);
            loadedCars.add(car);
        }
    }

    public void unloadCar(Car car){
        if (!ramp.isPlatformRaised()){
        car.setVehicleUnloaded();
        loadedCars.remove(car);
    }
    }



    
}
