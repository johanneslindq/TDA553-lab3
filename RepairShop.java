
public class RepairShop extends Positionable{
    private CarLoader carLoader;

    public RepairShop(double x, double y, int carCapacity){
        super(x, y);
        this.carLoader = new CarLoader(this, carCapacity);
    }

    public void loadCar(Car car){
        carLoader.loadCar(car);
    }

    public void unloadCar(Car car){
        carLoader.unloadCar(car);
    }

}
