package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlCenterTest {

    @Test
    void should_move_to_0_1_N_when_move_from_0_0_N() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "N");
        MoveCommand moveCommand = new MoveCommand(marsRover);
        controlCenter.storeCommands(moveCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(1, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_move_to_0_0_W_when_turn_left_from_0_0_N() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "N");
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        controlCenter.storeCommands(turnLeftCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }
}