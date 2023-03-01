package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,3,6,7,8));
        System.out.println(numbers);

        List<Integer> numbers1 = new ArrayList<>(List.of(1,6,37,8,2));
        System.out.println(numbers1);

        boolean isContain = numbers1.containsAll(numbers);
        System.out.println(isContain);

        numbers.retainAll(numbers1);
        System.out.println(numbers);
    }
}
