package ch01.sec01;

import java.util.Random;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length());
        System.out.println(new Random().nextInt());

        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
        
        
        System.out.println("2.0-1.1=" + (2.0 - 1.1));
        System.out.println('J');
        System.out.println('\u004A');
        System.out.println('\u263A');
        
        
        int age = 42;
        String output = age + " years";
        System.out.println(output);
        System.out.println("Next year,u will be " + age + 1);//Next year,u will be 421
        System.out.println("Next year,u will be " + (age + 1));//Next year,u will be 43
        
        String names = String.join(",","name1","name2","name3");
        System.out.println(names);
        String othernames = String.join(" ","name1","name2","name3");
        System.out.println(othernames);
    }
}