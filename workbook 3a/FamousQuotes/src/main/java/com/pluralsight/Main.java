package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "Code fearlessly — every bug you fix makes you twice as strong.",
                "The compiler may reject your code, but never let it reject your spirit",
                "Great developers aren’t born — they’re debugged through persistence",
                "Success is just persistence that didn't quit",
                "Every line you write teaches you something ",
                "Read error messages like treasure maps, not insults.",
                "Your dream app won’t build itself — hit Run and make it real.",
                "Refactor your mindset the same way you refactor your code — cleaner every time.",
                "Perfection isn’t the goal; progress compiles just fine.",
                "You’re one System.out.println() away from understanding it.",
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 9: ");
        int index = scanner.nextInt();


        scanner.close();

        if (index >= 0 && index < quotes.length) {
            System.out.println(quotes[index]);
        } else {
            System.out.println("That number's out of range");

            scanner.close();


        }
    }
}