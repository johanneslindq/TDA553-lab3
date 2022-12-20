package lab3.model;
public class FlatRamp extends Ramp{
    private boolean isRaised = true;

    public FlatRamp(Truck owner){
        super(owner);
    }

    public boolean isPlatformRaised(){
        return isRaised;
    }

    public void adjustPlatform(){
        if(isAdjustable()) {
            isRaised = !isRaised;
        }   
    }


}