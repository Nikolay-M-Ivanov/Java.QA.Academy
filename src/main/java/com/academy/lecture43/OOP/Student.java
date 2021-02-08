package com.academy.lecture43.OOP;

public class Student extends Person {
    private String faculty;
    private int facultyNumber;

    public Student() { //default constructor

    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", facultyNumber=" + facultyNumber +
                '}';
    }

    public Student(String faculty, int facultyNumber) { //custom constructor
        this.faculty = faculty;
        this.facultyNumber = facultyNumber;
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
