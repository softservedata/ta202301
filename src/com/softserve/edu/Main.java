package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //
        System.out.print("Hello all. What is your name? ");
        String name = br.readLine();
        System.out.print("How old are you? ");
        int age = Integer.parseInt(br.readLine());
        //
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        //
        br.close();
        */
        //
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("Hello everybody. Could you please clarify what is your name? ");
        String name = sc.nextLine();
        System.out.print("How old are you? ");
        int age = sc.nextInt();
        //
        System.out.println("Welcome " + name);
        System.out.println("You are " + age);
        //
        sc.close();
    }
}
