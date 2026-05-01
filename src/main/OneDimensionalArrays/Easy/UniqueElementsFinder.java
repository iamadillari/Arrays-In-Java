package com.learning.arrays.OneDimensionalArrays.Easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class provides functionality to find unique elements from an ArrayList of integers.
 */
public class UniqueElementsFinder {

    /**
     * The main method serves as the entry point of the program.
     * It initializes an ArrayList with integers, prints the original list,
     * and prints the list of unique elements.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Getting the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Getting elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Printing the original ArrayList
        System.out.println("Given Array: " + list);

        // Printing the unique elements from the ArrayList
        System.out.println("Unique Array is: " + uniqueElements(list));

        scanner.close();
    }

    /**
     * Finds and returns the unique elements from the given ArrayList.
     * An element is considered unique if it appears only once in the list.
     *
     * @param list The input ArrayList of integers.
     * @return A new ArrayList containing only the unique elements from the input list.
     */
    public static ArrayList<Integer> uniqueElements(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        // Iterating through the list to find unique elements
        for (int i = 0; i < list.size(); i++) {
            int currentElement = list.get(i);
            int freq = 0;

            // Counting the frequency of the current element
            for (int j = 0; j < list.size(); j++) {
                if (currentElement == list.get(j)) {
                    freq++;
                }
            }
            // Adding the element to the result if it is unique
            if (freq == 1) {
                result.add(currentElement);
            }
        }
        return result;
    }
}