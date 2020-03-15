package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryTest {

    static Country country;

    @BeforeAll
    static void init() {
        country = new Country("ITA", "Italy", "Europe", "Southern Europe", 57680000, 1464);
    }

    @Test
    void getCodeTest() {
        assertEquals("ITA", country.getCode());
    }

    @Test
    void getNameTest() {
        assertEquals("Italy", country.getName());
    }

    @Test
    void getContinentTest() {
        assertEquals("Europe", country.getContinent());
    }
    @Test
    void getRegionTest() {
        assertEquals("Southern Europe", country.getRegion());
    }
    @Test
    void getPopulationTest() {
        assertEquals(57680000, country.getPopulation());
    }
    @Test
    void getCapitalTest() {
        assertEquals(1464, country.getCapital());
    }






}
