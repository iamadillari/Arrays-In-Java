package main.OneDimensionalArrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class demonstrates how to right-rotate a one-dimensional
 * integer array by K positions.
 */
public class RightRotateTheArrayByK {

    /**
     * Entry point. Reads array and K from user, performs K right rotations,
     * and prints the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Step 1: Validate size — reject zero or negative values
        if (size <= 0) {
            System.out.println("Array size is invalid!!");
            scanner.close();
            return;
        }

        // Step 2: Read array elements from user
        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        // Step 3: Read K — number of rotations requested
        System.out.print("Enter the number of rotations required: ");
        int rotation = scanner.nextInt();

        System.out.println("Initial Array is: " + Arrays.toString(inputArray));

        // Step 4: Perform K right rotations
        rotateByK(inputArray, rotation);

        System.out.println("Rotated Array is: " + Arrays.toString(inputArray));
        scanner.close();
    }

    /**
     * Rotates the given array to the right by one position.
     * <p>
     * Logic:
     * - Save the last element in a temp variable
     * - Shift all elements one position to the right (from right to left)
     * - Place temp at index 0
     *
     * @param arr The array to rotate in place.
     */
    public static void rightRotateByOne(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null, rotation not possible.");
            return;
        }

        // Step 1: Save last element before it gets overwritten
        int temp = arr[arr.length - 1];

        // Step 2: Shift each element one position to the right
        // Loop runs from last index down to index 1
        // arr[i] = arr[i-1] copies left neighbour into current position
        for (int i = (arr.length - 1); i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3: Place saved element at the front
        arr[0] = temp;
    }

    /**
     * Rotates the given array to the right by K positions.
     * <p>
     * Logic:
     * - Step 1: Handle null/empty array defensively
     * - Step 2: Reduce K using modulo — rotating N times on an array of
     * size N brings it back to its original state, so only
     * (k % length) rotations are actually needed
     * - Step 3: Call rightRotateByOne K times in a loop
     *
     * @param arr The array to rotate in place.
     * @param k   Number of right rotations to perform.
     */
    static void rotateByK(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null, rotation not possible.");
            return;
        }

        // Step 2: Effective rotations — k=7 on size=5 is same as k=2
        k = k % arr.length;

        // Step 3: Rotate one position at a time, k times
        while (k > 0) {
            rightRotateByOne(arr);
            k--;
        }
    }
}
