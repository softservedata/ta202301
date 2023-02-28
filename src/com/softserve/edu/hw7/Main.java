package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(8);
        Square square2 = new Square(7);
        System.out.println("square1 perimeter = " + square1.getPerimeter());
        System.out.println("square2 perimeter = " + square2.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(6, 7);
        System.out.println("rectangle1 perimeter = " + rectangle1.getPerimeter());
        System.out.println("rectangle 2 perimeter = " + rectangle2.getPerimeter());

        Triangle triangle1 = new Triangle(1, 2, 3);
        Triangle triangle2 = new Triangle(4, 5, 6);
        System.out.println("triangle1 perimeter = " + triangle1.getPerimeter());
        System.out.println("triangle2 perimeter = " + triangle2.getPerimeter());


        List<Figure> figures = new ArrayList<>(List.of(square1, square2, rectangle1, rectangle2, triangle1, triangle2));
        System.out.println("Figures before sorting " + figures);
        Collections.sort(figures);
        System.out.println("Figures after sorting " + figures);
    }

}
