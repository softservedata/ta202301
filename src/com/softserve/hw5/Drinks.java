package com.softserve.hw5;
/* 1) Створити еnum Drinks з трьома екземплярами об'єктів WATER, COFFE, WINE.
        Реалізувати у Drinks конструктор з параметром description.
        Додати також поле description та методи getDescription() та toString().
        В основній програмі в циклі вивести всі описи об'єктів.
        Для коду використати пакет com.softserve.edu.hw5
        Запушати код на github у свою вітку.*/

public enum Drinks {
    WATER ("Simple drink", "Water"),
    COFFEE ("Hot drink", "Coffee"),
    WINE ("Alcohol", "Wine");

private String description;
private String name;

    Drinks(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "description='" + description + '\'' +
                '}';
    }
}
