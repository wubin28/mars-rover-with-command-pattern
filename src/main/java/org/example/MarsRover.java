package org.example;

public class MarsRover {
    private int xCoordinate;
    private int yCoordinate;
    private String direction;

    public MarsRover(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void turnLeft() {
        if ("N".equals(this.direction)) {
            this.direction = "W";
        }
        if ("W".equals(this.direction)) {
            this.direction = "S";
        }
        if ("S".equals(this.direction)) {
            this.direction = "E";
        }
        if ("E".equals(this.direction)) {
            this.direction = "N";
        }
    }

    public void turnRight() {
        if ("N".equals(this.direction)) {
            this.direction = "E";
        }
        if ("E".equals(this.direction)) {
            this.direction = "S";
        }
        if ("S".equals(this.direction)) {
            this.direction = "W";
        }
        if ("W".equals(this.direction)) {
            this.direction = "N";
        }
    }

    public void move() {
        if ("N".equals(this.direction)) {
            this.yCoordinate++;
        }
        if ("E".equals(this.direction)) {
            this.xCoordinate++;
        }
        if ("S".equals(this.direction)) {
            this.yCoordinate--;
        }
        if ("W".equals(this.direction)) {
            this.xCoordinate--;
        }
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", direction='" + direction + '\'' +
                '}';
    }
}
