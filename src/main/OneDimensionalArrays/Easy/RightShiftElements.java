package main.OneDimensionalArrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftElements {
    public static void main(String[] args) {
        // 1. Create a Scanner to read input from the console.
        Scanner sc = new Scanner(System.in);

        // 2. Prompt the user for the size of the array and read it.
        System.out.print("Enter the number of elements of the arrays: ");
        int N = sc.nextInt();

        // 3. Allocate an integer array of the requested size.
        int[] A = new int[N];

        // 4. Fill the array with values entered by the user.
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        // 5. Show the original (unshifted) array.
        System.out.println("Initial Array: " + Arrays.toString(A));

        // 6. Store the last element temporarily – this value will wrap around
        //    to the first position after the shift.
        int temp = A[A.length - 1];

        // 7. Shift every element one position to the right.
        //    Start from the end of the array and move backwards so that
        //    we don’t overwrite values that we still need to shift.
        for (int i = A.length - 1; i >= 1; i--) {
            A[i] = A[i - 1];
        }

        // 8. Place the saved last element into the first index.
        A[0] = temp;

        // 9. Display the array after the right‑shift operation.
        System.out.println("Right Shifted Array is: " + Arrays.toString(A));
    }
}