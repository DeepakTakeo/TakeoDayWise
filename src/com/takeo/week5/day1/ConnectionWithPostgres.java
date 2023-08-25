package com.takeo.week5.day1;

import java.sql.*;

public class ConnectionWithPostgres {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL database!");

            //create table
            createTable(connection);

            // Insert data
            insertData(connection,1, "John", "Doe");
            insertData(connection,2, "Jane", "Smith");

            // Retrieve data
            retrieveData(connection);

            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
    }

    private static void createTable(Connection connection) throws SQLException {

        // queries in String format  --native
        String createTableSQL = "CREATE TABLE IF NOT EXISTS public.student (" +
                "id INT PRIMARY KEY," +
                "first_name VARCHAR(255)," +
                "last_name VARCHAR(255))";

        try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
            statement.executeUpdate();
            System.out.println("Table created (if not exists).");
        }
    }

    private static void insertData(Connection connection, int id, String firstName, String lastName) throws SQLException {
        String insertSQL = "INSERT INTO student (id, first_name, last_name) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(insertSQL)) {
            statement.setInt(1, id);
            statement.setString(2, firstName);
            statement.setString(3, lastName);
            statement.executeUpdate();
            System.out.println("Data inserted: " + firstName + " " + lastName);
        }
    }

    private static void retrieveData(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM student";

        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {
            ResultSet resultSet = statement.executeQuery();
            System.out.println("Retrieved data:");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName);
            }
        }
    }
}
