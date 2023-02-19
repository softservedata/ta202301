package com.softserve.edu.hw5;

public enum Drinks { WATER("Jug of water"), COFFEE("Cup of coffee"), WINE("Bottle of wine");

    private final String description;

    Drinks(String description) {
        this.description = description;
    }
    public String getDescription() {  //method isn`t used because of override below
        return description;
    }

    @Override
    public String toString() {
    return super.toString() + "==>>" + description;  //return enum objects and description
   }
}
