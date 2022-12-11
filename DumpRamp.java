public class DumpRamp extends Ramp{
    private int platformAngle = 0;
    private final int maxAngle;


    public DumpRamp(Truck owner, int maxAngle){
        super(owner);
        this.maxAngle = maxAngle;
    }

    public int getPlatformAngle(){
        return platformAngle;
    }
    
    public void adjustPlatform(int amount){
        if(isAdjustable() && amount <= maxAngle && amount >= 0) {
            platformAngle =  amount;
        }
        else{
            System.out.println("Värdet måste ligga mellan 0 och " + maxAngle + ".");
        }   
    }
}
