package org.example;

public class ControlCenterMain {
    public static void main(String[] args) {
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover();
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        MoveCommand moveCommand = new MoveCommand(marsRover);

        controlCenter.storeCommands(turnLeftCommand, moveCommand, turnRightCommand);
        controlCenter.performStoredCommands();
    }
}