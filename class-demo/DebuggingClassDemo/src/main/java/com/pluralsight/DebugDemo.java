package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public class DebugDemo {
            public static void main(String[] args) {
                int number = 5;
                int result = number * 2;

                System.out.println("Double of number is: " + result); // variable error (previously + "results")
                if (number > 0) { // logical error  (Previously (number < 0)
                    System.out.println("The number is positive.");
                }
            }
        }
