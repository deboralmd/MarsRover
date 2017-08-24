package core;

import commands.Command;
import model.Rover;

import java.util.ArrayList;

public class RoverClient {

    Rover rover;
    ArrayList<Command> commands;

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public void setCommands(ArrayList<Command> commands) {
        this.commands = commands;
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        System.out.println("Rover Final Position");
        System.out.println(rover.toString());
    }
}
