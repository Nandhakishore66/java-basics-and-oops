package com.naveen;

public class StringBufferAndString {
    public static void main(String[] args) {
        System.out.println("String is immutable one which means constant");
        String name = "Virat";
        System.out.println("Full name is " + name.concat("kohli"));
        System.out.println(name);
        // example for string buffer
        System.out.println("String buffer is mutable one it can change");
        StringBuffer cricket = new StringBuffer("Ms");
        System.out.println("Full name is " + cricket.append("Dhoni"));
        System.out.println(cricket);

        // methods in string buffer
        StringBuffer buffer = new StringBuffer("Arya");
        System.out.println(buffer.reverse());
        StringBuffer buffer1 = new StringBuffer("Ayan");
        System.out.println(buffer1.replace(0,2,"ri"));
        StringBuffer buffer2 = new StringBuffer("dhoom");
        System.out.println(buffer2.insert(4, "bhoom"));
        StringBuffer buffer3 = new StringBuffer("zoom");
        System.out.println(buffer3.delete(0,2));
        StringBuffer buffer4 = new StringBuffer("dhoomgyu");
        System.out.println(buffer4.capacity());



    }
}
