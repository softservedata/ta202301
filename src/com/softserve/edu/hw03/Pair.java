package com.softserve.edu.hw03;


public class Pair {
    private int first;
    private int second;

    public Pair() {  // Overload
        first = 1;
        second = 2;
    }

    public Pair(int first, int second) {  // Overload
        this.first = first;
        this.second = second;
    }

    public void print() {
        System.out.println("x=" + this.first + " y=" + this.second);

    }
}
