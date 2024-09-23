package com.naveen;


public class PolymorphismOverridingChild extends PolymorphismOverridingParent{
    //@override
    public void returnBack()  {

        System.out.println("I would like to live in paris");
    }
    public static void main(String[] args) {
        PolymorphismOverridingParent ref = new PolymorphismOverridingChild();
        ref.properties();
        ref.returnBack();
    }
}
