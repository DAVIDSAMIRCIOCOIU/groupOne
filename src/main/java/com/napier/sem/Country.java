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
 * Last updated - 10.03.2020
 * */
public class Country {

    private String code; // char in world.db
    private String name; // char in world.db
    private String continent; // enum in world.db
    private String region; // char in world.db
    private int population; // int in world.db
    private int capital; // int in world.db (Every city has a unique ID as a PK. This is a JOIN ON country.Capital = city.ID)

    // Constructor

    public Country() {}

    public Country(String code, String name, String continent, String region, int population, int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.population = population;
        this.capital = capital;
    }


    //** Displays country details */
    public void displayCountry()
    {
        if(this != null)
        {
            System.out.println( "Displaying country\n" +
                    "Code: " + this.getCode() + "\n" +
                            "Name: "+ this.getName() + "\n" +
                            "Region: " + this.getRegion() + "\n" +
                            "Continent: " + this.getContinent() + "\n" +
                    "Population: " + this.getPopulation() + "\n" +
                    "Capital: " + this.getCapital() + "\n"
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
