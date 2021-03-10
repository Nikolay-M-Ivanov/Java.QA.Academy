package com.academy.lecture45.homework;

import lombok.Getter;

@Getter
public class Stats extends Player{
    int endurance = 0;
    int sprint = 0;
    int dribble = 0;
    int passing = 0;
    int shooting = 0;

    public Stats(String name, double stats) {
        super(name, stats);
    }

    public void setEndurance(int endurance) {
        if (endurance < 0 || endurance > 100){
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        }
        this.endurance = endurance;
    }

    public void setSprint(int sprint) {
        if (sprint < 0 || sprint > 100){
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        }
        this.sprint = sprint;
    }

    public void setDribble(int dribble) {
        if (dribble < 0 || dribble > 100){
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        }
        this.dribble = dribble;
    }

    public void setPassing(int passing) {
        if (passing < 0 || passing > 100){
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        }
        this.passing = passing;
    }

    public void setShooting(int shooting) {
        if (shooting < 0 || shooting > 100){
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        }
        this.shooting = shooting;
    }
}
