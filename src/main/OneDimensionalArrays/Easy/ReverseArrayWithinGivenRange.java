package main.OneDimensionalArrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class provides a method to reverse a subarray within a given one-dimensional array.
 * It takes an array and two indices as input, and returns the modified array with the subarray reversed.
 * The reversal is done in-place, meaning it modifies the original array.
 *
 * Problem Statement:
 * Given an array and two indices, reverse the subarray from the given start index to the end index.
 *
 * Example:
 * Input:  array = [1, 2, 3, 4, 5], start index = 1, end index = 3
 * Output: array = [1, 4, 3, 2, 5]
 *
 * @author iamadillari
 */
public class ReverseArrayWithinGivenRange {
    /**
     * Main method to test the reverseArray function.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Define the input array
        int[] A = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            A[i] = scanner.nextInt();
        }

        // Define the start and end indices of the subarray to be reversed
        System.out.print("Enter the start index (inclusive): ");
        int B = scanner.nextInt();
        System.out.print("Enter the end index (inclusive): ");
        int C = scanner.nextInt();

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(A));

        // Reverse the subarray and print the result
        System.out.println("Reversed subarray: " + Arrays.toString(reverseArray(A, B, C)));
        //Reverse the subarray using the two pointers approach and print the result
        System.out.println("Reversed subarray using two pointers approach: " + Arrays.toString(reverseArrayTwoPointers(A, B, C)));
        scanner.close();
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

    /**
     * Reverses a subarray within the given array using the two pointers approach.
     *
     * @param A the input array
     * @param B the start index of the subarray to be reversed (inclusive)
     * @param C the end index of the subarray to be reversed (inclusive)
     * @return the modified array with the subarray reversed
     */
    public static int[] reverseArrayTwoPointers(int[] A, int B, int C) {
        int left = B;
        int right = C;

        while (left < right) {
            // Swap the elements at the left and right pointers
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

        // Return the modified array
        return A;
    }
}