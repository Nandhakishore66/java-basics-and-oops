package com.naveen;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Practice for scanner-----> Getting input from the user
        byte num;
        short num1;
        int num2;
        long num3;
        float num4;
        double num5;

        // We can get multiple inputs from a single declaration of scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numbers");

        // Whatever the data type we have used we need to use the same in (nextMethod)
        num = input.nextByte();
        num1 = input.nextShort();
        num2 = input.nextInt();
        num3 = input.nextLong();
        num4 = input.nextFloat();
        num5 = input.nextDouble();
        System.out.println("Entered number for byte:" + num);
        System.out.println("Entered number for short:" + num1);
        System.out.println("Entered number for int:" + num2);
        System.out.println("Entered number for long:" + num3);
        System.out.println("Entered number for float:" + num4);
        System.out.println("Entered number for double:" + num5);
    }
}
