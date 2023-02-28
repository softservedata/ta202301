package com.softserve.edu.hw7;


public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square with perimeter = " + getPerimeter();
    }
}
