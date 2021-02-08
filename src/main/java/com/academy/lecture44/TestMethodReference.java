package com.academy.lecture44;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMethodReference {
    public static void main(String[] args) {
//static reference
        StudentMethodReference[] students = {new StudentMethodReference(3.4),
                new StudentMethodReference(6),
                new StudentMethodReference(5.3)};

        Arrays.sort(students, StudentMethodReference::compareGrades);

        for (StudentMethodReference student : students) {
            System.out.println(student.getAvgGrade());
        }
//dynamic reference
        StudentMethodReference[] studentName = {new StudentMethodReference("Gerogi"),
                new StudentMethodReference("Elena"),
                new StudentMethodReference("Alex")};
        CompareObjects compareObjects = new CompareObjects();

        Arrays.sort(studentName, compareObjects::compareByName);

        for (StudentMethodReference student : studentName) {
            System.out.println(student.getName());
        }

        //Atribtray
        ArrayList<String> list = new ArrayList<String>();
        list.add("Barcelona");
        list.add("Sofia");
        list.add("London");
        list.add("Paris");

        list.forEach(System.out::println);
    }
    }


