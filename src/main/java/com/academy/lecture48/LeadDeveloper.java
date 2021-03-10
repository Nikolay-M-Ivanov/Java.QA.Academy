package com.academy.lecture48;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeadDeveloper extends Employee implements LeadingRole, ProjectManagement{

    private static final String EMPLOYEE_POSITION_NAME = "Lead Software Engineer";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Development";

    public LeadDeveloper(String name, int employeeID) {
        super(name, employeeID, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    @Override
    protected void calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate) {
        int calculatedSalary = super.calculateSalary(workedDays, dailyGrossRate) + 2000;
        log.info("The Lead {} has salary with fixed bonus: {}", super.getName(), calculatedSalary);
    }

    @Override
    public void managePeople() {
        log.info("Dev should lead, support and manage people in the team");
    }

    @Override
    public void giveFeedback() {

    }

    @Override
    public void leadProject() {

    }
}
