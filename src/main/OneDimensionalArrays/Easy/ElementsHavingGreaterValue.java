package main.OneDimensionalArrays.Easy;

/**
 * Given an array A of N integers.
 * Count the number of elements that have at least 1 elements greater than itself.
 */
public class ElementsHavingGreaterValue {
    public static void main(String[] args) {
        int[] A = {5,6,3};
        System.out.println(solve(A));
    }

    /**
     * Counts the number of elements that have at least one element greater than themselves.
     *
     * Approach:
     * 1. Initialize count to track elements with greater elements
     * 2. Iterate through each element in the array
     * 3. For each element, check if there exists any element greater than it
     * 4. If found, increment the count
     *
     * Time Complexity: O(N^2) where N is the length of the array
     * Space Complexity: O(1)
     *
     * @param A the input array of integers
     * @return the count of elements that have at least one element greater than themselves
     */
    public static int solve(int[] A) {
        // Step 1: Initialize count to track elements with greater elements
        int count = 0;

        // Step 2: Iterate through each element in the array
        for (int i = 0; i < A.length; i++) {
            // Step 3: Assume current element doesn't have a greater element
            boolean hasGreater = false;

            // Step 4: Check all elements to see if any is greater than current element
            for (int j = 0; j < A.length; j++) {
                if (A[j] > A[i]) {
                    hasGreater = true;
                    break; // Found one greater element, no need to check further
                }
            }

            // Step 5: If we found a greater element, increment count
            if (hasGreater) {
                count++;
            }
        }

        // Step 6: Return the final count
        return count;
    }
}