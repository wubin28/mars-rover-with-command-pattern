package org.example;

public class ControlCenterMain {
    public static void main(String[] args) {
        ControlCenter controlCenter = new ControlCenter();
        MarsRover marsRover = new MarsRover(0, 0, "N");
        TurnLeftCommand turnLeftCommand = new TurnLeftCommand(marsRover);
        TurnRightCommand turnRightCommand = new TurnRightCommand(marsRover);
        MoveCommand moveCommand = new MoveCommand(marsRover);

        controlCenter.storeCommands(moveCommand, turnLeftCommand, turnRightCommand, moveCommand, moveCommand);
        controlCenter.performStoredCommands();
        System.out.println(marsRover.toString());
    }
}