package info.dmerej;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    void move_backwards_facing_east() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.EAST);
        rover.moveBackward();
        assertEquals(3, rover.x);
        assertEquals(2, rover.y);
    }

    @Test
    void move_backwards_facing_west() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.WEST);
        rover.moveBackward();
        assertEquals(5, rover.x);
        assertEquals(2, rover.y);
    }

    @Test
    void move_backwards_facing_south() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.SOUTH);
        rover.moveBackward();
        assertEquals(4, rover.x);
        assertEquals(3, rover.y);
    }

    @Test
    void turn_left_facing_north() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.NORTH);
        rover.turnLeft();
        assertEquals(Direction.WEST, rover.direction);
    }

    @Test
    void turn_left_facing_east() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.EAST);
        rover.turnLeft();
        assertEquals(Direction.NORTH, rover.direction);
    }

    @Test
    void turn_left_facing_west() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.WEST);
        rover.turnLeft();
        assertEquals(Direction.SOUTH, rover.direction);
    }

    @Test
    void turn_left_facing_south() {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, Direction.SOUTH);
        rover.turnLeft();
        assertEquals(Direction.EAST, rover.direction);
    }

    @ParameterizedTest
    @CsvSource({
            "NORTH, EAST",
            "SOUTH, WEST",
            "EAST, SOUTH",
            "WEST, NORTH"
    })
    void turn_right(Direction initialDirection, Direction expectedDirection) {
        int x = 4;
        int y = 2;
        Rover rover = new Rover(x, y, initialDirection);
        rover.turnRight();
        assertEquals(expectedDirection, rover.direction);
    }


}
