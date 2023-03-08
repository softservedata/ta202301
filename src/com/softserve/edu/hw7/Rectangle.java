package com.softserve.edu.hw7;

public class Rectangle extends Figure{
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getPerimeter() {
        return (a + b)*2;
    }
    public String toString() {
        return "Rectangle perimeter = " + getPerimeter();
    }
}

