package com.academy.lecture42.listEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("1. Sofia");
        queue.offer("2. Berlin");
        queue.offer("3. Madrid");

        System.out.println("Peek: " + queue.peek()); //виждаме кой елемент е последен в опашката

        while (queue.size() > 0){
            String city = queue.poll();
            System.out.println(city);
        }
    }
}
