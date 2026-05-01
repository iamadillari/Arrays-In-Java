package com.learning.arrays.TwoDimentionalArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * MatrixRowMaxFinder is a utility class that finds the maximum element in a specific row of a 2D matrix.
 *
 * <p><b>Logic Explanation:</b>
 * The algorithm works by:
 * 1. Taking a 2D ArrayList matrix and a row index as input
 * 2. Initializing the maximum value with the first element of the specified row
 * 3. Iterating through the remaining elements of that row
 * 4. Comparing each element with the current maximum
 * 5. Updating the maximum whenever a larger element is found
 * 6. Returning the final maximum value after checking all elements in the row
 * </p>
 *
 * <p><b>Sample Input/Output:</b>
 * Input Matrix:
 * [[1, 2, 3, 4, 5],
 *  [6, 7, 8, 9, 10],
 *  [11, 12, 13, 14, 15]]
 *
 * Sample Outputs:
 * - Max in row 0: 5
 * - Max in row 1: 10
 * - Max in row 2: 15
 * </p>
 *
 * <p><b>Better class name suggestions:</b>
 * <ul>
 *   <li>MatrixRowMaxFinder</li>
 *   <li>RowMaximumCalculator</li>
 *   <li>MatrixRowAnalyzer</li>
 *   <li>MaximumElementLocator</li>
 * </ul>
 * </p>
 *
 * <p><b>Better method name suggestions:</b>
 * <ul>
 *   <li>findRowMaximum()</li>
 *   <li>getRowMaxValue()</li>
 *   <li>calculateRowMaximum()</li>
 *   <li>findMaximumInRow()</li>
 * </ul>
 * </p>
 */
public class MatrixRowMaxFinder {
    public static void main(String[] args) {
        // Create a 2D ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Add rows with values
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10)));
        matrix.add(new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15)));

        // Print the matrix
        System.out.println("Given Arraylist is: "+matrix);
        System.out.println("Maximum element is: "+findRowMaximum(matrix,2));
    }

    /**
     * Finds the maximum element in a specific row of a 2D matrix.
     *
     * <p><b>Algorithm:</b>
     * 1. Initialize the maximum value with the first element of the specified row
     * 2. Iterate through the remaining elements in the row (starting from index 1)
     * 3. Compare each element with the current maximum
     * 4. If a larger element is found, update the maximum value
     * 5. Return the final maximum value after examining all elements in the row
     * </p>
     *
     * <p><b>Sample usage:</b>
     * For matrix [[1, 8, 3], [4, 2, 9], [7, 5, 6]]:
     * - findRowMaximum(matrix, 0) returns 8
     * - findRowMaximum(matrix, 1) returns 9
     * - findRowMaximum(matrix, 2) returns 7
     * </p>
     *
     * @param matrix the 2D ArrayList matrix containing integer values
     * @param rowIndex the zero-based index of the row to search for maximum element
     * @return the maximum element found in the specified row
     * @throws IndexOutOfBoundsException if rowIndex is invalid or the row is empty
     */
    static int findRowMaximum(ArrayList<ArrayList<Integer>> matrix, int rowIndex){
        //Initialize Max: Start by assuming the very first number in that row is the largest.
        int max = matrix.get(rowIndex).get(0);
        for (int i = 1; i < matrix.get(rowIndex).size(); i++) {
            if(matrix.get(rowIndex).get(i)>max){
                max=matrix.get(rowIndex).get(i);
            }
        }
        return max;
    }
}