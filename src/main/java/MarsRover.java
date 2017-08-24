import commands.Command;
import commands.MoveCommand;
import commands.RotateLeftCommad;
import commands.RotateRightCommand;
import core.RoverClient;
import model.Direction;
import model.Position;
import model.Rover;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MarsRover {

    public static void main(String[] args) {
        String file = MarsRover.class.getResource("input").getFile();
        RoverClient roverClient = new RoverClient();
        File input = new File(file);
        try {
            Scanner fileScanner = new Scanner(input);
            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine().replaceAll(" ", "");
                if (currentLine.length() == 3) {
                    System.out.println("Rover Initial position");
                    Rover rover = getRover(currentLine);
                    System.out.println(rover.toString());
                    roverClient.setRover(rover);
                }

                if (currentLine.length() > 3) {
                    Rover currentRover = roverClient.getRover();
                    roverClient.setCommands(getCommandsForRover(currentLine, currentRover));
                    roverClient.executeCommands();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Command> getCommandsForRover(String currentLine, Rover currentRover) {
        ArrayList<Command> nasaCommands = new ArrayList<>();
        for (String instruction : currentLine.split("")) {
            if (instruction.equalsIgnoreCase("L")) {
                nasaCommands.add(new RotateLeftCommad(currentRover));
            }
            if (instruction.equalsIgnoreCase("R")) {
                nasaCommands.add(new RotateRightCommand(currentRover));
            }

            if (instruction.equalsIgnoreCase("M")) {
                nasaCommands.add(new MoveCommand(currentRover));
            }
        }
        return nasaCommands;
    }

    private static Rover getRover(String currentLine) {
        int x = Integer.parseInt(String.valueOf(currentLine.charAt(0)));
        int y = Integer.parseInt(String.valueOf(currentLine.charAt(1)));
        Direction initialDirection = null;
        if (String.valueOf(currentLine.charAt(2)).equalsIgnoreCase("N")) {
         initialDirection = Direction.North;
        }
        if (String.valueOf(currentLine.charAt(2)).equalsIgnoreCase("E")) {
            initialDirection = Direction.East;
        }
        Position initialPosition = new Position(x,y, initialDirection);
        return new Rover(initialPosition);
    }
}
