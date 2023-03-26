package com.softserve.hw7;

public class Square extends Figure{
    private int a;

    public Square(int a) {
        this.a = a;
    }
    @Override
    public int getPerimeter() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "Perimeter of Square = " + getPerimeter();
    }
}
