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
        } else if ("W".equals(this.direction)) {
            this.direction = "S";
        } else if ("S".equals(this.direction)) {
            this.direction = "E";
        } else if ("E".equals(this.direction)) {
            this.direction = "N";
        }
    }

    public void turnRight() {
        if ("N".equals(this.direction)) {
            this.direction = "E";
        } else if ("E".equals(this.direction)) {
            this.direction = "S";
        } else if ("S".equals(this.direction)) {
            this.direction = "W";
        } else if ("W".equals(this.direction)) {
            this.direction = "N";
        }
    }

    public void move() {
        if ("N".equals(this.direction)) {
            this.yCoordinate++;
        } else if ("E".equals(this.direction)) {
            this.xCoordinate++;
        } else if ("S".equals(this.direction)) {
            this.yCoordinate--;
        } else if ("W".equals(this.direction)) {
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

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public String getDirection() {
        return this.direction;
    }
}
