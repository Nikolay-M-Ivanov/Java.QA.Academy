package com.academy.lecture43.OOP;

import lombok.Data;

@Data

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }
}
