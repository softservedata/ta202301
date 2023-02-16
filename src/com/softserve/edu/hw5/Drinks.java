package com.softserve.edu.hw5;

public enum Drinks {
    WATER("just a clear water"),
    COFFEE("different types of coffee"),
    WINE("different types of wine");

    private String description;

    Drinks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + description;
    }
}


