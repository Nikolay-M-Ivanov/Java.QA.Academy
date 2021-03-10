package com.academy.lecture48;

public class Main {
    public static void main(String[] args) {
      //  Employee employee = new Employee("Niki", 1,"Soft","QA");

        Employee[] employees = new Employee[3];

        QualityEngineer qa = new QualityEngineer("Niki", 15, true);
        BusinessAnalyst ba = new BusinessAnalyst("Mitko",12);
        LeadDeveloper dev = new LeadDeveloper("Ivan", 30);

        employees[0] = qa;
        employees[1] = ba;
        employees[2] = dev;

        qa.calculateEmployeeMonthlySalaryWithBonus(20,100);
        qa.calculateEmployeeMonthlySalaryWithBonus(20,100, 2000);

        dev.managePeople();
    }
}
