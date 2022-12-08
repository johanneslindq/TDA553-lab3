import java.awt.*;

public abstract class TrimCar extends Car{
    private final double trimFactor;

    public TrimCar(double trimFactor, int nr_doors, Color color, int power, String model, double x, double y){
        super(nr_doors, color, power, model, x, y);
        this.trimFactor = trimFactor;

    }
    
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
}
