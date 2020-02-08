package com.napier.sem;

import java.sql.*;
/** Holds data about a country*/
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
            else
            {
                return;
            }


        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details.");
            return;
        }

    }
    //** Displays country details */
    public void displayCountry()
    {
        if(this != null)
        {
            System.out.println( "Displaying country\n" +
                    "Code: " + this.code + "\n" +
                            " Name: "+ this.name + "\n" +
                            "Continent: " + this.region + "\n" +
                    "Population: " + this.population + "\n" +
                    "Capital: " + this.capital
            );
        }
    }
}
