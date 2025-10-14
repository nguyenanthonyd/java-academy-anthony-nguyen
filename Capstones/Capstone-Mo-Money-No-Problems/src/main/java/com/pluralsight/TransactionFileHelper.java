package com.pluralsight;
import java.io.;
import java.util.;
public class TransactionFileHelper {

    private static final String fileName = "transacations.csv";

    public static void saveTransaction (Transaction transaction) {
        try(PrintWriter writer = new PrintWriter(new FileWriter( fileName, true ))) {
            writer.println(transaction.getDate() + "|" +
                          (transaction.getTime() + "|" +
                          (transaction.getDescription() + "|" +
                          (transaction.getVendor() + "|" +
                          (transaction.getAmount());

        } catch (IOException e) {
            System.out.println("Error saving transaction");
            e.printStackTrace();
        }

    }

    public static List<Transaction> readTransactions() {
        List<Transaction> transactions
}
