package com.pluralsight;
import java.io.*; // Wildcard for both imports
import java.util.*;
public class TransactionFileHelper {

    private static final String FILE_NAME = "transactions.csv"; // FILE_NAME is constant

    public static void saveTransaction (Transaction transaction) {
        try(PrintWriter writer = new PrintWriter(new FileWriter( FILE_NAME, true ))) {
            // we have a true at the end so previous transactions don't get overwritten

            writer.println(transaction.getDate() + "|" +
                           transaction.getTime() + "|" +
                           transaction.getDescription() + "|" +
                           transaction.getVendor() + "|" +
                           transaction.getAmount());

        } catch (IOException e) {
            System.out.println("Error saving transaction");
            e.printStackTrace();
        }

    }

    public static List<Transaction> readTransactions() {
        List<Transaction> transactions = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split("\\|");
                Transaction transaction = new Transaction(parts[0], parts[1], parts[2], parts[3],
                        Double.parseDouble(parts[4]));
                transactions.add(transaction);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No transactions file found yet.");
            }

        return transactions;
    }


}






