package main.OneDimensionalArrays.Random;

import java.util.Arrays;

//Modifying the elements of the array
public class OneDArray_9 {
    public static void main(String[] args) {
                //index: 0   1   2   3   4
        int[] scores = {85, 90, 78, 92, 88};
        System.out.println("Initial Array is: "+Arrays.toString(scores));
        scores[2]=84;
        scores[4]=93;
        //Print the modified array
        System.out.println("Modified Array is: "+Arrays.toString(scores));
    }
}
