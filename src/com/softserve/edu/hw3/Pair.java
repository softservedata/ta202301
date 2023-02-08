package com.softserve.edu.hw3;

public class Pair {
    private int amountOfHours;
    private int amountOfPairs;

    public Pair(int amountOfHours, int amountOfPairs) {
        this.amountOfHours = amountOfHours;
        this.amountOfPairs = amountOfPairs;
    }
    public void print() {
        System.out.println(this.amountOfHours);
        System.out.println(this.amountOfPairs);
    }
}
