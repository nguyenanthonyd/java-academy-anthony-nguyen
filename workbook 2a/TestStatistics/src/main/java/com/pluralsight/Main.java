package com.pluralsight;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] scores = {88, 92, 75, 90, 68, 100, 84, 79, 91, 73};
        printStats(scores); // call for static helper
    }
    public static void printStats(int[] scores) {
        int high = scores [0];
        int low  = scores [0];
        double sum = 0;

        for (int s : scores) {
            if (s > high) high = s;
            if (s < low) low = s;
            sum += s;

        }
        double average = sum /scores.length;

        int [] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted);

        double median;
        int n = sorted.length;
        if (n % 2 ==1 ) {
            median = sorted[n / 2];

        } else {
            median = (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;

        }
        System.out.println("High:" + high);
        System.out.println("Low:" + low);
        System.out.println("Average:" + average);
        System.out.println("Median: " + median);
        System.out.printf("Average - Median %.2f%n", (average - median));





    }
}