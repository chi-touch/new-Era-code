package turtleGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGame.Direction.*;

class TurtleTest {

    private Turtle turtle;

    @BeforeEach
    public void initializeTurtle(){
        turtle = new Turtle();
    }

    @Test
    public void testTurtlePen(){
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void testTurtleCanMovePenDown(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void testTurtleCanMovePenUp(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void testTurtleCanMoveLeftWhileFacingEast(){

        assertSame(Direction.EAST,turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH,turtle.getCurrentDirection());
    }

    @Test
    public void testTurtleCanMoveLeftWhileFacingNorth(){
        assertEquals(EAST,turtle.getCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST,turtle.getCurrentDirection());
    }

    @Test
    public void testTurtleCanMoveLeftWhileFacingWest(){
        assertEquals(EAST,turtle.getCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH,turtle.getCurrentDirection());
    }
    @Test
    public void testTurtleCanMoveRightWhileFAcing(){
        assertSame(EAST,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
    }


}