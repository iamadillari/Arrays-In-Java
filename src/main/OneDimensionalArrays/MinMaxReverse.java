package com.learning.arrays.OneDimensionalArrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * MinMaxReverse class demonstrates operations on an ArrayList.
 * It adds elements, finds minimum and maximum values, and reverses the list.
 */
public class MinMaxReverse {

    /**
     * Main method to demonstrate ArrayList operations.
     * Adds sample elements, displays them, finds min/max, and reverses the list.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(23);
        list.add(56);
        list.add(89);
        list.add(34);

        System.out.println("Original list: " + list);
        System.out.println("Minimum element: " + findMinimum(list));
        System.out.println("Maximum element: " + findMaximum(list));

        reverseList(list);
        System.out.println("Reversed list: " + list);
    }

    /**
     * Finds the minimum element in the ArrayList.
     *
     * @param list the ArrayList to search
     * @return the minimum value, or Integer.MAX_VALUE if list is empty
     */
    static int findMinimum(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    /**
     * Finds the maximum element in the ArrayList.
     *
     * @param list the ArrayList to search
     * @return the maximum value, or Integer.MIN_VALUE if list is empty
     */
    static int findMaximum(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    /**
     * Reverses the ArrayList in-place.
     *
     * @param list the ArrayList to reverse
     */
    static void reverseList(ArrayList<Integer> list) {
        Collections.reverse(list);
    }
}