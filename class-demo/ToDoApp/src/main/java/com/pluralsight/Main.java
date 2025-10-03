package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your Todo App");

// Step 1: Create an array that can hold 3 task
        Task[] tasks = new Task[3];

// Step 2: Add new Task objects

        tasks[0] = new Task("learn the basics of Classes and Methods in Java");
        tasks[1] = new Task ("Fill out this Year Up online form. It's feedback for Year Up about how you think the lesson is going.\nhttps://www.surveymonkey.com/r/VXQF92Q.");
        tasks[2] = new Task("Share your most fun exercise we did in class");

// Step 3: Mark one task as completed
tasks[1].markCompleted();

// Step 4: Loop through the array and print each task

for (int i = 0; i < tasks.length; i++) {
    tasks[i].printTask(); // method is from Task class


        // ===================================================

        }
    }
}