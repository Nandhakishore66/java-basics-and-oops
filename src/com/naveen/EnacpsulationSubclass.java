package com.naveen;

public class EnacpsulationSubclass {

    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        /*ithu direct ah value set pannapo use pannathu
      int age = obj.getAge();
      System.out.println(age);
      String name = obj.getName();
      System.out.println(name);*/
        //Ippo set use panna poren
        obj.setAge(10);
        obj.setName("Naveen");
        int age = obj.getAge();
        System.out.println(age);
        String name = obj.getName();
        System.out.println(name);


    }
}
