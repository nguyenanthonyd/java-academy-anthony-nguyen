package com.pluralsight;
import java.time.LocalDate;
public class Task {
// list of classmates in the test ///
// String title
// LocalDate due date
// Boolean complete or incomplete
// Urgency
// Reminder Yes or no (boolean)
// String notficationMessage

    private String title;
    private LocalDate dueDate;
    private boolean complete;
    private String urgency;
    private String notificationMessage;
    private boolean reminder;

    public Task (String _title){
        this.title = _title;
        this.complete = false;
    }
    public void markCompleted() {
        this.complete = true;
    }
    public void printTask() {
        String status = complete ? "Done" : "Not Done";
        System.out.println(title + " - " + status);


    }
    }