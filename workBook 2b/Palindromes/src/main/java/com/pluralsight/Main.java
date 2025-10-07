package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



        static boolean isPalindrome(int n){
            String s = String.valueOf(n);
            String r = new StringBuilder(s).reverse().toString();
            return s.equals(r);
        }

        public static void main(String[] args) {
            int max = 0, bestA = 0, bestB = 0;

            for(int a = 999; a >= 100; a--) {
                for (int b = a; b >= 100; b--){
                    int prod = a * b;

                    if (prod <= max) break;
                    if (isPalindrome(prod)) {
                        max = prod;
                        bestA = a;
                        bestB = b;
                        System.out.printf("NEW BEST: %d x %d%n", max, bestA, bestB);
                    }
                }
            }
            System.out.printf("Largest so far: %d (%d x %d)%n", max, bestA, bestB);




        }
    }
