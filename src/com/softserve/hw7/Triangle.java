package com.softserve.hw7;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Perimeter of Triangle = " + getPerimeter();
    }
}
