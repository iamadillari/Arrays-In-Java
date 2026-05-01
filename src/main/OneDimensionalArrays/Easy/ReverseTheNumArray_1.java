package main.OneDimensionalArrays.Easy;

import java.util.Arrays;

public class ReverseTheNumArray_1 {
    public static void main(String[] args) {
        int[] a = {-1,43,432,54,65,12,75,423,56,85,91};
        //now reverse the above array
        int temp;
        System.out.println("Original Array is: "+ Arrays.toString(a));
        for (int i = 0; i < a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        System.out.println("Reversed Array is: "+ Arrays.toString(a));
    }
}
