package com.naveen;

public class ClassForInterfaceExample implements Interface1{
    public void method1() {
        System.out.println("Hi");
    }

    public void method2() {
        System.out.println("bye");
    }

    public static void main(String[] args) {
        System.out.println(name);
        Interface1 obj = new ClassForInterfaceExample();
        obj.method1();
        obj.method2();
    }
}
