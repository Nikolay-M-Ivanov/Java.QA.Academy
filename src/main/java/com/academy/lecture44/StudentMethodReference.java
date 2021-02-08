package com.academy.lecture44;

import lombok.Getter;

@Getter
public class StudentMethodReference {
    private double avgGrade;
    private String name;

    public StudentMethodReference(double avgGrade){
        this.avgGrade = avgGrade;
    }

    public StudentMethodReference(String name) {
        this.name = name;
    }

    public static int compareGrades (StudentMethodReference a, StudentMethodReference b){
        if (a.avgGrade > b.avgGrade) return 1;
        else if (a.avgGrade < b.avgGrade) return -1;
        else return 0;
    }
}
