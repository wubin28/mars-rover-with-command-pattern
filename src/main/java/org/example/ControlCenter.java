package org.example;

// Invoker
public class ControlCenter {
    private Command[] commands;

    public void storeCommands(Command ... commands) {
        this.commands = commands;
    }

    public void performStoredCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
