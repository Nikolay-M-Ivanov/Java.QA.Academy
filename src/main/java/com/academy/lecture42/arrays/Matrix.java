package com.academy.lecture42.arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4}, //row 0
                {5, 6, 7, 8}, //row 1
        };
        for (int row = 0; row < matrix.length; row++){
            for (int colum = 0; colum < matrix[0].length; colum++){
              //  System.out.printf("%d", matrix[row][colum]);
                System.out.print(matrix[row][colum]);
            }
           System.out.println();

          //  String a = "Number: %d";
          //  System.out.println(a);
          //  System.out.println(String.format(a, "Test"));


        }

    }
}
