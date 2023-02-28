package com.softserve.edu.hw7;

import java.util.Arrays;

public class AppFigure {

    public static void main(String[] args) {

        Figure[] figures = {
            new Rectangle(3, 6),
            new Square(9),
            new Triangle(3, 4, 7),
            new Rectangle(2, 5),
            new Square(5),
            new Triangle(5, 12, 13)
        };

    System.out.println("Original arrays: " + Arrays.toString(figures));

    Arrays.sort(figures);

    System.out.println("\nSorted arrays: " + Arrays.toString(figures));
    }
}