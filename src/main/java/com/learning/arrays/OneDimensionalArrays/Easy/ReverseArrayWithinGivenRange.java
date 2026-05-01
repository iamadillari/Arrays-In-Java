package com.learning.arrays.OneDimensionalArrays.Easy;

import java.util.Arrays;

public class ReverseArrayWithinGivenRange {
    public static void main(String[] args) {
        //index:   0  1  2  3   4  5  6
        int[] A = {12,54,23,14,76,70,25};
        int B = 1;
        int C = 5;
        System.out.println(Arrays.toString(reverseArray(A, B, C)));
    }
    
    public static int[] reverseArray(int[] A, int B, int C) {
        int temp;
        int i = B;
        while (i <= C / 2) {
            temp = A[i];
            A[i] = A[C - i + 1];
            A[C - i + 1] = temp;
            i++;
        }
        return A;
    }
}

