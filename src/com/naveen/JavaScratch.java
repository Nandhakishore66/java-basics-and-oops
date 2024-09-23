package com.naveen;

import java.util.Arrays;
import java.util.Locale;

public class JavaScratch {
    public static void main(String[] args) {
        byte num = 110;
        short num1 = 22000;
        int num2 = 20202020;
        long num3 = 23028352532L;
        char type = 'a';
        System.out.println(num3);
        // Arrays
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println(Arrays.toString(numbers));
        char[] characters = new char[4];
        characters[0] = 'a';
        characters[1] = 'b';
        System.out.println(Arrays.toString(characters));
        char[] letters = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(letters));

        // String decleration
        String upperCase = "India is my country";
        String up =upperCase.toUpperCase();
        System.out.println(upperCase.toUpperCase());

        //Constant
        byte ageOfPerson = 45;
        ageOfPerson = 80;
        final int voteAge = 18;
        System.out.println(voteAge);
        System.out.println(ageOfPerson);

        //Shortcut
        int value1 = 80;
        int value2 = 120;
        value2 = value2 + 10;
        System.out.println(value2);
        value2+= 30;
        System.out.println(value2);

        // And Or Not operators
        int ageOfVote = 18;
        boolean indian = true;
        if (ageOfVote == 18 || indian == true) {
            System.out.println("yes he is eligible for voting");
        } else {
            System.out.println("Not eligible");
        }
        if(!indian == false) {
            System.out.println(true);
        }

        //Ternary operator
        int person = 25;
        String name = person == 25 ? "eligible" : "noteligible";
        System.out.println(name);

        // Post Increment
        byte number = 40;
        number++;
        System.out.println(number);

        // Post decrement
        byte number1 = 40;
        number1--;
        System.out.println(number1);

        //Increment value gets incremented and than assigned means
        int variable = 10;
        int variable1 = ++variable;
        System.out.println(variable);
        System.out.println(variable1);

        //Increment value gets assigned and than incremented means
        int variable2 = 10;
        int variable3 = variable2++;
        System.out.println(variable2);
        System.out.println(variable3);

        //Math operations
        int variable4 = 210;
        System.out.println(Math.abs(variable4));
        float variable5 = 210.20f;
        System.out.println(Math.ceil(variable5));








    }

}
