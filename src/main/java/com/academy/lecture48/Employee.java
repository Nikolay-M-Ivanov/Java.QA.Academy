package com.academy.lecture48;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@Slf4j

public abstract class Employee {

    private String name;
    private int employeeID;
    private String department;
    private String position;

    protected abstract void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate);

    protected int calculateSalary(int workedDays, int dailyGrossRate){
        return workedDays * dailyGrossRate;
    }
}
