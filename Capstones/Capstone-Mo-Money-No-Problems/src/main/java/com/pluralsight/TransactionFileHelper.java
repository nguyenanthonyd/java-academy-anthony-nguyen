package com.pluralsight;
// Imported wildcards to streamline imports
import java.io.*; // For reading and writing files.
import java.util.*; // For Array and List.
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.List;

public class TransactionFileHelper {


    // Saves a transaction line to file "transactions.csv"
    public void writeTransaction(String transactionline) {
       try {
           // FileWriter - to open the file
           FileWriter fileWriter = new FileWriter("transactions.csv",true);

           // BufferedWriter - Makes the writing faster and efficient
           BufferedWriter writer = new BufferedWriter(fileWriter);

           // Write the transaction line + a new line character
           writer.write(transactionline);
           writer.newLine(); // moves next to next line

           // Closes writer
           writer.close();
           System.out.println("Successful transaction ya heard!");

       } catch (IOException e) {
            System.out.println("Yo! Error saving transaction!");
            e.printStackTrace(); // Prints what went wrong
        }
    }


    // This reads all transactions from the file and returns them as a list
    public static List<Transaction> readTransactions() {

        // Holds transaction read from the file
        List<Transaction> transactions = new ArrayList<>();

        try {
            // Opens file
            FileReader fileReader = new FileReader("transactions.csv");
            // Faster reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input; // temporary storage for each line as it is read

            // Reads until there is no more data (null)
            while((input = bufferedReader.readLine()) != null) {

                input = input.trim();
                if (input.isEmpty()) continue;

                // Splits the line into columns where there is a "|"
                String[] transactionsDetails = input.split("\\|");
                if (transactionsDetails.length != 5) {
                    continue;
                }
                /* Format example
                date|time|description|vendor|amount
                2023-04-15|10:13:25|ergonomic keyboard|Amazon|-89.50
                2023-04-15|11:15:00|Invoice 1001 paid|Joe|1500.00*/

                // Safer parsing had bugs used (try/catch)
                try {
                    LocalDate date = LocalDate.parse(transactionsDetails[0]); // index[0] -> Converts   String to LocalDate
                    LocalTime time = LocalTime.parse(transactionsDetails[1]); // index[1] -> Converts  String to LocalTime
                    String description = transactionsDetails[2]; // index[2]
                    String vendor = transactionsDetails[3]; // index[3]
                    Double amount = Double.parseDouble(transactionsDetails[4]); // index[4] -> Converts String to double

                // Create Transaction object with all of the data
                    Transaction transaction = new Transaction(date, time, description, vendor, amount);

                // Add transaction to the list of transactions
                    transactions.add(transaction);

                } catch (Exception parseError) {
                // if any field is bad, skip this line instead of crashing
                }
                }
                // skip line if it can't be parsed (bad data/ empty column) (band/aid)
            // Close
            bufferedReader.close();


            } catch (FileNotFoundException e) {
                System.out.println("No transactions file yet. It will be created when you add your first entry!");
            } catch(IOException e) {
            System.out.println("Error reading this playa!");
            e.printStackTrace();
        }

            // return ArrayList<Transaction> transactionList to the LedgerScreen for use
            return transactions;
    }
}