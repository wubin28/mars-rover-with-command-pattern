package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// To check out the Command Pattern, refer to https://www.jianshu.com/p/da8712663542
// Client
class ControlCenterTest {

    @Test
    void should_go_to_0_1_N_When_move_Given_from_0_0_N() {
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
    void should_go_to_0_0_W_When_turn_left_Given_from_0_0_N() {
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

    @Test
    void should_go_to_0_0_E_When_turn_right_Given_from_0_0_N() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "N");
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        controlCenter.storeCommands(turnRightCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_minus_1_S_When_move_Given_from_0_0_S() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "S");
        MoveCommand moveCommand = new MoveCommand(marsRover);
        controlCenter.storeCommands(moveCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(-1, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_E_When_turn_left_Given_from_0_0_S() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "S");
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        controlCenter.storeCommands(turnLeftCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_W_When_turn_right_Given_from_0_0_S() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "S");
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        controlCenter.storeCommands(turnRightCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_1_0_E_When_move_Given_from_0_0_E() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "E");
        MoveCommand moveCommand = new MoveCommand(marsRover);
        controlCenter.storeCommands(moveCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(1, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_When_turn_left_Given_from_0_0_E() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "E");
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        controlCenter.storeCommands(turnLeftCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_When_turn_right_Given_from_0_0_E() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "E");
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        controlCenter.storeCommands(turnRightCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_minus_1_0_W_When_move_Given_from_0_0_W() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "W");
        MoveCommand moveCommand = new MoveCommand(marsRover);
        controlCenter.storeCommands(moveCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(-1, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_S_When_turn_left_Given_from_0_0_W() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "W");
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        controlCenter.storeCommands(turnLeftCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_0_N_When_turn_right_Given_from_0_0_W() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "W");
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        controlCenter.storeCommands(turnRightCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(0, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_go_to_0_3_N_When_MLRMM_Given_from_0_0_N() {
        // given
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "N");
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        MoveCommand moveCommand = new MoveCommand(marsRover);
        controlCenter.storeCommands(moveCommand, turnLeftCommand, turnRightCommand, moveCommand, moveCommand);

        // when
        controlCenter.performStoredCommands();

        // then
        assertEquals(0, marsRover.getXCoordinate());
        assertEquals(3, marsRover.getYCoordinate());
        assertEquals("N", marsRover.getDirection());
    }
}