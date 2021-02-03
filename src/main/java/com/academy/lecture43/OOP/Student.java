package com.academy.lecture43.OOP;

public class Student extends Person {
    private String faculty;
    private int facultyNumber;

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", facultyNumber=" + facultyNumber +
                '}';
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public void printInfo() {
        System.out.println("Test");
    }

    public void printInfo(String info) {
        System.out.println(info);
    }
}
