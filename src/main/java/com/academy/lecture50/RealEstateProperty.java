package com.academy.lecture50;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@AllArgsConstructor
@Slf4j
public class RealEstateProperty implements RealEstateAction{
    private String location;
    double price;
    Town town;
    int yearOfConstruction;
    int totalSize;
    int[] floor;
    Owner owner;

    public int getNumberOfFloors(){
        int numberOfFloors = floor.length;
        log.info("The number of floors are: {}", numberOfFloors);
        return numberOfFloors;
    }

    public void printAllFloorsOfProperty(){
        for (int j : floor){
            log.info("The floor for property is: {}", j);
        }
        log.info("All floors for the property are: {}", Arrays.toString(floor));
    }

    @Override
    public void sell(double price) {
        log.info("Selling the property");
    }

    @Override
    public void buy(double price) {
        log.info("Buying the property");
    }

    @Override
    public void giveRent(double price) {
        log.info("Giving the property for rent");
    }

    @Override
    public void takeRent(double price) {
        log.info("Taking the property for rent");
    }
}
