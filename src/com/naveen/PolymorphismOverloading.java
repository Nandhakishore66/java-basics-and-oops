package com.naveen;

public class PolymorphismOverloading {

    public int add(int a, int b) {

        return a+b;
    }
    public float add(int a, float b) {

        return a+b;
    }
    public int add(int a, int b, int c) {

        return a+b+c;
    }
    public static void main(String[] args) {
        PolymorphismOverloading obj = new PolymorphismOverloading();
        int value1 = obj.add(1, 2);
        System.out.println(value1);
        int value2 = obj.add(1, 2, 3);
        System.out.println(value2);
        float value3 = obj.add(1, 2.5f);
        System.out.println(value3);
    }
}
