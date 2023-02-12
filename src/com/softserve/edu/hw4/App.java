package com.softserve.edu.hw4;
import java.util.Scanner; //Import Scanner class

public class App {
    public static void main(String[] args) {
//Create Scanner object
        Scanner reader = new Scanner(System.in);
//Enter int numbers
        System.out.print("Enter three numbers -> ");
        int x = reader.nextInt();
        int y = reader.nextInt();
        int z = reader.nextInt();

//Find min, max by using Math library
        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        int mid = x + y + z - max - min;
        System.out.printf("Numbers in order: %d %d %d", min, mid, max);
    }
}
