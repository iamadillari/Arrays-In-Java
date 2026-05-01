package com.learning.arrays.TwoDimentionalArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * MatrixRowSumCalculator is a utility class that calculates the sum of elements
 * in a specific row of a 2D matrix represented as an ArrayList.
 *
 * <p>Sample Input:
 * Matrix:
 * [
 *   [1, 2, 3, 4, 5],
 *   [6, 7, 8, 9, 10],
 *   [11, 12, 13, 14, 15]
 * ]
 *
 * Sample Output:
 * Row 0 sum: 15 (1+2+3+4+5)
 * Row 1 sum: 40 (6+7+8+9+10)
 * Row 2 sum: 65 (11+12+13+14+15)
 * </p>
 *
 * <p>Better class name suggestions:
 * <ul>
 *   <li>MatrixRowSumCalculator</li>
 *   <li>RowSumProcessor</li>
 *   <li>MatrixRowAnalyzer</li>
 * </ul>
 * </p>
 */
public class MatrixRowSumCalculator {
    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Add rows with values
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10)));
        matrix.add(new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15)));

        // Print the matrix
        System.out.println("Given Arraylist is: "+matrix);
        System.out.println("Sum of given row num is: "+calculateRowSum(matrix, 2)); //40
    }

    /**
     * Calculates the sum of all elements in a specific row of a 2D matrix.
     *
     * <p>This method takes a 2D ArrayList matrix and a row index, then computes
     * the sum of all elements in that particular row by iterating through each
     * column of the specified row.</p>
     *
     * @param matrix the 2D ArrayList matrix containing integer values
     * @param rowIndex the zero-based index of the row to sum
     * @return the sum of all elements in the specified row
     * @throws IndexOutOfBoundsException if rowIndex is negative or >= matrix size
     */
    static int calculateRowSum(ArrayList<ArrayList<Integer>> matrix, int rowIndex){
        int sum = 0;
        for (int i = 0; i < matrix.get(rowIndex).size(); i++) {
            sum = sum + matrix.get(rowIndex).get(i);
        }
        return sum;
    }
}