package com.learning.arrays.OneDimensionalArrays.Easy;

import java.util.Scanner;

/**
 * A utility class that counts the frequency of a specific number in an integer array.
 *
 * This program accepts user input for array elements and a target number,
 * then calculates how many times the target number appears in the array.
 */
public class FrequencyOfNumInArray {

    /**
     * Main method that drives the program.
     * Prompts the user to enter array elements and a number to check,
     * then displays the frequency of that number in the array.
     *
     * @param args command line arguments (not used)
     *
     * @example
     * <pre>
     * Input:
     * Enter the number of elements of the arrays: 7
     * 1 2 3 2 4 2 5
     * Enter the number for which you wanna check the frequency in the array: 2
     *
     * Output:
     * Number of Frequency of the number in the Array is: 3
     * </pre>
     *
     * @example
     * <pre>
     * Input:
     * Enter the number of elements of the arrays: 5
     * 10 20 30 40 50
     * Enter the number for which you wanna check the frequency in the array: 25
     *
     * Output:
     * Number of Frequency of the number in the Array is: 0
     * </pre>
     */
    public static void main(String[] args) {
        // Create Scanner object to read user input from console
        Scanner sc = new Scanner(System.in);

        // Prompt user for the number of elements in the array
        System.out.print("Enter the number of elements of the arrays: ");
        int N = sc.nextInt();

        // Initialize array with the specified size
        int[] A = new int[N];

        // Loop to read each array element from user input
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        // Prompt user to enter the number whose frequency they want to check
        System.out.print("Enter the number for which you wanna check the frequency in the array: ");
        int B = sc.nextInt();

        // Call the checkFrequency method and display the result
        System.out.println("Number of Frequency of the number in the Array is: " + checkFrequency(A, B));
    }

    /**
     * Counts the frequency of a specific number in the given array.
     *
     * This method iterates through the array and counts how many times
     * the target number appears.
     *
     * @param A the integer array to search
     * @param n the number to count occurrences of
     * @return the number of times n appears in array A
     *
     * @example
     * <pre>
     * Input: array = {1, 2, 3, 2, 4, 2}, target = 2
     * Output: 3
     * </pre>
     *
     * @example
     * <pre>
     * Input: array = {5, 5, 5, 5, 5}, target = 5
     * Output: 5
     * </pre>
     */
    static int checkFrequency(int[] A, int n) {
        // Initialize counter to track number of occurrences
        int count = 0;

        // Iterate through each element in the array using enhanced for-loop
        for (int i : A) {
            // Check if current element matches the target number
            if (i == n) {
                // Increment count if there's a match
                count++;
            }
        }

        // Return the total count of occurrences
        return count;
    }
}