package main.TwoDimentionalArray;

import java.util.Arrays;

public class TransaposeSquareMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Given Matrix: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row) + " ");
        }
        System.out.println("Transpose Matrix: ");
        for (int[] row : squareTransposeMatrix(matrix)) {
            System.out.println(Arrays.toString(row) + " ");
        }
    }
    static int[][] squareTransposeMatrix(int[][] A){
        for (int r = 0; r < A.length; r++) {
            for (int c = 0; c < A[r].length; c++) {
                int temp = A[r][c];
                A[r][c] = A[c][r];
                A[c][r] = temp;
            }
        }
        return A;
    }
}
