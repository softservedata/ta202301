package com.softserve.edu.hw7;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getPerimeter() {
        return side * 4;
    }

    public String toString() {
        return "\nSquare { perimeter = " + getPerimeter() + " }";
    }
}
