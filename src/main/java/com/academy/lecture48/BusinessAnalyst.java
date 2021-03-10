package com.academy.lecture48;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BusinessAnalyst extends Employee {
    private static final String EMPLOYEE_POSITION_NAME = "Business Analyst";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Business Analyst & Coordination";

    public BusinessAnalyst(String name, int employeeID) {
        super(name, employeeID, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    @Override
    protected void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate) {
        int calculatedSalary = super.calculateSalary(workedDays, dailyGrossRate) + 500;
        log.info("The BA {} has salary with fixed bonus: {}", super.getName(), calculatedSalary);
    }
}
