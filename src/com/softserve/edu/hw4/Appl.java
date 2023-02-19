package com.softserve.edu.hw4;

import java.util.Scanner; //Import Scanner class
import java.util.Arrays; //Import Arrays class

public class Appl {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any 3 integer numbers: ");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = read.nextInt();
        int[] arr = {a, b, c}; //prepare the array using out values

        Arrays.sort(arr);  // sorting with array using the Arrays default class
        int min = arr[0];
        int max = arr[2];
        int med = arr[1];

        System.out.println(max + " - is the maximum value");
        System.out.println(med + " - is in the middle");
        System.out.println(min + " - is the minimum value");


    }
}
