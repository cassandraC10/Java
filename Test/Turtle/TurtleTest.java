package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.Direction.*;
import static org.testng.AssertJUnit.*;
public class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public void setup(){
        turtle = new Turtle();
    }
    @Test
    public void turtleExistsTest(){
        assertNotNull(turtle);
    }

    @Test
    public void turtlePenIsUpByDefaultTest(){
        turtle.isPenDown();
        assertFalse(turtle.isPenDown());
    }

    @Test
    public void turtlePenMoveDownTest(){
        turtle.isPenUp();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertTrue(turtle.isPenDown());
    }

    @Test
    public void turtlePenMoveUpWhenDownTest(){
        turtle.penDown();
        assertTrue(turtle.isPenDown());
        turtle.penUp();
        assertFalse(turtle.isPenDown());
    }

    @Test
    public void turtlePositionIsEastByDefaultTest(){
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveRightFromEastTest(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveRightFromSouthTest(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtlePositionIsFacingEastTest(){
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveLeftFromEastTest(){
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveLeftFromNorthTest(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardFacingEastTest(){
        turtle.move(3);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
    }

}

