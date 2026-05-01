package com.learning.arrays.OneDimensionalArrays.Easy;

import java.util.ArrayList;

/**
 * The {@code AllEvenElementsOfArray} class provides a utility to filter
 * integers from a list, specifically isolating even numbers.
 * <p>
 * This class is part of the One-Dimensional Arrays collection under the
 * Easy difficulty category.
 * </p>
 * * @author YourName
 * @version 1.0
 */
public class AllEvenElementsOfArray {

    /**
     * The entry point of the application.
     * Initializes a sample list of integers and prints the filtered results
     * to the standard output.
     * * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(12);
        A.add(75);
        A.add(26);
        A.add(18);
        A.add(10);
        System.out.println(solve(A));
    }

    /**
     * Filters the input list and returns a new list containing only
     * the even elements.
     * <p>
     * An element is considered even if the condition {@code element % 2 == 0}
     * is satisfied.
     * </p>
     * * @param A An {@code ArrayList} of integers to be processed.
     * @return A new {@code ArrayList} containing only the even integers
     * from the original list.
     */
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                al.add(A.get(i));
            }
        }
        return al;
    }
}