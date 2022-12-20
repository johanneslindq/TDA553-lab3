public class Position {
    private double xPos; // x coordinate
    private double yPos; // y  coordinate

    public Position(double x, double y){
        this.xPos = x;
        this.yPos = y;
    }

    public double getX(){
        return xPos;
    }

    public double getY(){
        return yPos;
    }

    public void setX(double newX){
        xPos = newX;
    }

    public void setY(double newY){
        yPos = newY;
    }

    public boolean isNear(Positionable object){
        return Math.abs(object.getX() - this.xPos) <= 10 && Math.abs(object.getY() - this.yPos) <= 10;
    }
}
