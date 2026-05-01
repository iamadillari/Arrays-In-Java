package main.OneDimensionalArrays.Easy;

import java.util.Arrays;

/**
 * Demonstrates a single-pass left rotation of an integer array.
 */

public class LeftRotateBy1_1 {
    /**
     * Executes the array rotation logic.
     * <p>
     * This initializes an array, shifts every element one position to the left
     * using a temporary variable to wrap the first element to the end,
     * and prints the results to the console.
     */
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7};
        //expected output: [2,3,4,5,6,7,1]
        System.out.println("Initial Array is: "+ Arrays.toString(A));
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        System.out.println("Rotated Array is: "+ Arrays.toString(A));
    }
}


