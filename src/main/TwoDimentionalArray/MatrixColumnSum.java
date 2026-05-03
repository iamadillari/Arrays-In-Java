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
    // Get the number of columns in the matrix. Assumes a non-empty matrix.
    int columns = matrix[0].length;
    // Create an array to store the sum of each column, initialized to zeros.
    int[] columnSums = new int[columns];
    // Iterate through each column.
    for (int col = 0; col < columns; col++) {
        // For each column, iterate through each row to sum its elements.
        for (int row = 0; row < matrix.length; row++) {
            // Add the element at the current row and column to the corresponding column sum.
            columnSums[col] += matrix[row][col];
        }
    }
    // Return the array containing the sum of each column.
    return columnSums;
}
}