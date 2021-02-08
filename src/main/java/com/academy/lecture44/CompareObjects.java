package com.academy.lecture44;

public class CompareObjects {
    public int compareByName(StudentMethodReference a, StudentMethodReference b){
        return a.getName().compareTo(b.getName());
    }
}
