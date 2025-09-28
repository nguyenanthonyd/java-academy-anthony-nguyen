package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hello {
    public static void main(String[] args) {

         sayHello();
         sayGoodbye();
         sayGoodMorning();

    }

    public static void sayHello () {
        System.out.println("Hello, World");

    }

    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }
    public static void sayGoodMorning() {
        System.out.println("Good Morning!");


    }
}