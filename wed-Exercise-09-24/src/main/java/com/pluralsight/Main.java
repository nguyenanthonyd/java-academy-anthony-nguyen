package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String favoriteColor = "Black";
        String favoriteArtist = "Kendrick Lamar";
        boolean eatAlready = false;
        int age = 28;

        String firstname = "Anthony";
        String lastname = " Nguyen";
        String fullname = firstname + " " + lastname;
        String newfavecolor = "Red";
        System.out.println( fullname);
        System.out.println(age);
        System.out.println(eatAlready);
        System.out.println(favoriteArtist);
        System.out.println(favoriteColor);
        System.out.println("New fave color is "+ newfavecolor);

        //  !isHappy = false
//  !canYouDoSomethingAboutIt = true;
        boolean isHappy = false;
        boolean hadBreakfast = false;
        if(isHappy && hadBreakfast)
        {
            System.out.println("Nice Job!");

        }else if (isHappy && !hadBreakfast) {
            System.out.println("You could be hungry.");
        }
        else
            System.out.println("Do something about that!");
    }
}