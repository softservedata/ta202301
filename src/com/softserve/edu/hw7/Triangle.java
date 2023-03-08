package com.softserve.edu.hw7;

public class Triangle extends Figure{
    private final int a;
    private final int b;
    private final int c;

        public Triangle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public int getPerimeter() {
            return a + b + c;
        }
        public String toString() {
            return "Triangle perimeter = " + getPerimeter();
        }
}
