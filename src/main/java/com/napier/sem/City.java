package com.napier.sem;

import java.sql.*;

public class City {

    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    public void getCity(String ID, Connection con)
    {
        try
        {
            Statement stmt = con.createStatement();
            String strSelect = "SELECT ID, Name, Country Code, District, Population, FROM country WHERE Code LIKE '" + ID + "%'";
            ResultSet rset = stmt.executeQuery(strSelect);
            if(rset.next())
            {
                this.setId(rset.getInt("ID"));
                this.setName(rset.getString("Name"));
                this.setCountryCode(rset.getString("Country Code"));
                this.setDistrict(rset.getString("District"));
                this.setPopulation(rset.getInt("Population"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details.");
        }
    }

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
