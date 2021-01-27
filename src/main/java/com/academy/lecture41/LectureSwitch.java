package com.academy.lecture41;

public class LectureSwitch {

    public static void getMonthNumberOfDates(int number, int year){
        String monthName;
        int numberOfDays;

        switch (number){
            case 1:
                monthName = "January";
                numberOfDays = 31;
                System.out.println("monthName :" + monthName +" numberOfDays: " + numberOfDays);
                break;
            case 2:
                monthName = "February";
                if ((year % 400 ==0) || ((year % 4==0) && (year % 100 != 0))){
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                System.out.println("monthName :" + monthName +" numberOfDays: " + numberOfDays);
                break;
            default:
                System.out.println("Not Valid");
        }
    }
}
