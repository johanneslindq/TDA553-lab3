import java.awt.Color;

public class CarTransporter extends Flatbed{
    private int carCapacity;
    private Car[] loadedCars;

    public CarTransporter(int maxCars){
        super(2, Color.GRAY, 100, "Car Transporter", 0, 0);
        this.carCapacity = maxCars;
    }

    public void loadCar(Car carToLoad){
        if (isPlatformRaised() && )
    }
}
