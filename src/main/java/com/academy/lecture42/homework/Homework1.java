package com.academy.lecture42.homework;

public class Homework1 {
    public static void main(String[] args) {


        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
            System.out.println("index: " + i + " " + arr[i]);
        }
    }
}
