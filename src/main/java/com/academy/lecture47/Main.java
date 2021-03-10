package com.academy.lecture47;

public class Main {
    public static void main(String[] args) {
        RandomGeneration randomGeneration = new RandomGeneration();
        randomGeneration.toto5from35Generation();
        randomGeneration.randomNumberBetweenRange(1, 11);
        randomGeneration.generateRandomPassword();

        // km е статична променлива, затова резултата се презаписва и взима последната стойност
        Car blueCar = new Car();
        blueCar.km = 100;
        Car redCar = new Car();
        redCar.km = 85;
        Car.km = 120;
        System.out.println(blueCar.km);
        System.out.println(redCar.km);
    }
}
