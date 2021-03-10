package com.academy.lecture49;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, CustomCalculateException {
        FileReader.readFile("test");
        //ScannerReader.readFromConsole();
//        calculate(5,0);
//    }
//    private static int calculate(int a, int b) throws CustomCalculateException {
//        try {
//            return a/b;
//        }catch (ArithmeticException e) {
//            throw new CustomCalculateException("Divide by zero is not allowed");
//        }
   }
}
