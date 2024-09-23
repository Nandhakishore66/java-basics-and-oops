package com.naveen;

import java.util.Scanner;

public class ConditionalStatements {
        public static void main(String[] args) {
            int pen;
            int cost;
            int specialPen;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the prize of a pen");
            pen = input.nextInt();
            System.out.println("Enter the prize of a Special pen");
            specialPen = input.nextInt();
            System.out.println("Enter the cost available in your hand");
            cost = input.nextInt();
            if(cost >= specialPen){
                System.out.println("He has an sufficient amount to buy special pen");
            } else if (cost >= pen) {
                System.out.println("He has an sufficient amount to buy pen");
            } else {
                System.out.println("Does not have an sufficient amount");
            }


        }
    }

