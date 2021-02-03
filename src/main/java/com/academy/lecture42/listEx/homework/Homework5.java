package com.academy.lecture42.listEx.homework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(0);
        } else {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;

            int sum = fib[0] + fib[1];

            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
                sum += fib[i];
            }
            System.out.println(sum);
        }
    }
}