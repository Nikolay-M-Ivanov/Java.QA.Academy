package com.academy.lecture41;

public class Main {
    public static void main(String[] args) {

       // checkPeopleRights(20);
//извикваме метода директно, защото се намира в Main class
      //  LectureSwitch.getMonthNumberOfDates(2, 2020);
//извикваме метод който е public & static "getMonthNumberOfDates" от клас LectureSwitch
//ако метода не е static, "LectureSwitch lectureswitch = new LectureSwitch();"
        Homework.biggerOfThree();
        }
    public static void checkPeopleRights(int age){
        boolean isAllowedToDrive = false;
        boolean hasRightsToDrink = false;
        boolean isAllowedToVote =false;

        if(age < 18) {
            System.out.println("Nothing is allowed!");
        } else if (age >= 18 && age <21){
            isAllowedToVote = true;
            isAllowedToDrive = true;
            System.out.println("isAllowedToVote: " + isAllowedToVote + ", hasRightsToDrink: " + hasRightsToDrink
                    + ", isAllowedToDrive: " + isAllowedToDrive);
        }else {
            isAllowedToVote = true;
            isAllowedToDrive = true;
            hasRightsToDrink = true;
            System.out.println("isAllowedToVote: " + isAllowedToVote + ", hasRightsToDrink: " + hasRightsToDrink
                    + ", isAllowedToDrive: " + isAllowedToDrive);
        }
    }
}
