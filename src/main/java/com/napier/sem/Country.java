package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

/** Holds data about a country
 *
 * Authors:
 * Mihail Benev
 * Ani Georgieva
 * David Ciocoiu
 * Tibor Toth
 *
 * Last updated - 18.02.2020
 * */
public class Country {

    public String code; // char in world.db
    public String name; // char in world.db
    public String continent; // enum in world.db
    public String region; // char in world.db
    public int population; // int in world.db
    public int capital; // int in world.db (Every city has a unique ID as a PK. This is a JOIN ON country.Capital = city.ID)

    //** Gets the country*/
    public void getCountry(String ID, Connection con)
    {
        try
        {
            Statement stmt = con.createStatement();
            String strSelect = "SELECT Code, Name, Continent, Region, Population, Capital FROM country WHERE Code LIKE '" + ID + "%'";
            ResultSet rset = stmt.executeQuery(strSelect);
            if(rset.next())
            {
                this.code = rset.getString("Code");
                this.name = rset.getString("Name");
                this.continent = rset.getString("Continent");
                this.region = rset.getString("Region");
                this.population = rset.getInt("Population");
                this.capital = rset.getInt("Capital");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details.");
        }
    }
    //** Displays country details */
    public void displayCountry()
    {
        if(this != null)
        {
            System.out.println( "Displaying country\n" +
                    "Code: " + this.code + "\n" +
                            "Name: "+ this.name + "\n" +
                            "Continent: " + this.region + "\n" +
                    "Population: " + this.population + "\n" +
                    "Capital: " + this.capital
            );
        }
    }

    /* Display a list of countries in the world organized by descending population */
    public void largestToSmallestPopulation(Connection con)
    {
        try
        {
            //SQL statement to get the data out of the database
            Statement stmt = con.createStatement();
            String strSelect = "SELECT Name, Population " +
                    "FROM country " +
                    "ORDER BY Population";
            ResultSet rset = stmt.executeQuery(strSelect);

            //Array with all the countries
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country country = new Country();
                country.name = rset.getString("name");
                country.population = rset.getInt("population");
                countries.add(country);
            }

            System.out.println("\n" + "Largest to smallest population by country\n");

            //Loop through the countries and print them
            for (Country co : countries)
            {
            System.out.println( "Name: "+ co.name + "\n" +
                    "Population: " + co.population + "\n"
            );
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details.");
        }
    }
}
