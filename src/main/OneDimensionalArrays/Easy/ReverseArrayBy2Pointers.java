package main.OneDimensionalArrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayBy2Pointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Given Array is: "+ Arrays.toString(A));
        System.out.println("Revered Array is: "+Arrays.toString(reversedArray(A)));
    }
    static int[] reversedArray(int[] arr){
        //here we are going to use 2 pointers array concept for reversing the array
        // Initialize two pointers: 'left' at the beginning and 'right' at the end of the array.
        int left = 0;
        int right = arr.length-1;
        // Loop while the 'left' pointer is less than the 'right' pointer.
        while (left<right)
        {
            // Store the element at the 'left' pointer in a temporary variable.
            int temp = arr[left];
            // Replace the element at the 'left' pointer with the element at the 'right' pointer.
            arr[left] = arr[right];
            // Replace the element at the 'right' pointer with the element stored in the temporary variable (original left element).
            arr[right] = temp;
            // Move the 'left' pointer one step to the right.
            left++;
            // Move the 'right' pointer one step to the left.
            right--;
        }
        return arr;
    }
}
