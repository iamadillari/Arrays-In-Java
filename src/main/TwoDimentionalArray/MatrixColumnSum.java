package main.TwoDimentionalArray;

/*
Problem Description:
Given a 2D Array A[][], Return sum of every column in an array.
*/

import java.util.Arrays;

public class MatrixColumnSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("Array is: " + Arrays.toString(computeColumnSums(mat)));
    }

    public static int[] computeColumnSums(int[][] matrix) {
        int columns = matrix[0].length;
        int[] columnSums = new int[columns];
        for (int col = 0; col < columns; col++) {
            for (int row = 0; row < matrix.length; row++) {
                columnSums[col] += matrix[row][col];
            }
        }
        return columnSums;
    }
}