package com.academy.lecture50;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Apartament apartament = new Apartament("Mladost", 150000.0, Town.SOFIA);
        // apartament.location = "Mladost"; ако е private в Apartment, не можем да я пренапишем тук
        apartament.price = 150000.0;

       // log.info(apartament.getLocation());

        Owner owner = new Owner("Niki", 25, "male");
        Apartament apartament2 = new Apartament("Lozenets", 200000.0,
                Town.PLOVDIV, 2020, 120, 5, owner);

        log.info(apartament2.toString());

        House house1 = new House("See Garden", 250000.0,Town.BURGAS,2020,200,
                new int[]{1,2,3}, owner, true, 50);
        House house2 = new House("See Garden", 250000.0,Town.BURGAS,2020,200,
                new int[]{1,2,3,4}, owner, true, 50);

        house1.getNumberOfFloors();
        house2.getNumberOfFloors();
        house1.printAllFloorsOfProperty();
        house1.sell(123456789.0);


        apartament2.setPricePerLocation();


    }
}
