package com.academy.lecture42.whileExample;

public class Main {

    public static void main(String[] args) {
        calculateFactorial(4);


    }

    private static void calculateFactorial(int number) {
        int factorial = 1;

        while (number >1){
            factorial *= number;
            number--;
        }

        System.out.println(factorial);
    }
}
