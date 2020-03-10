package com.napier.sem;

import java.sql.*;

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

    private String code; // char in world.db
    private String name; // char in world.db
    private String continent; // enum in world.db
    private String region; // char in world.db
    private int population; // int in world.db
    private int capital; // int in world.db (Every city has a unique ID as a PK. This is a JOIN ON country.Capital = city.ID)

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
                this.setCode(rset.getString("Code"));
                this.setName(rset.getString("Name"));
                this.setContinent(rset.getString("Continent"));
                this.setRegion(rset.getString("Region"));
                this.setPopulation(rset.getInt("Population"));
                this.setCapital(rset.getInt("Capital"));
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
                    "Code: " + this.getCode() + "\n" +
                            "Name: "+ this.getName() + "\n" +
                            "Continent: " + this.getRegion() + "\n" +
                    "Population: " + this.getPopulation() + "\n" +
                    "Capital: " + this.getCapital()
            );
        }
    }



    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public int getCapital() {
        return capital;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
}
