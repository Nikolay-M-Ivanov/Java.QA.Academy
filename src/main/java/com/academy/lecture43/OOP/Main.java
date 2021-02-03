package com.academy.lecture43.OOP;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFaculty("CST");
        student.setFacultyNumber(123456);
        //    student.printInfo(); //това води до метода в Студент и ще изпише Тест
        //    student.printInfo("Test2"); //това води до втория метод в Студент и ще изпише Тест2
        System.out.println(student.toString());
    }
}
