package com.academy.lecture42.listEx.homework;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        // System.out.println(sum);
        int avg = sum / num.length;
        System.out.println("Average of array is: " + avg);
    }
}
