package com.academy.lecture42.listEx;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("1. Sofia");
        stack.push("2. Berlin");
        stack.push("3. Madrid");

        System.out.println("Peek: " + stack.peek()); //виждаме кой елемент е най отгоре в стака

        while (stack.size() > 0) {
            String city = stack.pop();
            System.out.println(city);
        }
    }
}
