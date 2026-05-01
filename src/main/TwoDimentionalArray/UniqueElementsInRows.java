package main.TwoDimentionalArray;

import java.util.ArrayList;
import java.util.Arrays;

import static main.OneDimensionalArrays.Easy.UniqueElementsFinder.uniqueElements;

/**
 * This class provides functionality to find unique elements within each row of a 2D ArrayList.
 */
public class UniqueElementsInRows {
    /**
     * The main method serves as the entry point of the program.
     * It initializes a 2D ArrayList with example data, then calls the solve method
     * to find unique elements in each row and prints the result.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();
        twoDArrayList.add(new ArrayList<>(Arrays.asList(12, 2, 3, 3)));
        twoDArrayList.add(new ArrayList<>(Arrays.asList(4, 5, 6, 3, 6)));
        twoDArrayList.add(new ArrayList<>(Arrays.asList(7, 8, 9, 5, 7, 1, 6)));
        System.out.println("Unique Elements in 2D Arraylist: " + solve(twoDArrayList));
    }


    /**
     * Processes a 2D ArrayList to find unique elements in each row.
     * For each row in the input 2D ArrayList, this method applies the uniqueElements
     * function to extract only the elements that appear exactly once in that row.
     *
     * @param A The input 2D ArrayList of integers
     * @return A new 2D ArrayList where each row contains only the unique elements
     * from the corresponding row in the input ArrayList
     */
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // each row of a 2D arraylist is a 1D arraylist
        int row = A.size();
        for (int i = 0; i < row; i++) {
            ArrayList<Integer> rows = A.get(i);
            // Calls uniqueElements method to find unique elements in the current row and adds the result to the 2D result list.
            result.add(uniqueElements(rows));
        }
        return result;
    }

}
