package model;

public class Rover {

    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void turnLeft() {
        position.rotateLeft();
    }

    public void turnRight() {
        position.rotateRight();
    }

    public void moveForward() {
        if (position.getDirection().equals(Direction.North)) {
            position.setY(position.getY() + 1);
        }

        if (position.getDirection().equals(Direction.South)) {
            position.setY(position.getY() - 1);
        }

        if (position.getDirection().equals(Direction.East)) {
            position.setX(position.getX() + 1);
        }

        if (position.getDirection().equals(Direction.West)) {
            position.setX(position.getX() -1);
        }
    }

    @Override
    public String toString() {
        return "Rover { " + position + " } ";
    }
}
