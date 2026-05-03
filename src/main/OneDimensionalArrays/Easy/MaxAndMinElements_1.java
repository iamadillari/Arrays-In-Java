package main.OneDimensionalArrays.Easy;

import java.util.Scanner;

/**
 * Provides a command-line utility to analyze an array of integers.
 * This class captures user input to find and display the minimum
 * and maximum values within a provided data set.
 */
public class MaxAndMinElements_1 {

    /**
     * Entry point of the application.
     * * @implNote <b>Logic Implementation:</b>
     * The algorithm utilizes a single-pass linear search (O(n) complexity).
     * <ul>
     * <li>It initializes {@code max} and {@code min} with the first element of the array.</li>
     * <li>It iterates through the remaining elements starting from index 1.</li>
     * <li>For each element, it performs two comparisons to update the current bounds.</li>
     * </ul>
     * This approach is efficient as it ensures each element is visited exactly once.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the arrays: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        /* * Logic: Early exit if array is empty
         */
        if (A.length == 0) {
            System.out.println("Array is Empty, nothing to print!!");
            return;
        }

        /* * Logic: Linear Search Implementation
         * Initialize trackers with the first element to handle all integer ranges.
         */
        int max = A[0];
        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            // Update max if current element is larger
            if (max < A[i]) {
                max = A[i];
            }
            // Update min if current element is smaller
            if (min > A[i]) {
                min = A[i];
            }
        }

        System.out.println("Max element is: " + max);
        System.out.println("Min element is: " + min);
    }
}