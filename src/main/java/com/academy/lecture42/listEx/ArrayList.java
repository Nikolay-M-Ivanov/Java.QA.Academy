package com.academy.lecture42.listEx;

public class ArrayList {

    static java.util.ArrayList<String> list = new java.util.ArrayList<String>();

    public static void main(String[] args) {
        printCompanyOffices();
        addNewOffice();
        changeOfficeName();
    }

    private static void printCompanyOffices() {
        list.add("Barcelona");
        list.add("Sofia");
        list.add("London");
        list.add("Paris");

        System.out.println("Company offices: " + list);
    }

    private static void addNewOffice() {
        list.add(3, "London-West");
        System.out.println("Company offices after adding new one: " + list);
    }

    private static void changeOfficeName() {
        list.set(3, "London-East");
        System.out.println("Company offices after change: " + list);
    }
}
