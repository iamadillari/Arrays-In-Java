package main.TwoDimentionalArray;

import java.util.Scanner;

/**
 * MatrixRowPrinter is a utility class that allows users to create and display
 * a two-dimensional matrix. It prompts the user to input the dimensions and
 * elements of the matrix, then prints the matrix row by row.
 */
public class MatrixRowPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read N and M
        System.out.print("Enter number of rows (N): ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns (M): ");
        int columns = scanner.nextInt();

        //Create the matrix and fill it with input values
        int[][] matrix = new int[rows][columns];

        //Fill the matrix with user input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {           // Loop through each row
            for (int j = 0; j < columns; j++) {    // Loop through each column in the current row
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        //Print the matrix row by row
        System.out.println("\nThe matrix you entered is:");
        for (int i = 0; i < rows; i++) {           // Loop through each row
            for (int j = 0; j < columns; j++) {    // Loop through each column in the current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}