package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    static City city;

    @BeforeAll
    static void init() {
        city = new City(1464, "Roma", "ITA", "Latium", 2643581);
    }

    @Test
    void getId() {
        assertEquals(1464, city.getId());
    }

    @Test
    void getName() {
        assertEquals("Roma", city.getName());
    }
    @Test
    void getCountryCode() {
        assertEquals("ITA", city.getCountryCode());
    }
    @Test
    void getDistrict() {
        assertEquals("Latium", city.getDistrict());
    }
    @Test
    void getPopulation() {
        assertEquals(2643581, city.getPopulation());
    }
}
