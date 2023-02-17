package com.softserve.edu06inher;

public class AppFigure {
    public static void main(String[] args) {
        Figure[] figs = { new Circle(1), new Rectangle(1,1), new Rectangle(1,2) };
        for (Figure current : figs) {
            System.out.println(" objet name = " + current.getClass().getName() + "  area = " + current.getArea());
        }
    }
}
