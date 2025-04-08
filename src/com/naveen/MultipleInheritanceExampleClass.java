package com.naveen;

public class MultipleInheritanceExampleClass implements MultipleInheritanceExampleInterface1, MultipleInheritanceExampleInterface2{
    @Override
    public void multiple() {
        System.out.println("multiple");
    }

    @Override
    public void single() {
        System.out.println("single");
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void config() {
        System.out.println("config");
    }

    public static void main(String[] args) {
        MultipleInheritanceExampleInterface1 obj1 = new MultipleInheritanceExampleClass();
        obj1.multiple();
        obj1.single();
        MultipleInheritanceExampleInterface2 obj2 = new MultipleInheritanceExampleClass();
        obj2.config();
        obj2.show();
    }
}
