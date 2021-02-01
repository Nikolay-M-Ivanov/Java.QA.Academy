package com.academy.lecture42.listEx.arrays;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        String[] theVals = {"София", "Варна", "Пловдив", "Бургас"};
        System.out.println("Origin: " + Arrays.toString(theVals));
        Arrays.sort(theVals);
        System.out.println("After sort: " + Arrays.toString(theVals));
    }
}
