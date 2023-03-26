package com.softserve.hw7;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Perimeter of Rectangle = " + getPerimeter();
    }
}
