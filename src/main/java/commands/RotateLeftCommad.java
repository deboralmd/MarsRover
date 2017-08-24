package commands;

import model.Rover;

public class RotateLeftCommad implements Command {
    Rover rover;

    public RotateLeftCommad(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
