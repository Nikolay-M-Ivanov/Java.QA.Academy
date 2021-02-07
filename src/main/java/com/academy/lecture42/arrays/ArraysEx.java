package com.academy.lecture42.arrays;

public class ArraysEx {
    public static void main(String[] args) {
        float[] theValues = new float[3];
        theValues[0] = 10.0f;
        theValues[1] = 20.0f;
        theValues[2] = 15.0f;

     //   System.out.println(theValues); //референция в паметта
        float sum = 0.0f;

        for (int i = 0; i < theValues.length; i++){
            sum += theValues[i];
        }
        System.out.println(sum);
    }
}
