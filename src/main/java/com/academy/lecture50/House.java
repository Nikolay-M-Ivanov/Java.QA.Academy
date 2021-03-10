package com.academy.lecture50;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class House extends RealEstateProperty{

    boolean hasYard;
    int yardSize;

    public House(String location, double price, Town town, int yearOfConstruction, int totalSize, int[] floor, Owner owner) {
        super(location, price, town, yearOfConstruction, totalSize, floor, owner);
    }
    public House(String location, double price, Town town, int yearOfConstruction, int totalSize, int[] floor, Owner owner, boolean hasYard, int yardSize) {
        super(location, price, town, yearOfConstruction, totalSize, floor, owner);
        this.hasYard = hasYard;
        this.yardSize = yardSize;
    }

    @Override
    public int getNumberOfFloors() {
        if (floor.length > 3){
            log.error("The floors for a house could not be more then 3 and this is not allowed");
            throw new IllegalArgumentException("House could not have more than 3 floors");
        }
        log.info("[House class] The floors of the house are: " + floor.length);
        return floor.length;
    }
}
