public class Flatbed extends Truck{
    private int platformPosition;

    
    protected void raisePlatform() {
       if (getCurrentSpeed() == 0){
            switch (platformPosition){
                case 0:
                platformPosition = 1;
                break;
                case 1:
                platformPosition = 0;
                break;
            }
       }
       else{
       truckIsMoving();
        }
    }

    @Override
    public void gas(double amount){
        if (platformPosition == 1) {
            if (amount > 0 && amount <= 1){
                incrementSpeed(amount);
            }
            else{
                System.out.println("Fel gas värde, värdet ska ligga mellan 0 och 1.");
            }
        }
    }

}
