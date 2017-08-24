package model;

public class Position {

    private int x;
    private int y;
    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void rotateLeft() {
        this.direction = direction.left();
    }

    public void rotateRight() {
        this.direction = direction.right();
    }

    @Override
    public String toString() {
        return "Position { X = " + x + " Y = " + y + " Direction = " + direction + " }";
    }
}
