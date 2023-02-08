package com.softserve.edu.hw3;

public class Pair {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    void print() {
        System.out.println("first = " + first + ", second = " + second);
    }
}
