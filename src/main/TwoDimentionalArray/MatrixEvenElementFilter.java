package main.TwoDimentionalArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A utility class that filters even elements from a 2D matrix.
 * <p>
 * This class demonstrates working with ArrayList-based 2D arrays
 * and extracting elements based on a specific condition (even numbers).
 * </p>
 *
 * @author [Author Name]
 * @version 1.0
 */
public class MatrixEvenElementFilter {

    public static void main(String[] args) {
        // Initialize a 2D ArrayList and insert some random values
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        // Add rows to the matrix
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        matrix.add(row1);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.addAll(Arrays.asList(6, 7, 8, 9, 10));
        matrix.add(row2);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.addAll(Arrays.asList(11, 12, 13, 14, 15));
        matrix.add(row3);
        System.out.println("Initial Arraylist: " + matrix);
        System.out.println("Final Arraylist is: " + evenElements(matrix));
    }

    /**
     * Filters and returns only the even elements from each row of the input matrix.
     * <p>
     * <b>Logic:</b>
     * <ul>
     *   <li>Iterates through each row of the matrix</li>
     *   <li>For each row, checks each element if it's divisible by 2 (even)</li>
     *   <li>Collects all even elements into a new row</li>
     *   <li>Returns a new 2D matrix containing only even numbers</li>
     * </ul>
     * </p>
     *
     * @param mat the input 2D matrix (ArrayList of ArrayLists of Integers)
     * @return a new 2D matrix containing only even elements from each row
     */
    static ArrayList<ArrayList<Integer>> evenElements(ArrayList<ArrayList<Integer>> mat)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < mat.size(); i++) {
            ArrayList<Integer> evenRow = new ArrayList<>();
            for (int j = 0; j < mat.get(0).size(); j++) {
                if(mat.get(i).get(j)%2==0){
                    evenRow.add(mat.get(i).get(j));
                }
            }
            result.add(evenRow);
        }
        return result;
    }
}