package commands;

import model.Rover;

public class RotateRightCommand implements Command {
    Rover rover;

    public RotateRightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
