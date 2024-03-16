package turtleGame;

import static turtleGame.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private Direction currentDirection = EAST;


    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public void penUp() {
        isPenUp = true;
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();

    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

}
