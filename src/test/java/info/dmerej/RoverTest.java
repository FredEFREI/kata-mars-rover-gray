package info.dmerej;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void move_forward_facing_north() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.NORTH);
        rover.moveForward();
        assertEquals(4, rover.x);
        assertEquals(3, rover.y);
    }

    @Test
    void move_forward_facing_east() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.EAST);
        rover.moveForward();
        assertEquals(5, rover.x);
        assertEquals(2, rover.y);
    }

    @Test
    void move_forward_facing_west() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.WEST);
        rover.moveForward();
        assertEquals(3, rover.x);
        assertEquals(2, rover.y);
    }

    @Test
    void move_forward_facing_south() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.SOUTH);
        rover.moveForward();
        assertEquals(4, rover.x);
        assertEquals(1, rover.y);
    }

    @Test
    void move_backwards_facing_north() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.NORTH);
        rover.moveBackward();
        assertEquals(4, rover.x);
        assertEquals(1, rover.y);
    }


}
