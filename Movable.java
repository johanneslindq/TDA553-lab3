public abstract class Movable extends Positionable{
    private double currentSpeed; // The current speed
    private int direction; // The direction written as 0-3. 

    public Movable(double x, double y){
        super(x, y);
        this.currentSpeed = 0;
        this.direction = 0;
    }

    protected abstract boolean isMovable();

    public void move(){
        switch (direction){
            case 0: 
            setX(getX() + currentSpeed);
            break;
            case 1:
            setX(getX() - currentSpeed);
            break;
            case 2:
            setY(getY() + currentSpeed);
            break;
            case 3:
            setY(getY() - currentSpeed);
            break;
        }
    }
    
    public void turnLeft(){
        direction += 1;
        direction = direction % 4;
    }
    
    public void turnRight(){
        direction -= 1;
        direction = (((direction % 4) + 4) % 4);
    }

    protected void setCurrentSpeed(double newSpeed){
        currentSpeed = newSpeed;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public int getDirection(){
        return direction;
    }
}
