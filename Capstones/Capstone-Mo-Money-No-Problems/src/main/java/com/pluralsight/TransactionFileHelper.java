package com.pluralsight;
import java.io.*; // Wildcard for both imports
import java.time.LocalTime;
import java.util.*;
import java.time.LocalDate;

public class TransactionFileHelper {



    private void writeTransaction(String startTransaction) {
       try {
           FileWriter fileWriter = new FileWriter("transactions.csv");
           BufferedReader bufWriter = new BufferedWriter(fileWriter);

           bufWriter.write(startTransaction + "\n");
           bufWriter.close();
       }

       } catch (IOException e) {
            System.out.println("Whoops!Error saving transaction my dude");
            e.printStackTrace();
    }



    public static List<Transaction> readTransactions() {
        List<Transaction> transactions = new ArrayList<>();

        try {

            FileReader fileReader = new FileReader("transactions.csv")

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;


            while((input = bufferedReader.readLine()) != null) {



                String[] transactionInfo = input.split("\\|");


                LocalDate date = LocalDate.parse(transactionInfo[0]); // index[0] => convert/parse from String to LocalDate
                LocalTime time = LocalTime.parse(transactionInfo[1]); // index[1] => convert/parse from String to LocalTime
                String description = transactionInfo[2]; // index[2] => no conversion needed
                String vendor = transactionInfo[3]; // index[3] => no conversion needed
                double amount = Float.parseFloat(transactionInfo[4]); // index[4] => convert/parse from String to float

                // Create Transaction instance with all information
                Transaction transaction = new Transaction(date, time, description, vendor, amount);

                // Add transaction to the transactionList
                transactions.add(transaction);
            }

            // close the stream and release the resources
            bufferedReader.close();

        }

        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }

        // return ArrayList<Transaction> transactionList to the LedgerScreen for use
        return transactions;
    }
}