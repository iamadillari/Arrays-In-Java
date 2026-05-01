package com.learning.arrays.OneDimensionalArrays.Easy;

import java.util.Scanner;

/**
 * count the number of pairs in an integer array whose sum equals a given number.
 */
public class PairSumCounter {

    /**
     * Entry point of the program. Reads an array and a target sum from the user,
     * invokes {@link #countPairs(int[], int)} to compute the number of pairs,
     * and prints the result.
     *
     * @param args command‑line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to check pair counts: ");
        int B = scanner.nextInt();
        System.out.println(countPairs(a, B));
    }

    /**
     * Counts unordered pairs (i, j) with i < j such that {@code arr[i] + arr[j] == B}.
     *
     * @param arr the input array of integers
     * @param B   the target sum for each pair
     * @return the number of pairs whose elements add up to {@code B}
     */
    static int countPairs(int[] arr, int B) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == B) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}