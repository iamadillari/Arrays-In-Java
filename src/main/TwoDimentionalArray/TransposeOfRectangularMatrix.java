package com.learning.arrays.TwoDimentionalArray;

import java.util.Arrays;

/**
 * This class provides a method to calculate the transpose of a rectangular matrix
 * and demonstrates its usage in the main method.
 */
public class TransposeOfRectangularMatrix {
    /**
     * The main method initializes a sample 2D matrix, prints the original matrix,
     * calculates its transpose, and then prints the transposed matrix.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 6},
                {4, 5, 6, -1},
                {7, 8, 9, 5}
        };
        // Print the original matrix
        System.out.println("Given Matrix: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row) + " ");
        }
        // Calculate and print the transpose of the matrix
        System.out.println("Transpose Of the Matrix: ");
        for (int[] row : transposeOfMatrix(matrix)) {
            System.out.println(Arrays.toString(row) + " ");
        }
    }

    /**
     * Calculates the transpose of a given rectangular matrix.
     * The transpose of a matrix is obtained by changing rows to columns and columns to rows.
     * If the original matrix is of dimension M x N, the transposed matrix will be N x M.
     *
     * @param A The input 2D array (matrix) to be transposed.
     * @return A new 2D array representing the transpose of the input matrix.
     */
    static int[][] transposeOfMatrix(int[][] A) {
        // Create a new matrix with dimensions swapped (columns of A become rows, rows of A become columns)
        int[][] transpose = new int[A[0].length][A.length];
        // Iterate through the original matrix
        for (int r = 0; r < A.length; r++) {
            for (int c = 0; c < A[r].length; c++) {
                // Assign element A[r][c] to transpose[c][r]
                transpose[c][r] = A[r][c];
            }
        }
        return transpose;
    }
}