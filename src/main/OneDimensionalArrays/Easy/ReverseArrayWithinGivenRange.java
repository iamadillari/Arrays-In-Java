/**
 * This class provides a method to reverse a subarray within a given one-dimensional array.
 * It takes an array and two indices as input, and returns the modified array with the subarray reversed.
 * The reversal is done in-place, meaning it modifies the original array.
 *
 * @author iamadillari
 */
package main.OneDimensionalArrays.Easy;

import java.util.Arrays;

public class ReverseArrayWithinGivenRange {
    /**
     * Main method to test the reverseArray function.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Define the input array
        int[] A = {12, 54, 23, 14, 76, 70, 25};

        // Define the start and end indices of the subarray to be reversed
        int B = 1; // start index (inclusive)
        int C = 5; // end index (inclusive)

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(A));

        // Reverse the subarray and print the result
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(A, B, C)));
    }

    /**
     * Reverses a subarray within the given array.
     *
     * @param A the input array
     * @param B the start index of the subarray to be reversed (inclusive)
     * @param C the end index of the subarray to be reversed (inclusive)
     * @return the modified array with the subarray reversed
     */
    public static int[] reverseArray(int[] A, int B, int C) {
        // Initialize a temporary variable to hold the value of the current element
        int temp;

        // Initialize the index to the start of the subarray
        int i = B;

        // Loop until we reach the middle of the subarray
        while (i <= C / 2) {
            // Swap the current element with the corresponding element from the end of the subarray
            temp = A[i]; // store the current element in temp
            A[i] = A[C - i + 1]; // replace the current element with the element from the end
            A[C - i + 1] = temp; // replace the element from the end with the original current element

            // Move to the next element in the subarray
            i++;
        }

        // Return the modified array
        return A;
    }
}