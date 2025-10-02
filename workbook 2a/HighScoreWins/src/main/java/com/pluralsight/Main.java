package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a game score");
        String input = sc.nextLine().trim();

        // Prompt game score
        System.out.println("You entered: " + input);

        String[] parts = input.split("\\|"); // Escape the pipe with \\

    if (parts.length!=2) {
        System.out.println("Invalid format. Use Home:Visitor|21:9");
        return;
    }

    String teamsPart = parts[0]; //  "Home:Visitor"
    String scoresPart = parts[1]; // "21:9"

        System.out.println("Teams part: " + teamsPart);
        System.out.println("Scores part: " + scoresPart);


        // Split teams on:
    String[] teams = teamsPart.split(":");
    if (teams.length != 2) {
            System.out.println("Invalid format. Example: Home:Visitor|21:9");
        return;
        }

    String homeTeam = teams[0].trim(); // Lakers
    String visitorTeam = teams[1].trim(); // Warriors

        System.out.println("Home: " + homeTeam);
        System.out.println("Visitor: "+ visitorTeam);

// Split scores on:
        String[] scores = scoresPart.split(":");
    if (scores.length != 2) {
        System.out.println("Invalid format. Example: Home:Visitor|21:9");
        return;
    }
    String homeScoreStr = scores[0].trim(); // "21"
    String visitorScoreStr = scores[1].trim(); // "9"

        int homeScore;
        int visitorScore;

        try {
            homeScore = Integer.parseInt(homeScoreStr);
            visitorScore = Integer.parseInt(visitorScoreStr);

        } catch (NumberFormatException e) {
            System.out.println("Scores must be whole numbers like 21:9");
            return;
        }
        System.out.println("Home score:" + homeScore);
        System.out.println("Visitor score:" + visitorScore);

        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner:" + visitorTeam);
        } else {
            System.out.println("Tie");
        }


    }
    }
