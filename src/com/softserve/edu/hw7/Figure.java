package com.softserve.edu.hw7;

abstract class Figure implements Comparable<Figure> {
    public abstract int getPerimeter();
    //comparing the figures perimeter
    public int compareTo(Figure nextFigure) {
        return (getPerimeter() - nextFigure.getPerimeter());
    }
}