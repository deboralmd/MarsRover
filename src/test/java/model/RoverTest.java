package model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class RoverTest {
    Rover rover;

    @Before
    public void before() {
        Position p = new Position(3,3,Direction.North);
        this.rover = new Rover(p);
    }

    @After
    public void after() { }

    @Test
    public void testTurnLeft() {
        //given:
        rover.turnLeft();
        //then:
        Assert.assertEquals(Direction.West, rover.getPosition().getDirection());
    }

    @Test
    public void testTurnRight() {
        //given:
        rover.turnRight();
        //then:
        Assert.assertEquals(Direction.East, rover.getPosition().getDirection());
    }

    @Test
    public void testMoveForward() {
        //given:
        rover.moveForward();
        //then:
        Assert.assertEquals(4,rover.getPosition().getY());
    }

} 
