package com.softserve.edu.hw7;

import java.util.Arrays;
import java.util.Collections; //used to sort using descending order

public class Main {
    public static void main(String[] args) {
        Figure[] arr;                // Declaring an array of objects
        arr = new Figure[6];         // Allocating memory for 5 objects of type figure
        // Initializing the array elements
        arr[0] = new Rectangle(1,5);
        arr[1] = new Square(5);
        arr[2] = new Triangle(11,2,2);
        arr[3] = new Square(1);
        arr[4] = new Triangle(4,8,2);
        arr[5] = new Square(7);

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Perimeters in descending order: " + Arrays.toString(arr));
    }

}