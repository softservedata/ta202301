package com.softserve.edu.hw5;

public class Main {
    public static void main(String[] args) {
        Drinks[] myDrinks = Drinks.values();
        for (int i = 0; i < myDrinks.length; i++) {
            System.out.println(myDrinks[i].toString());
        }
    }


}

