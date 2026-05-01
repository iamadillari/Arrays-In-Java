package com.learning.arrays.OneDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Practice {
    /**
     * Calculates the sum of each column in a 2D array.
     *
     * <p><b>Logic:</b> This method iterates through each column index, and for each column,
     * it iterates through all rows to accumulate the sum of elements in that column.
     *
     * <p><b>Algorithm:</b>
     * <ul>
     *   <li>Create an array 'cols' with length equal to number of columns</li>
     *   <li>Outer loop: iterate through each column (c)</li>
     *   <li>Inner loop: iterate through each row (r)</li>
     *   <li>Add matrix[r][c] to cols[c] for each element</li>
     * </ul>
     *
     * @param matrix A 2D integer array (must have at least one row)
     * @return An array containing the sum of each column
     *
     * @example
     * <pre>
     * Input:
     * [
     *   [10, 20, 30],
     *   [40, 50, 60],
     *   [70, 80, 90]
     * ]
     *
     * Output:
     * [120, 150, 180]
     *
     * Explanation:
     * Column 0: 10 + 40 + 70 = 120
     * Column 1: 20 + 50 + 80 = 150
     * Column 2: 30 + 60 + 90 = 180
     * </pre>
     */
    public static int[] columnSums(int[][] matrix) {
        int[] cols = new int[matrix[0].length];
        for (int c = 0; c < matrix[0].length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                cols[c] = cols[c] + matrix[r][c];
            }
        }
        return cols;
    }

    public static void main(String[] args) {
        //Given a 2D Array A[][], Return sum of every column in an array.
        int[][] A = {
            {10, 20, 34340},
            {40, 150, 60},
            {70, 80, 90}
        };

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(11, 2, 0)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 215, -6)));
        matrix.add(new ArrayList<>(Arrays.asList(-7, 83, 9)));

        //expected output: [120, 150, 180]
        int[] result = columnSums(A);
        System.out.println("Sum of each column is: "+Arrays.toString(result));
        System.out.println("Maximum Element from the given matrix is: "+maxElementFromRow(A));
        System.out.println("Maximum Element from the given normal Array matrix using math function is: "+maxElementFromRowUsingMathMax(A));
        System.out.println("Maximum Element from the given Arraylist matrix using math function is: "+maxElementFromRowUsingMathMaxWithArrayList(matrix));
    }

    /**
     * Finds the maximum element in a 2D array by traversing all rows and columns.
     *
     * <p><b>Logic:</b> This method initializes max with the first element (A[0][0]),
     * then iterates through every element in the matrix, updating max whenever
     * a larger value is found.
     *
     * <p><b>Algorithm:</b>
     * <ul>
     *   <li>Initialize max with the first element A[0][0]</li>
     *   <li>Outer loop: iterate through each column (c)</li>
     *   <li>Inner loop: iterate through each row (r)</li>
     *   <li>Compare each A[r][c] with max, update if larger</li>
     *   <li>Return max after checking all elements</li>
     * </ul>
     *
     * @param A A 2D integer array (must have at least one element)
     * @return The maximum value found in the entire matrix
     *
     * @example
     * <pre>
     * Input:
     * [
     *   [10, 20, 34340],
     *   [40, 150, 60],
     *   [70, 80, 90]
     * ]
     *
     * Output:
     * 34340
     * </pre>
     */
    public static int maxElementFromRow(int[][] A)
        {
            int max = A[0][0];
            for (int c = 0; c < A[0].length; c++) {
                for (int r = 0; r < A.length; r++) {
                    int currentValue = A[r][c];
                    if(currentValue>max){
                        max=currentValue;
                    }
                }
            }
            return max;
        }
        
        public static int maxElementFromRowUsingMathMax(int[][] A){
        int max = Integer.MIN_VALUE;
            for (int r = 0; r < A.length; r++) {
                for (int c = 0; c < A[0].length; c++) {
                    max = Math.max(max, A[r][c]);
                }
            }
        return max;
        }

    public static int maxElementFromRowUsingMathMaxWithArrayList(ArrayList<ArrayList<Integer>> A){
        int max = Integer.MIN_VALUE;
        for (int r = 0; r < A.size(); r++) {
            for (int c = 0; c < A.get(0).size(); c++) {
                max = Math.max(max, A.get(r).get(c));
            }
        }
        return max;
    }
}
