package Turtle;

import static Turtle.Direction.*;
public class Turtle {
    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);

    public boolean isPenUp() {
        return true;
    }

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penDown() {
        biro.penDown();
    }

    public void penUp() {
        biro.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == SOUTH) currentDirection = WEST;
        if(currentDirection == EAST) currentDirection = SOUTH;
    }

    public void turnLeft() {
        if(currentDirection == NORTH) currentDirection = WEST;
        if(currentDirection == EAST) currentDirection = NORTH;

    }

    public void move(int noOfSteps) {
        if(currentDirection == EAST) increaseColumnBy(noOfSteps);
    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition= currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition+noOfSteps-1);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
