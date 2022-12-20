package lab3.model;
import java.awt.*;

public abstract class TurboCar extends Car{

    private boolean turboOn;
    private double turboValue;

    public TurboCar(double turboValue, int nr_doors, Color color, int power, String model, double x, double y){
        super(nr_doors, color, power, model, x, y);
	    this.turboOn = false;
        this.turboValue = turboValue;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }

    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = turboValue;
        return getEnginePower() * 0.01 * turbo;
    }

    protected boolean isMovable(){
        return true;
    }
}