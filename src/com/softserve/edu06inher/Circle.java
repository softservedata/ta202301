package com.softserve.edu06inher;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (3.14 * (radius * 2));
    }

}
