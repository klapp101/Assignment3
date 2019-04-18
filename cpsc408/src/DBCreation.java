/*
 * Student Name: Ryan Klapper
 * Student ID: 227482
 * Student Email: klapp101@mail.chapman.edu
 * CPSC408 - Database Management
 * Assignment 4 - CPSC 408
 */
import java.sql.*;
import java.lang.*;

public class DBCreation
{
    public void CreateTable() throws Exception {
        DBConn connect = new DBConn();

        //Creation on composite key - unique ssn for id
        PreparedStatement uniqueUserSSN = connect.DatabaseConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS uniqueUserSSN(" +
                "fullName VARCHAR(40)," +
                "socialSecurityNumber VARCHAR (20))");
        uniqueUserSSN.executeUpdate();

        //Creation of information key - Information of person
        PreparedStatement humanAttributes = connect.DatabaseConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS humanAttributes(" +
                "fullName VARCHAR(40)," +
                "phoneNumber VARCHAR (40)," +
                "Website VARCHAR (40)," +
                "Occupation VARCHAR (40)," +
                "CreditCardNumber VARCHAR (20)," +
                "Latitude VARCHAR (10)," +
                "Longitude VARCHAR (10))");

        //Technical [Phone + Email]
        PreparedStatement technicalPhoneWebsite = connect.DatabaseConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS technicalPhoneWebsite(" +
                "phoneNumber VARCHAR(40)," +
                "Website VARCHAR (20))");
        technicalPhoneWebsite.executeUpdate();

        //Professional [Occupation + CreditCardNumber
        PreparedStatement professionalJobCC = connect.DatabaseConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS professionalJobCC(" +
                "Occupation VARCHAR(40)," +
                "CreditCardNumber VARCHAR (20))");
        professionalJobCC.executeUpdate();

        //Location [Latitude + Longitude]
        PreparedStatement location = connect.DatabaseConnection().prepareStatement(
                "CREATE TABLE IF NOT EXISTS location(" +
                "latitude VARCHAR(40)," +
                "longitude VARCHAR (20))");
        location.executeUpdate();
    }

    public String uniqueUserSSN(String fullName, String socialSecurityNumber) throws Exception
    {
        DBConn connect = new DBConn();
//        CSV data = new CSV();

        PreparedStatement intoTable = connect.DatabaseConnection().prepareStatement(
                "INSERT INTO uniqueUserSSN(fullName,socialSecurityNumber)" +
                "VALUES(?,?)");
        intoTable.setString(1, fullName);
        intoTable.setString(2, socialSecurityNumber);
        intoTable.executeUpdate();
        return null;

    }

    public String humanAttributes(String fullName, String phoneNumber, String Email, String Occupation, String CreditCardNumber, String Latitude, String Longitude) throws Exception
    {
        DBConn connect = new DBConn();

        PreparedStatement intoTable = connect.DatabaseConnection().prepareStatement(
                "INSERT INTO personInfo(fullName, phoneNumber, Email, Occupation, CreditCardNumber, Latitude, Longitude)" +
                "VALUES(?,?,?,?,?,?,?)");

        intoTable.setString(1, fullName);
        intoTable.setString(2, phoneNumber);
        intoTable.setString(3, Email);
        intoTable.setString(4, Occupation);
        intoTable.setString(5, CreditCardNumber);
        intoTable.setString(6, Latitude);
        intoTable.setString(7, Longitude);

        intoTable.executeUpdate();

        return null;
    }

    public String technicalPhoneEmail(String phoneNumber, String Email) throws Exception
    {
        DBConn connect = new DBConn();
        PreparedStatement intoTable = connect.DatabaseConnection().prepareStatement("INSERT INTO technicalPhoneEmail(Zipcode, City)" +
                "VALUES(?,?)");
        intoTable.setString(1, phoneNumber);
        intoTable.setString(2, Email);

        intoTable.executeUpdate();
        return null;
    }

    //City and state
    public String professionalJobCC(String Occupation, String CreditCardNumber) throws Exception
    {
        DBConn connect = new DBConn();
        PreparedStatement intoTable = connect.DatabaseConnection().prepareStatement("INSERT INTO professionalJobCC(Occupation, CreditCardNumber)" +
                "VALUES(?,?)");
        intoTable.setString(1, Occupation);
        intoTable.setString(2, CreditCardNumber);

        intoTable.executeUpdate();

        return null;
    }

    public String location(String Latitude, String Longitude) throws Exception
    {
        DBConn connect = new DBConn();
        PreparedStatement intoTable = connect.DatabaseConnection().prepareStatement("INSERT INTO location(Latitude, Longitude)" +
                "VALUES(?,?)");
        intoTable.setString(1, Latitude);
        intoTable.setString(2, Longitude);

        intoTable.executeUpdate();

        return null;
    }


}
