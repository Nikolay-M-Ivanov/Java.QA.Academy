package com.academy.lecture48;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QualityEngineer extends Employee{

    private static final String EMPLOYEE_POSITION_NAME = "Quality Assurance Engineer";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Quality Assurance";

    private boolean isTestAutomationExpert;

    public QualityEngineer(String name, int employeeID) {
        super(name, employeeID, EMPLOYEE_POSITION_NAME, EMPLOYEE_DEPARTMENT_NAME);
    }

    public QualityEngineer(String name, int employeeID, boolean isTestAutomationExpert) {
        super(name, employeeID, EMPLOYEE_POSITION_NAME, EMPLOYEE_DEPARTMENT_NAME);
        this.isTestAutomationExpert = isTestAutomationExpert;
    }

    @Override
    protected void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate) {
        int calculatedSalary = super.calculateSalary(workedDays, dailyGrossRate) + 1000;
        log.info("The QA {} has salary with fixed bonus: {}", super.getName(), calculatedSalary);
    }
    protected void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate, int bonus) {
        int calculatedSalary = super.calculateSalary(workedDays, dailyGrossRate) + bonus;
        log.info("The QA {} has salary with individual bonus: {}", super.getName(), calculatedSalary);
    }
}
