package com.softserve.edu.hw7;

public abstract class Figure implements Comparable<Figure> {
    public abstract int getPerimeter();

    @Override
    public int compareTo(Figure figure) {
        if (this.getPerimeter() > figure.getPerimeter()) {
            return 1;
        } else if (this.getPerimeter() < figure.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }

}
