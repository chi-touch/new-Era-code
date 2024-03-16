package turtleGame;

public enum Direction {
    NORTH("WEST", "EAST"),
    EAST("NORTH", "SOUTH"),
    SOUTH("EAST","WEST" ),
    WEST("SOUTH","NORTH");
    private String left;
    private String right;


    Direction(String left, String right) {
        this.left = left;
        this.right = right;

    }
    public Direction turnLeft() {
        return Direction.valueOf(left);

    }

    public Direction turnRight() {
        return Direction.valueOf(right);
    }
}
