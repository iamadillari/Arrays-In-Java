package com.learning.arrays.OneDimensionalArrays.Random;

import java.util.Arrays;

//Printing the elements of the array
public class OneDArray_8 {
    public static void main(String[] args) {
                //index: 0   1   2   3   4
        int[] scores = {85, 90, 78, 92, 88};
        //Printing the array
        //WRONG WAY to print
        // this will never print the array elements,
        // instead it will simply prints the memory address hash of where the array is stored
        System.out.println(scores);

        //RIGHT WAY to print
        //Method-1
        System.out.print("Given initial Array is: ");
        for(int score : scores)
        {
            System.out.print(score+ " ");
        }
        System.out.println();
        //method-2
        System.out.println("Given Initial array is: "+ Arrays.toString(scores));
    }
}
