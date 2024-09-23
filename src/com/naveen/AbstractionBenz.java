package com.naveen;

public class AbstractionBenz extends AbstractionCar{
    public void engineSecret() {
        System.out.println("This is Benz engine Secret");
    }
    public void companyVault() {
        System.out.println("This is Benz company vault");

    }
    public static void main(String[] args) {
        AbstractionCar obj = new AbstractionBenz();
        obj.engineSecret();
        obj.companyVault();
        obj.companyEmployees();
    }
}
