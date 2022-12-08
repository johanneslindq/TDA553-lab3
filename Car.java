
import java.awt.*;

public abstract class Car implements Movable{

private final int nrDoors; // Number of doors on the car
private final double enginePower; // Engine power of the car
private double currentSpeed; // The current speed of the car
private Color color; // Color of the car
private final String modelName; // The car model name
private double xPos; // x coordinate
private double yPos; // y  coordinate
private int direction; // The direction written as 0-3. 


public Car(int nr_doors, Color car_color, int power, String model, double xPos, double  yPos){
    this.nrDoors = nr_doors;
    this.color = car_color;
    this.enginePower = power;
    this.modelName = model;
    this.xPos = xPos;
    this.yPos = yPos;
    this.direction = 0;
    stopEngine();
    
}

public void move(){
    switch (direction){
        case 0: 
        yPos = yPos  + currentSpeed;
        break;
        case 1:
        xPos = xPos - currentSpeed;
        break;
        case 2:
        yPos= yPos - currentSpeed;
        break;
        case 3:
        xPos = xPos + currentSpeed;
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


public void startEngine(){
    currentSpeed = 0.1;
}

public void stopEngine(){
    currentSpeed = 0;
}

public void gas(double amount){
    if (amount > 0 && amount <= 1){
        incrementSpeed(amount);
    }
    else{
        System.out.println("Fel gas värde, värdet ska ligga mellan 0 och 1.");
    }
}

public void brake(double amount){

    if (amount < 0 || amount > 1){
        System.out.println("Fel broms värde, värdet ska ligga mellan 0 och 1.");
    }
    else{
        decrementSpeed(amount);
    }
}

private void incrementSpeed(double amount){
    currentSpeed = Math.min(currentSpeed + speedFactor() * amount, enginePower);
}

private void decrementSpeed(double amount){
    currentSpeed = Math.max(currentSpeed - speedFactor() * amount,0);
}

protected abstract double speedFactor();


public void setX(double new_x){
    xPos = new_x;
}
public void setY(double new_y){
    yPos = new_y;
}

public double getX(){
    return xPos;
}
public double getY(){
    return yPos;
}

public int getDirection(){
    return direction;
}
public int getNrDoors(){
    return nrDoors;
}
public double getEnginePower(){
    return enginePower;
}

public double getCurrentSpeed(){
    return currentSpeed;
}

public Color getColor(){
    return color;
}

public void setColor(Color clr){
    color = clr;
}
}