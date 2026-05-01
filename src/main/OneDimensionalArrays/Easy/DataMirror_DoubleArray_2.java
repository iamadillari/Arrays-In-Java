package com.learning.arrays.OneDimensionalArrays.Easy;

import java.util.Arrays;

/*
Task: Write a program that takes an existing 1D array of integers and copies all its elements into a second array of the same size. After copying, multiply each element in the second array by 2 and print both arrays to verify the original remains unchanged.
Sample Input Array: [10, 20, 30, 40, 50]
Expected Output:
Original Array: 10 20 30 40 50
Copied (and Doubled) Array: 20 40 60 80 100
*/

public class DataMirror_DoubleArray_2 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = Arrays.copyOf(a,a.length);
        for (int i = 0; i < b.length; i++) {
            b[i]=b[i]*2;
        }
        System.out.println("Original Array was: "+ Arrays.toString(a));
        System.out.println("Final Doubled Array is: "+ Arrays.toString(b));
    }
}
