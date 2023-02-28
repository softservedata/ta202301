package com.softserve.edu.hw7;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
    @Override
    public String toString() {
        return "Rectangle with perimeter = " + getPerimeter();
    }
}
