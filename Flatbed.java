import java.awt.*;

public abstract class Flatbed extends Truck{
private boolean platformRaised = true;

public Flatbed(int nr_doors, Color color, int power, String model, double x, double y){
    super(nr_doors, color, power, model, x, y);
}

public void raisePlatform(){
    platformRaised = true;
}   

public void lowerPlatform(){
    if(getCurrentSpeed() == 0){
        platformRaised = false;
    }
    else{
        System.out.println("Cannot lower ramp when moving.");
    }
}

public boolean isPlatformRaised(){
    return platformRaised;
}

protected boolean isMovable(){
    return platformRaised;
}


}
