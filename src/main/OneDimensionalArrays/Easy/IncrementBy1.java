package main.OneDimensionalArrays.Easy;

import java.util.ArrayList;

/**
 * Provides utility functions for performing basic operations on one-dimensional arrays.
 * <p>
 * This class focuses on simple iterative transformations, specifically targeting
 * {@link ArrayList} collections of integers.
 * </p>
 * * @author Your Name
 * @version 1.0
 */
public class IncrementBy1 {

    /**
     * Entry point for the application.
     * Initializes an ArrayList with sample data and demonstrates the
     * increment functionality by printing the result to the console.
     *
     * @param args command line arguments (not used).
     */
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(12);
        A.add(75);
        A.add(26);
        A.add(18);
        A.add(10);
        System.out.println(incrementBy1(A));
    }

    /**
     * Iterates through the provided ArrayList and increments every element by one.
     * <p>
     * <b>Note:</b> This method modifies the original list in place using the
     * {@code set()} method and returns the same list reference.
     * </p>
     *
     * @param A the {@code ArrayList<Integer>} containing the elements to be incremented.
     * @return  the same {@code ArrayList} object with each element updated.
     */
    public static ArrayList<Integer> incrementBy1(ArrayList<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            A.set(i, (A.get(i) + 1));
        }
        return A;
    }
}