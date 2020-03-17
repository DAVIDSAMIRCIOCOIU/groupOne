package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060");
    }

    @Test
    // First country should be USA
    void testLargestToSmallestPopulationInCountry()
    {
        ArrayList<Country> myList = app.largestToSmallestPopulationInCountry("WHERE continent LIKE 'North America'");
        assertEquals(myList.get(0).getCode(), "USA");
    }

    @Test
    void testGetCountry()
    {
        Country myCountry = app.getCountry("ITA");
        assertEquals(myCountry.getName(), "Italy");
    }

    @Test
    void testGetCity()
    {
        City myCity = app.getCity(1464);
        assertEquals(myCity.getName(), "Roma");
    }



}