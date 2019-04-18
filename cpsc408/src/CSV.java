/*
 * Student Name: Ryan Klapper
 * Student ID: 227482
 * Student Email: klapp101@mail.chapman.edu
 * CPSC408 - Database Management
 * Assignment 4 - CPSC 408
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSV
{
    public static List<List<String>> readCSV(String csvFile) throws FileNotFoundException
    {
        Scanner inputFile = new Scanner(new File(csvFile));
        inputFile.useDelimiter(",");

        List<List<String>> c = new ArrayList<List<String>>();
        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            List<String> tup = Arrays.asList(line.split(","));
            c.add(tup);
        }
        //Closing scanner
        inputFile.close();
        //Return columns
        return c;
    }
}
