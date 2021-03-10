package com.academy.lecture45;

import lombok.Getter;

@Getter
public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name); // създаваме сетер в който задаваме условия, после ги извикваме в конструктора
        setCost(cost); // това се нарича капсулиране на данни
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name can not be empty");
        }
        this.name = name;
    }
    private void setCost(double money){
        if (money < 0){
            throw new IllegalArgumentException("Cost can not be negative");
        }
        this.cost = cost;
    }
}
