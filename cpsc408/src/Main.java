/*
 * Student Name: Ryan Klapper
 * Student ID: 227482
 * Student Email: klapp101@mail.chapman.edu
 * CPSC408 - Database Management
 * Assignment 4 - CPSC 408
 */
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception
    {
        try
        {
            //database object
            DBConn d = new DBConn();
            //Initializing db
            d.DatabaseConnection();
            //database creation object
            DBCreation c = new DBCreation();
            //Creating the table
            c.CreateTable();
            //Importing data from csv file 'ryan.csv'
            List<List<String>> csv_data = new CSV().readCSV("/Users/ryanklapper/desktop/cpsc408/src/ryan.csv");
            System.out.println("Steak and Lobster!!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
