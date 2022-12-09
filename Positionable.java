public abstract class Positionable {
    private double xPos; // x coordinate
    private double yPos; // y  coordinate

    public Positionable(double x, double y){
        this.xPos = x;
        this.yPos = y;
    }

    public double getX(){
        return xPos;
    }

    public double getY(){
        return yPos;
    }

    protected void setX(double newX){
        xPos = newX;
    }

    protected void setY(double newY){
        yPos = newY;
    }
}

