package com.naveen;

import java.util.Scanner;

public class StringUserInput {
    public static void main(String[] args) {
        String multipleWord;
        String singleWord;
        char val;
        
       //Getting Input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a multiple word");
        //If i want to enter a sentence or double name use nextLine
        multipleWord = input.nextLine();
        System.out.println("Enter a word");
        //If i want to enter a single word use next
        singleWord = input.next();

        System.out.println("Entered name" + multipleWord);
        System.out.println("Entered" +
                " name" + singleWord);

        //char input example
        val = input.next().charAt(2);
        System.out.println("Enter a char");
        System.out.println("Entered char" + val);

    }
}
