package main.OneDimensionalArrays.Easy;

import java.util.Scanner;


/*
Problem Description:

You are given array A and an integer B. You have to tell whether B is present in array A or not.

Problem Constraints:

1 <= |A| <= 105
1 <= A[i], B <= 109

Input Format:

Function template consists of two arguments:

1. An array of integers A.
2. An integer B


Output Format:
Return 1 if the element exists, else return 0.

*/

public class ArrayElementSearcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the arrays: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int B = sc.nextInt();
        System.out.println(checknum(A, B));
    }

    static int checknum(int[] a, int b) {
        for (int i : a) {
            if (i == b) {
                return 1;
            }
        }
        return 0;
    }
}
