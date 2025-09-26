package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with. BONUS: How many milliseconds?


        int days = 24; // number of days
        int minutesInADay = 1440; // 24hours x 60minutes = 1440 minutes a day
        int totalMinutes = (minutesInADay) * (days); // 1440 minutes x 24 days

        System.out.println(" There are " + totalMinutes + " minutes in 24 days.");

        //1 minute = 60 seconds
        //1 second = 1000 milliseconds

        int milliSecondsInASecond = 1000; // milliseconds
        int secondsInAMinute = 60; // seconds
        int  minutesIn24Days = 34560;
        int  totalSecondsIn24Daus = (minutesIn24Days) * (secondsInAMinute); // 34560 minutes * 60 seconds
        int totalMillisecondsIn24Days  = (totalSecondsIn24Daus) * (milliSecondsInASecond); // 2,073,600 * 1000


        System.out.println("There are " + totalMillisecondsIn24Days +  " milliseconds in 24 days!");


    }
}