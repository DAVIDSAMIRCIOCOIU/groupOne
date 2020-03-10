package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

/**
 * Main application
 *
 * Authors:
 * Mihail Benev
 * Ani Georgieva
 * David Ciocoiu
 * Tibor Toth
 *
 * Last updated - 18.02.2020
 **/
public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();
        // Test country
        Country myCountry = new Country();
        myCountry.getCountry("ABW", a.con);
        myCountry.displayCountry();

        // Get countries in world
        System.out.println("Print countries in the world **********************************************");
        a.largestToSmallestPopulationInCountry("");

        // Get countries in world
        System.out.println("Print countries in the continent **********************************************");
        a.largestToSmallestPopulationInCountry("WHERE continent LIKE 'North America'");

        // Get countries in world
        System.out.println("Print countries in the region **********************************************");
        a.largestToSmallestPopulationInCountry("WHERE region LIKE 'Caribbean'");

        // Disconnect from database
        a.disconnect();
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /* Display a list of countries in the world organized by descending population */
    public void largestToSmallestPopulationInCountry(String whereQuery)
    {
        try
        {
            //SQL statement to get the data out of the database
            Statement stmt = con.createStatement();
            String strSelect = "SELECT * " +
                    "FROM country " + whereQuery +
                    "ORDER BY Population " +
                    "DESC";
            ResultSet rset = stmt.executeQuery(strSelect);

            //Array with all the countries
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                String countryCode = rset.getString("code");
                Country country = new Country();
                country.getCountry(countryCode, con);

                countries.add(country);
            }

            System.out.println("\n" + "Largest to smallest population by country\n");

            //Loop through the countries and print them
            for (Country co : countries)
            {
                co.displayCountry();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details.");
        }
    }


}