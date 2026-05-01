package main.OneDimensionalArrays.Easy;

public class ArraySortChecker {
    public static void main(String[] args) {
        int[] A = {12,46,31,82,78,1,97,3};
        int[] B = {};
        int[] C = {1,2,3,4,5,6,7,9};
        System.out.println("Check Array 'A': "+isSorted(A)); //0, since it's not sorted
        System.out.println("Check Array 'B': "+isSorted(B)); //1, since empty array
        System.out.println("Check Array 'C': "+isSorted(C)); //1, since it's sorted
    }

    /**
     * Checks if an array is sorted in ascending order
     *
     * @param array the input array to check
     * @return 1 if the array is sorted or empty, 0 otherwise
     */
    public static int isSorted(int[] array){
        // An array with 0 or 1 elements is considered sorted
        if(array.length<=1){
            return 1;
        }

        // Check each adjacent pair of elements
        // If any element is greater than the next one, the array is not sorted
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]){
                return 0;
            }
        }

        // If we've checked all pairs and found no violations, the array is sorted
        return 1;
    }
}