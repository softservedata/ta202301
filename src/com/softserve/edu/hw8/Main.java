package com.softserve.edu.hw8;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(40);

        ArrayList<Integer> myNumbers2 = new ArrayList<>();
        myNumbers2.add(10);
        myNumbers2.add(15);
        myNumbers2.add(20);
        myNumbers2.add(25);
        myNumbers2.add(15);
        myNumbers2.add(5);

        myNumbers2.retainAll(myNumbers);  //returns the common elements in both list
        System.out.println("Common elements in lists: ");
        System.out.println(myNumbers2);
    }
}
