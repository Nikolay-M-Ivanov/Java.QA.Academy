package com.academy.lecture45.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player player = new Player("Ivan", 86.5);
        System.out.println(player);

        String line;
        while (true){
            if ("end".equalsIgnoreCase(line = reader.readLine())){
                break;
            }
        }
    }
}
