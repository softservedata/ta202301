package com.softserve.edu.hw5;
/*
Створити еnum Drinks з трьома екземплярами об'єктів WATER, COFFEE, WINE.
 Реалізувати у Drinks конструктор з параметром description.
 Додати також поле description та методи getDescription() та toString().
 В основній програмі в циклі вивести всі описи об'єктів.
 */

public enum Drinks {
    WATER("Glass of water"),
    COFFEE("Cup of coffee"),
    WINE("Glass of wine");

    private final String description;

    Drinks(String description) {
        this.description = description;
    }

    public String getDescription(){
        return "Current drink { " +
                "title='"+ description +
                "' }";
    };

    @Override
    public String toString() {
        return description;
    }
}

class AppEnum {
    public static void main(String[] args) {
        Drinks drinks = Drinks.COFFEE;
        System.out.println(drinks.getDescription());

        for(Drinks current : Drinks.values()){
            System.out.println("Drink -> " + current);
        }
    }

}
