package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 3, 5, 7, 9));
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(9);

        List<Integer> otherNumbers = new ArrayList<>(List.of(2, 4, 6, 8, 9, 3));
//        otherNumbers.add(2);
//        otherNumbers.add(4);
//        otherNumbers.add(6);
//        otherNumbers.add(8);
//        otherNumbers.add(9);
//        otherNumbers.add(3);

        System.out.println(otherNumbers.containsAll(numbers));
        numbers.retainAll(otherNumbers);
        System.out.println("Numbers matches: " + numbers);

    }

}

