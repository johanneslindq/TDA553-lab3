package lab3.model;
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
        if(loadedCars.size() < carCapacity && Math.abs(owner.getX() - car.getX()) <= 10 && Math.abs(owner.getY() - car.getY()) <= 10 && !car.isCarLoaded())  {
            loadedCars.add(car);
            car.setVehicleLoaded(this);
        }
    }

    protected void unloadCar(Car car){
    if(isCarInStorage(car)){
        car.setVehicleUnloaded(owner);
        loadedCars.remove(car);
    }
    }

    public Car getLatestCar(){
        return loadedCars.get(loadedCars.size() - 1);
    }

    public boolean isCarInStorage(Car car){
        return loadedCars.contains(car);
    }

    public CarLoader getOwner(){
        return owner;
    }



}
