
package com.napier.sem;

import java.sql.*;

/** Holds data about a city
 *
 * Authors:
 * Mihail Benev
 * Ani Georgieva
 * David Ciocoiu
 * Tibor Toth
 *
 * Last updated - 10.03.2020
 * */
public class City {

    //Variables
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    // Constructors

    public City() {}

    public City(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    //Gets the city
    public void getCity(int ID, Connection con)
    {
        try
        {
            Statement stmt = con.createStatement();
            String strSelect = "SELECT ID, Name, CountryCode, District, Population FROM city WHERE ID = " + ID ;
            ResultSet rset = stmt.executeQuery(strSelect);
            if(rset.next())
            {
                this.setId(rset.getInt("ID"));
                this.setName(rset.getString("city.Name"));
                this.setCountryCode(rset.getString("CountryCode"));
                this.setDistrict(rset.getString("District"));
                this.setPopulation(rset.getInt("city.Population"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details.");
        }
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    //Displays City
    public void displayCity()
    {
        if(this != null)
        {
            System.out.println("Displaying city: \n" + "Name: " + this.getName() + "\n" +
                    "ID:" + this.getId() + "\n" +
                    "Country Code: " + this.getCountryCode() + "\n" +
                    "District: " + this.getDistrict() + "\n" +
                    "Population: " + this.getPopulation() + "\n"
        );
        }
    }
}
