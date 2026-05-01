package com.learning.arrays.OneDimensionalArrays.Random;

public class OneDArray_7 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88};
        //to access the elements from the index position
        System.out.println("Element at 0th index: " + scores[0]);//85
        System.out.println("Element at 3rd index: " + scores[3]);//92
        System.out.println("Element at 2nd index: " + scores[2]);//78
        //to check the length of the array
        System.out.println("Length of the array is: " + scores.length);//5
        System.out.println("Element at last index: " + scores[scores.length - 1]);//88
    }
}
