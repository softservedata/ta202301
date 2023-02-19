package com.softserve.edu.hw5;

public class Appl {
    public static void main(String[] args) {
        for (Drinks drinks : Drinks.values())       //for all enum objects
            System.out.println(drinks.toString());  //print all objects with description
    }
}