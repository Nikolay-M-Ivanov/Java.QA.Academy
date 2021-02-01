package com.academy.lecture42.listEx.arrays;

public class ForEachEx {
    public static void main(String[] args) {
        float[] theVals = {10.0f, 20.0f, 15.0f};
        float sum = 0.0f;

        for (float currentVal : theVals)
            sum += currentVal;

        System.out.println(sum);
    }
}
