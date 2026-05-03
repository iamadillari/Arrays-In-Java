package main.OneDimensionalArrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the arrays: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Initial Array: " + Arrays.toString(A));
        int temp = A[A.length-1];
        for (int i = A.length-1; i>=1 ; i--) {
            A[i]=A[i-1];
        }
        A[0]=temp;
        System.out.println("Right Shifted Array is: " + Arrays.toString(A));
    }
}
