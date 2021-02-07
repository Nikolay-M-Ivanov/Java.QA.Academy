package com.academy.lecture43.OOP;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data //giving getter and setter
public class Person {
    private String name;
    private int age;
    private ContactInfo contactInfo; //HAS - A aggregation / наследява класа за контакт инфо

    //  public abstract void printInfo();

   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }*/
}
