package lab3.model;
public class RepairShop implements CarLoader{
    private CarStorage carStorage;
    private Position position;

    public RepairShop(double x, double y, int carCapacity){
        this.position = new Position(x, y);
        this.carStorage = new CarStorage(this, carCapacity);
    }

    public void loadCar(Car car){
        carStorage.loadCar(car);
    }

    public double getX(){
        return position.getX();
    }

    public double getY(){
        return position.getY();
    }
    
    public void unloadCar(Car car){
        carStorage.unloadCar(car);
    }

}
