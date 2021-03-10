package com.academy.lecture50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RealEstatePropertyTest {

    Owner owner;
    Apartament apartament2;
    House house1;
    House house2;

    @BeforeEach
    public void setUp() {
        owner = new Owner("Niki", 25, "male");
        apartament2 = new Apartament("Lozenets", 200000.0,
                Town.PLOVDIV, 2020, 120, 5, owner);
        house1 = new House("See Garden", 250000.0, Town.BURGAS, 2020, 200,
                new int[]{1, 2, 3}, owner, true, 50);
        house2 = new House("See Garden", 250000.0, Town.BURGAS, 2020, 200,
                new int[]{1, 2, 3, 4}, owner, true, 50);
    }

    @Test
    public void verifyNumberOfFloors() {
        assert house1.getNumberOfFloors() == 3;
        Assertions.assertEquals(house1.getNumberOfFloors(), 3);
        Assertions.assertTrue(house1.getNumberOfFloors() == 3);
        Assertions.assertFalse(house1.getNumberOfFloors() == 2);
    }
    @Test
    public void verifyExceptionExists() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{house2.getNumberOfFloors();});
    }
}
