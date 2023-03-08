package com.softserve.edu.hw7;

public class Square extends Figure{
        private final int a;

        public Square(int a) {
            this.a = a;
        }
        public int getPerimeter() {
            return a*4;
        }
    //int to string
        public String toString() {
            return "Square perimeter = " + getPerimeter();
        }
}
