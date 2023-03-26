package com.softserve.hw7;

import java.util.Arrays;

public class FigureApp {
    public static void main (String[] args) {
        Figure[] figure = {
                new Rectangle(18, 12),
                new Triangle(10, 20, 15),
                new Square(7),
                new Triangle(7, 8, 12),
                new Rectangle(15, 19)};
        Arrays.sort(figure);
       System.out.println("Figures Perimeter: " + Arrays.toString(figure)); };

    }