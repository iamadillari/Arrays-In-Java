package com.learning.arrays.OneDimensionalArrays.Easy;

             import java.util.ArrayList;
             import java.util.Arrays;
             import java.util.Scanner;

             /**
              * Generates sequences of natural numbers from 1 to N using either
              * a standard array or an ArrayList.
              */
             public class NaturalNumbers1ToA {

                 /**
                  * Generates an array containing natural numbers from 1 to A.
                  *
                  * @param A the upper bound (inclusive) of natural numbers to generate
                  * @return an int array with values [1, 2, ..., A]
                  */
                 public static int[] numbersFrom1ToNUsingArray(int A) {
                     int[] array = new int[A];
                     for (int i = 0; i < A; i++) {
                         array[i] = i + 1;
                     }
                     return array;
                 }

                 /**
                  * Generates an ArrayList containing natural numbers from 1 to N.
                  *
                  * @param N the upper bound (inclusive) of natural numbers to generate
                  * @return an ArrayList with values [1, 2, ..., N]
                  */
                 public static ArrayList<Integer> numbersFrom1ToNUsingArrayList(int N) {
                     ArrayList<Integer> arrayList = new ArrayList<>();
                     for (int i = 1; i <= N; i++) {
                         arrayList.add(i);
                     }
                     return arrayList;
                 }

                 /**
                  * Main method that demonstrates both array and ArrayList approaches.
                  *
                  * @param args command-line arguments (not used)
                  */
                 public static void main(String[] args) {
                     try (Scanner scanner = new Scanner(System.in)) {
                         System.out.print("Enter A for ArrayList logic: ");
                         int numberForArrayList = scanner.nextInt();
                         if (numberForArrayList > 0) {
                             System.out.println(numbersFrom1ToNUsingArrayList(numberForArrayList));
                         } else {
                             System.out.println("Invalid input! Enter a positive number.");
                         }

                         System.out.print("Enter A for Array logic: ");
                         int numberForArray = scanner.nextInt();
                         if (numberForArray > 0) {
                             System.out.println(Arrays.toString(numbersFrom1ToNUsingArray(numberForArray)));
                         } else {
                             System.out.println("Invalid input! Enter a positive number.");
                         }
                     }
                 }
             }