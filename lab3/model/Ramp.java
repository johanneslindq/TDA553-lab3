package lab3.model;
public abstract class Ramp {
    private Truck owner;

    public Ramp(Truck owner){
        this.owner = owner;
    }

    public boolean isAdjustable(){
        return owner.getCurrentSpeed() == 0;
    }

    public Truck getOwner(){
        return owner;
    }

}
