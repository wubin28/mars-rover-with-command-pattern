package org.example;

public class MoveCommand implements Command {
    private final MarsRover marsRover;

    public MoveCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.move();
    }
}
