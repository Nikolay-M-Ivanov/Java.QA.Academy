package com.academy.lecture50;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor     //конструктор без аргументи
@AllArgsConstructor  //конструктор с всички аргументи
@Getter
@Slf4j
public class Apartament {
    private String location;
    double price;
    Town town;
    int yearOfConstruction;
    int totalSize;
    int floor;
    Owner owner;

    public double setPricePerLocation(){
        switch (town){
            case SOFIA:
                price = 200000.0;
                log.info("Apartment price for Sofia is: " + price);
                break;
            case VARNA:
                price = 150000.0;
                log.info("Apartment price for Varna is: " + price);
                break;
            default:
                price = 50000.0;
                log.info("Apartment price for all places is: " + price);
                break;
        }
        return price;
    }


    @Override
    public String toString() {
        return "Apartament{" +
                "location='" + location + '\'' +
                ", price=" + price +
                ", town=" + town +
                ", yearOfConstruction=" + yearOfConstruction +
                ", totalSize=" + totalSize +
                ", floor=" + floor +
                ", owner=" + owner.name +
                '}';
    }

    public Apartament (String location, double price, Town town){ //къстом конструктор (част от параметрите)
        this.location = location;
        this.price = price;
        this.town = town;
    }
//    public Apartament (){  "същото като @NoArgsConstructor"
//
//    }
}
