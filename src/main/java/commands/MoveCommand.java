package commands;

import model.Rover;

public class MoveCommand implements Command {
    Rover rover;


    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.moveForward();
    }
}
