package com.pluralsight;


import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/northwind";
        String user = "root";
        String password = "******"; //blocked off on purpose

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Define and execute the query
            String query = "SELECT ProductName FROM Products";
            ResultSet results = statement.executeQuery(query);

            // Process the results
            while (results.next()) {
                String name = results.getString("ProductName");
                System.out.println(name);
            }

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//