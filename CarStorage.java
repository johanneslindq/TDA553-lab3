import java.util.ArrayList;
import java.lang.Math;

public class CarStorage {
    
    private CarLoader owner;
    private int carCapacity;
    private ArrayList<Car> loadedCars;

    public CarStorage(CarLoader owner, int maxCapacity){
        this.owner = owner;
        this.carCapacity = maxCapacity;
        this.loadedCars = new ArrayList<>(){
        };
    }

    public int getAmountOfLoadedCars(){
        return loadedCars.size();
    }

    protected void loadCar(Car car){
        if(loadedCars.size() < carCapacity && Math.abs(owner.getX() - car.getX()) <= 10 && Math.abs(owner.getY() - car.getY()) <= 10)  {
            car.setVehicleLoaded(this);
            loadedCars.add(car);
        }
    }

    protected void unloadCar(Car car){
        car.setVehicleUnloaded(owner);
        loadedCars.remove(car);
    }

}
