package com.academy.lecture45.homework;

import lombok.Getter;

@Getter
public class Player extends Team {
    private String name;
    private double stats;

    public Player(String name, double stats) {
        setName(name); //капсулиране на данни
        setStats(stats); //капсулиране на данни
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setStats(double stats) {
        if (stats < 0 || stats > 100){
            throw new IllegalArgumentException("Stats should be between 0 and 100.");
        }
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", stats=" + stats +
                '}';
    }
}
