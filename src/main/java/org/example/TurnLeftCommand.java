package org.example;

public class TurnLeftCommand implements Command {
    private final MarsRover marsRover;

    public TurnLeftCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.turnLeft();
    }
}
