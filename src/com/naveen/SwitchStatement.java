package com.naveen;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        name = input.nextLine();
        switch (name) {
            case "raj kumar" :
                System.out.println("The entered name is:" + name);
                break;
            case "virat kohli" :
                System.out.println("The entered name is:" + name);
                break;
            case "ms dhoni" :
                System.out.println("The entered name is:" + name);
                break;
            case "king kohli" :
                System.out.println("The entered name is:" + name);
                break;
            default:
                System.out.println("Your name is not in list");
        }

    }
}
