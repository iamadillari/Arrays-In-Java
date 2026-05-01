package com.learning.arrays.TwoDimentionalArray;

/**
 * This class contains a program to check if a given 2D matrix is an identity matrix.
 * An identity matrix is a square matrix where all diagonal elements are 1 and all off-diagonal elements are 0.
 */
public class CheckIdentityMatrix {
    /**
     * The main method initializes a sample matrix and checks if it is an identity matrix,
     * then prints the result.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        };
        System.out.println("Check: " + checkIdentityMatrixOrNot(matrix));
    }

    /**
     * Checks if the given 2D array represents an identity matrix.
     * Logic:
     * 1. Iterate through each element (i, j).
     * 2. If on diagonal (i == j), value must be 1.
     * 3. If off diagonal (i != j), value must be 0.
     * 4. Return 0 if any condition fails, else return 1.
     *
     * @param A the 2D array to check
     * @return 1 if the matrix is an identity matrix, 0 otherwise
     */
    static int checkIdentityMatrixOrNot(int[][] A) {
        // Iterate through each row
        for (int i = 0; i < A.length; i++) {
            // Iterate through each column
            for (int j = 0; j < A[i].length; j++) {
                // If it's a diagonal element (i == j), it must be 1
                if (i == j && A[i][j] != 1) {
                    return 0; // Not an identity matrix
                }
                // If it's an off-diagonal element (i != j), it must be 0
                if (i != j && A[i][j] != 0) {
                    return 0; // Not an identity matrix
                }
            }
        }
        return 1; // All checks passed, it's an identity matrix
    }
}