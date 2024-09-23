package com.naveen;

public class AbstractionBmw extends AbstractionCar{

    //@Override
    public void engineSecret() {
        System.out.println("This is Bmw engine Secret");
    }
    public void companyVault() {
        System.out.println("This is Bmw company vault");
    }

    public static void main(String[] args) {
        AbstractionCar obj = new AbstractionBmw();
        obj.engineSecret();
        obj.companyVault();
    }

//    @Override
//    public void method1() {
//      System.out.println("Interface");
//    }
//
//    @Override
//    public void method2() {
//
//    }
}
