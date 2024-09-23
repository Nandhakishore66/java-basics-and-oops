package com.naveen;

public class InhertianceBenz extends InheritanceBmw {
    public void benz() {
        System.out.println("Created new engine for benz");
    }
    public static void main(String[] args) {
        InhertianceBenz benz = new InhertianceBenz();
        benz.engine();
        benz.bmw();
        benz.benz();
    }
}
