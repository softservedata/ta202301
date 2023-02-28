package com.softserve.edu.hw7;

abstract class Figure implements Comparable<Figure> {
    public abstract double getPerimeter();

    public int compareTo(Figure anotherFigure) {

        return (int) (getPerimeter() - anotherFigure.getPerimeter());

    }
}



