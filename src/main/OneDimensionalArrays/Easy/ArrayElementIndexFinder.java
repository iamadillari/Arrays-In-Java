package main.OneDimensionalArrays.Easy;

public class ArrayElementIndexFinder {
    public static void main(String[] args) {
        // Initialize an example array and the number to search for (B)
        int[] array = {12, 14, 16, -1, 75, 12, 9};
        int B = 12;

        // Print the result of the search: the last index where B appears
        System.out.println("OUTPUT: " + checkGivenNum(array, B));
    }

    /**
     * Returns the last index at which the value B occurs in array A.
     * If B is not present, returns -1.
     *
     * @param A input integer array
     * @param B value to search for
     * @return last occurrence index of B, or -1 if not found
     */
    static int checkGivenNum(int[] A, int B) {
        int lastIdx = -1;                       // Default when B is absent

        // Scan the array from left to right
        for (int i = 0; i < A.length; i++) {
            // Whenever we encounter B, update lastIdx to the current position
            if (A[i] == B) {
                lastIdx = i;
            }
        }
        // After the loop, lastIdx holds the right‑most (last) index of B,
        // or remains -1 if B never appeared
        return lastIdx;
    }
}