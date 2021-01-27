package com.academy.lecture41;

import java.util.Scanner;

public class Homework {

    public static void daysOfWeek(int day){
        switch (day){
            case 1:
                System.out.println("You entered 1. So week day is Monday.");
                break;
            case 2:
                System.out.println("You entered 2. So week day is Tuesday.");
                break;
            case 3:
                System.out.println("You entered 3. So week day is Wednesday.");
                break;
            case 4:
                System.out.println("You entered 4. So week day is Thursday.");
                break;
            case 5:
                System.out.println("You entered 5. So week day is Friday.");
                break;
            case 6:
                System.out.println("You entered 6. So week day is Saturday.");
                break;
            case 7:
                System.out.println("You entered 7. So week day is Sunday.");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }
    }

    public static void rectangleCalc(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter parameter for a ");
        int a = scan.nextInt();

        System.out.print("Enter parameter for b ");
        int b = scan.nextInt();

        System.out.println("Rectangle perimeter is: " + ((2 * a) + (2 * b)));
        System.out.println("Rectangle area is: " + (a * b));
    }

    public static void positiveOrNegativeNum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();

        if (num < 0){
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }

    public static void biggerOfThree(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNum = scan.nextInt();

        if ((firstNum > secondNum && firstNum > thirdNum) && (firstNum != secondNum && firstNum != thirdNum)){
            System.out.println("The biggest number is: " + firstNum);
        } else if ((secondNum > firstNum && secondNum > thirdNum) && (secondNum != firstNum && secondNum != thirdNum)){
            System.out.println("The biggest number is: " + secondNum);
        } else {
            System.out.println("The biggest number is: " + thirdNum);
        }
    }
}
//homework completed.