package com.naveen;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        num = input.nextInt();

        // For loop with increment operator
        for (int i=1; i<=num; i++) {
            System.out.println("Hi bro");
        }

        //For loop with decrement operator
        for (int i=4; i>=num; i--) {
            System.out.println("Hi man");
        }

        //While loop
        while(num > 0) {
            System.out.println("Hi dude");
            num--;
        }

        //do while
        int value = 3;
        do {
            System.out.println("Hi ji");
            value--;
        } while(value > 0);

        // For each loop -- Specially used to iterate array

        //This is normal for loop not an for each
        String[] vegetables = {"onion", "carrot", "beans", "brinjal", "cabbage"};

        // Array starts from 0 but length starts from 1 so now length is 4 array 0 1 2 3.
        for (int i=0; i<vegetables.length; i++) {
            System.out.println(vegetables[i]);
            // This will print except onion because we have given i=1
        }

        // Printing the same in reverse by using for loop
        // Array starting from 0 so if we did not use -1 it will throw array out of exception
        for(int i=vegetables.length-1; i>=0; i--) {
            System.out.println(vegetables[i]);
        }

        // How to use the same in for each
        for(String vegetable : vegetables) {
            System.out.println(vegetable);
        }

    }
}
