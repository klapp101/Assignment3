/*
 * Student Name: Ryan Klapper
 * Student ID: 227482
 * Student Email: klapp101@mail.chapman.edu
 * CPSC408 - Database Management
 * Assignment 4 - CPSC 408
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn
{
    public static Connection DatabaseConnection() throws Exception {
        Connection conn = null;
        try {
            String driverLoc = "com.mysql.jdbc.Driver";
            String host = "jdbc:mysql://35.230.18.108:3306/Assignment3";
            String username = "root";
            String password = "root";

            Class.forName(driverLoc);
            conn = DriverManager.getConnection(host, username, password);
            System.out.println("Successfully connected to database");
        } catch (Exception e) {
            System.out.println("Could not connect to database, please check stack trace.");
            e.printStackTrace();
        }
        return conn;
    }
}