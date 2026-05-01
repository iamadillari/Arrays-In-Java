/**
 * RightRotateBy1Digit - Array Right Rotation Program
 *
 * This class demonstrates how to right-rotate a one-dimensional integer array by one position.
 * It takes user input to create an array and performs an in-place right rotation.
 *
 * <p><b>Example:</b>
 * <ul>
 *   <li>Initial Array: [1, 2, 3, 4, 5]</li>
 *   <li>After Right Rotation by 1: [5, 1, 2, 3, 4]</li>
 * </ul>
 *
 * <p><b>Time Complexity:</b> O(n) - where n is the number of elements
 * <p><b>Space Complexity:</b> O(1) - in-place rotation using only one temporary variable
 *
 * @author Adil Lari
 * @version 2.0
 */
package com.learning.arrays.OneDimensionalArrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateBy1Digit {

    /**
     * Main method - Entry point of the program.
     *
     * <p><b>Step-by-Step Logic:</b>
     * <ol>
     *   <li>Create a Scanner object to read user input</li>
     *   <li>Prompt user to enter the array size</li>
     *   <li>Validate that the array size is positive (greater than 0)</li>
     *   <li>Create an integer array of the specified size</li>
     *   <li>Loop through and read each element from the user</li>
     *   <li>Display the initial (unrotated) array</li>
     *   <li>Call rightRotateByOne() method to perform the rotation</li>
     *   <li>Display the rotated array</li>
     *   <li>Close the scanner resource</li>
     * </ol>
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // STEP 1: Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // STEP 2: Prompt user for array size
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // STEP 3: Validate array size
        // Array size must be positive (not zero or negative)
        if (size <= 0) {
            System.out.println("Array size is invalid!!");
            scanner.close();
            return;
        }

        // STEP 4: Declare and initialize array with user-specified size
        int[] inputArray = new int[size]; // Creates array: [0, 0, 0, ..., 0]

        // STEP 5: Read array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            // Display user-friendly prompts (1-indexed for readability)
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        // STEP 6: Display the original array
        System.out.println("Initial Array is: " + Arrays.toString(inputArray));

        // STEP 7: Call the rotation method to rotate the array
        rightRotateByOne(inputArray);

        // STEP 8: Display the rotated array
        System.out.println("Rotated Array is: " + Arrays.toString(inputArray));

        // STEP 9: Close the scanner to free resources
        scanner.close();
    }

    /**
     * Rotates the given integer array to the right by one position (in-place).
     *
     * <p><b>Algorithm Logic:</b>
     * <ol>
     *   <li><b>Input Validation:</b> Check if array is null or empty. If so, print error message and return.</li>
     *   <li><b>Store Last Element:</b> Save the last element in a temporary variable before it gets overwritten.</li>
     *   <li><b>Shift Elements Right:</b> Starting from the end of the array, move each element one position to the right.
     *       Loop from index (length - 1) down to index 1.
     *       For each position i, assign the value of element at index (i-1) to index i.</li>
     *   <li><b>Place First Element:</b> Assign the stored last element to the first position (index 0).</li>
     * </ol>
     *
     * <p><b>Visual Example:</b>
     * <pre>
     * Initial Array:  [1, 2, 3, 4, 5]
     *
     * Step 1: temp = 5 (store last element)
     *         Array: [1, 2, 3, 4, 5]
     *
     * Step 2: Shift elements right (from right to left)
     *         arr[4] = arr[3] → [1, 2, 3, 4, 4]
     *         arr[3] = arr[2] → [1, 2, 3, 3, 4]
     *         arr[2] = arr[1] → [1, 2, 2, 3, 4]
     *         arr[1] = arr[0] → [1, 1, 2, 3, 4]
     *
     * Step 3: Place temp at index 0
     *         arr[0] = temp → [5, 1, 2, 3, 4]
     *
     * Final Array: [5, 1, 2, 3, 4]
     * </pre>
     *
     * <p><b>Why we loop backwards (from end to start)?</b>
     * We must loop from right to left to avoid overwriting elements we haven't processed yet.
     * If we looped forward, we would copy the same element multiple times.
     *
     * @param arr The array to be rotated.
     *            <ul>
     *              <li>If null or empty, error message is printed and method returns without performing rotation.</li>
     *              <li>Modified in-place; no new array is created.</li>
     *            </ul>
     */
    public static void rightRotateByOne(int[] arr) {
        // STEP 1: Validate input array
        // Check if array is null or has no elements
        if (arr == null || arr.length == 0) {
            System.out.println("Array is Empty or null, hence Rotation is not possible!!");
            return;
        }

        // STEP 2: Store the last element
        // This element will become the first element after rotation
        int temp = arr[arr.length - 1];

        // STEP 3: Shift all elements one position to the right
        // Loop backward from the last position to the second position
        // This prevents overwriting values we haven't processed yet
        for (int i = (arr.length - 1); i > 0; i--) {
            // Move element at index (i-1) to index i
            arr[i] = arr[i - 1];
        }

        // STEP 4: Place the saved last element at the beginning
        // This completes the rotation
        arr[0] = temp;
    }
}