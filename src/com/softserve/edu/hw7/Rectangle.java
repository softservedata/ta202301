package com.softserve.edu.hw7;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "\nRectangle { perimeter = " + getPerimeter() + " }";
    }
}
