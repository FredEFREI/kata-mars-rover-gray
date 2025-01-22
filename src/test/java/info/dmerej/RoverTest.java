package info.dmerej;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @ParameterizedTest
    @CsvSource({
            "4, 2, 4, 3, NORTH",
            "4, 2, 4, 1, SOUTH",
            "4, 2, 3, 2, WEST",
            "4, 2, 5, 2, EAST"
    })
    void move_forward(int initialX, int initialY, int expectedX, int expectedY, Direction direction) {
        Rover rover = new Rover(initialX, initialY, direction);
        rover.moveForward();
        assertEquals(expectedX, rover.x);
        assertEquals(expectedY, rover.y);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 2, 4, 1, NORTH",
            "4, 2, 4, 3, SOUTH",
            "4, 2, 5, 2, WEST",
            "4, 2, 3, 2, EAST"
    })
    void move_backward(int initialX, int initialY, int expectedX, int expectedY, Direction direction) {
        Rover rover = new Rover(initialX, initialY, direction);
        rover.moveBackward();
        assertEquals(expectedX, rover.x);
        assertEquals(expectedY, rover.y);
    }

    @ParameterizedTest
    @CsvSource({
            "NORTH, WEST",
            "SOUTH, EAST",
            "EAST, NORTH",
            "WEST, SOUTH"
    })
    void turn_left(Direction initialDirection, Direction expectedDirection) {
        Rover rover = new Rover(0, 0, initialDirection);
        rover.turnLeft();
        assertEquals(expectedDirection, rover.direction);
    }

    @ParameterizedTest
    @CsvSource({
            "NORTH, EAST",
            "SOUTH, WEST",
            "EAST, SOUTH",
            "WEST, NORTH"
    })
    void turn_right(Direction initialDirection, Direction expectedDirection) {
        Rover rover = new Rover(0, 0, initialDirection);
        rover.turnRight();
        assertEquals(expectedDirection, rover.direction);
    }


}
