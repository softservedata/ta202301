package com.softserve.hw7;
/*Homework 7 (from 22.02.2023)
        1) Написати абстрактний клас Figure з декларацію методу обчислення периметра getPerimeter();
        наслідувати інтерфейс Comparable<Figure> та реалізувати метод compareTo(Figure figure) звертаючись до метода getPerimeter().
        Написати класи Rectangle, Triangle та Square які наслідують Figure та реалізовують метод обчислення периметра.
        Задати масив (або список), який містить об'єкти Rectangle, Square та Triangle (достатньо 5-6 елементів).
        Посортувати фігури по довжині периметра.
        Для коду використати пакет com.softserve.edu.hw7
        Запушати код на github у свою вітку.*/

abstract class Figure implements Comparable<Figure>{
    public abstract int getPerimeter();

    @Override
    public int compareTo(Figure newFigure) {
        return (getPerimeter() - newFigure.getPerimeter());
    }
}
