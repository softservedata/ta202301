package com.softserve.hw5;

public class AppMain {

    public static void main(String[] args) {
        for (Drinks drinks : Drinks.values()) {
            System.out.println(drinks.getName() + " : " + drinks.getDescription());
        }
    }
}