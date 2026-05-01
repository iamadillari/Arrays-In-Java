# Arrays-In-Java

This project is a comprehensive collection of Java programs designed to help in learning and practicing array concepts, from basic to advanced levels. It covers various problems related to one-dimensional and two-dimensional arrays.

## Project Structure

The project is organized into the following main categories:

### One-Dimensional Arrays
This section focuses on problems involving single-dimensional arrays, categorized by difficulty and type.

*   **Easy:** Contains fundamental problems to get started with arrays.

    *   **AllEvenElementsOfArray.java**
        *   **Problem Statement:** Filter integers from a list, specifically isolating even numbers.
        *   **Logic:** The `solve` method iterates through the input `ArrayList<Integer> A`. For each element, it checks if the element is divisible by 2 using the modulo operator (`%`). If `A.get(i) % 2 == 0`, the element is even, and it's added to a new `ArrayList<Integer> al`. Finally, `al` containing only even numbers is returned.
        *   **Sample Input:** `A = [12, 75, 26, 18, 10]`
        *   **Sample Output:** `[12, 26, 18, 10]`

    *   **ArrayElementSearcher.java**
        *   **Problem Statement:** Given an array `A` and an integer `B`. You have to tell whether `B` is present in array `A` or not.
        *   **Logic:** The `checknum` method iterates through the input integer array `a` using an enhanced for-loop. For each element `i` in `a`, it checks if `i` is equal to the target integer `b`. If a match is found, it immediately returns `1`. If the loop completes without finding a match, it means `b` is not present in the array, so it returns `0`.
        *   **Sample Input 1:**
            ```
            Enter the number of elements of the arrays: 5
            1 2 3 4 5
            Enter the number: 3
            ```
        *   **Sample Output 1:** `1`
        *   **Sample Input 2:**
            ```
            Enter the number of elements of the arrays: 5
            1 2 3 4 5
            Enter the number: 6
            ```
        *   **Sample Output 2:** `0`

    *   **ArraySortChecker.java**
        *   **Problem Statement:** Checks if an array is sorted in ascending order.
        *   **Logic:** The `isSorted` method first handles edge cases: an array with 0 or 1 elements is considered sorted, returning `1`. For arrays with more than one element, it iterates from the first element (`i = 0`) up to the second-to-last element (`array.length - 1`). In each iteration, it compares `array[i]` with `array[i+1]`. If `array[i]` is ever greater than `array[i+1]`, it means the array is not sorted in ascending order, and the method immediately returns `0`. If the loop completes without finding any such violation, it means all adjacent pairs are in ascending order, and the method returns `1`.
        *   **Sample Input:**
            ```java
            int[] A = {12,46,31,82,78,1,97,3};
            int[] B = {};
            int[] C = {1,2,3,4,5,6,7,9};
            ```
        *   **Sample Output:**
            ```
            Check Array 'A': 0
            Check Array 'B': 1
            Check Array 'C': 1
            ```

    *   **DataMirror_DoubleArray_1.java**
        *   **Problem Statement:** Write a program that takes an existing 1D array of integers and copies all its elements into a second array of the same size. After copying, multiply each element in the second array by 2 and print both arrays to verify the original remains unchanged.
        *   **Logic:** An integer array `a` is initialized. A new array `b` of the same size is created. The first loop copies elements from `a` to `b`. The second loop iterates through `b` and multiplies each element by 2. Finally, both the original array `a` and the modified array `b` are printed using `Arrays.toString()` to show that `a` remains unchanged.
        *   **Sample Input:** `int[] a = {10, 20, 30, 40, 50};`
        *   **Sample Output:**
            ```
            Original Array was: [10, 20, 30, 40, 50]
            Final Doubled Array is: [20, 40, 60, 80, 100]
            ```

    *   **DataMirror_DoubleArray_2.java**
        *   **Problem Statement:** Write a program that takes an existing 1D array of integers and copies all its elements into a second array of the same size. After copying, multiply each element in the second array by 2 and print both arrays to verify the original remains unchanged. (Alternative implementation using `Arrays.copyOf`)
        *   **Logic:** An integer array `a` is initialized. Instead of a manual loop, `Arrays.copyOf(a, a.length)` is used to create a new array `b` that is a shallow copy of `a`. Then, a loop iterates through `b` and multiplies each element by 2. Finally, both the original array `a` and the modified array `b` are printed using `Arrays.toString()` to demonstrate that `a` remains unchanged.
        *   **Sample Input:** `int[] a = {10, 20, 30, 40, 50};`
        *   **Sample Output:**
            ```
            Original Array was: [10, 20, 30, 40, 50]
            Final Doubled Array is: [20, 40, 60, 80, 100]
            ```

    *   **ElementsHavingGreaterValue.java**
        *   **Problem Statement:** Given an array `A` of `N` integers. Count the number of elements that have at least 1 element greater than itself.
        *   **Logic:** The `solve` method initializes a `count` to 0. It uses nested loops. The outer loop iterates through each element `A[i]` in the array. The inner loop then iterates through the entire array again (from `A[j]`) to find if any element `A[j]` is strictly greater than `A[i]`. If a greater element is found, a `hasGreater` flag is set to `true`, and the inner loop breaks. If `hasGreater` is `true` after the inner loop, `count` is incremented. This approach has a time complexity of O(N^2).
        *   **Sample Input:** `A = {5, 6, 3}`
        *   **Sample Output:** `2` (Elements 5 and 3 have a greater element (6)).

    *   **FrequencyOfNumInArray.java**
        *   **Problem Statement:** Count the frequency of a specific number in an integer array.
        *   **Logic:** The `checkFrequency` method takes an integer array `A` and a target number `n`. It initializes a `count` variable to 0. It then iterates through each element `i` in the array `A` using an enhanced for-loop. If `i` is equal to `n`, the `count` is incremented. After iterating through all elements, the method returns the final `count`, which represents how many times `n` appeared in the array.
        *   **Sample Input 1:**
            ```
            Enter the number of elements of the arrays: 7
            1 2 3 2 4 2 5
            Enter the number for which you wanna check the frequency in the array: 2
            ```
        *   **Sample Output 1:** `Number of Frequency of the number in the Array is: 3`
        *   **Sample Input 2:**
            ```
            Enter the number of elements of the arrays: 5
            10 20 30 40 50
            Enter the number for which you wanna check the frequency in the array: 25
            ```
        *   **Sample Output 2:** `Number of Frequency of the number in the Array is: 0`

    *   **IncrementBy1.java**
        *   **Problem Statement:** Increment every element in an `ArrayList` of integers by one.
        *   **Logic:** The `incrementBy1` method iterates through the input `ArrayList<Integer> A` using a standard for-loop. For each element at index `i`, it retrieves the current value using `A.get(i)`, increments it by 1, and then updates the element at the same index `i` using `A.set(i, (A.get(i) + 1))`. The method modifies the original list in place and returns the same list reference.
        *   **Sample Input:** `A = [12, 75, 26, 18, 10]`
        *   **Sample Output:** `[13, 76, 27, 19, 11]`

    *   **LeftRotateBy1_1.java**
        *   **Problem Statement:** Perform a single-pass left rotation of an integer array by one position.
        *   **Logic:** An integer array `A` is initialized. The first element `A[0]` is stored in a `temp` variable. A loop then shifts all elements from index 1 to `A.length - 1` one position to the left (i.e., `A[i-1] = A[i]`). Finally, the `temp` variable (original first element) is placed at the last position of the array (`A[A.length-1] = temp`).
        *   **Sample Input:** `A = {1, 2, 3, 4, 5, 6, 7}`
        *   **Sample Output:**
            ```
            Initial Array is: [1, 2, 3, 4, 5, 6, 7]
            Rotated Array is: [2, 3, 4, 5, 6, 7, 1]
            ```

    *   **MaxAndMinElements_1.java**
        *   **Problem Statement:** Find and display the minimum and maximum values within a given array of integers.
        *   **Logic:** The `main` method first takes user input to create an integer array `A`. It handles an empty array case. Then, it initializes `max` and `min` with the first element of the array. It iterates through the array starting from the second element (`i = 1`). In each iteration, it compares the current element `A[i]` with `max` and `min`. If `A[i]` is greater than `max`, `max` is updated. If `A[i]` is smaller than `min`, `min` is updated. Finally, the `max` and `min` values are printed. This is a single-pass linear search with O(N) time complexity.
        *   **Sample Input:**
            ```
            Enter the number of elements of the arrays: 5
            Enter the elements of the array:
            10 4 20 1 15
            ```
        *   **Sample Output:**
            ```
            Max element is: 20
            Min element is: 1
            ```

    *   **NaturalNumbers1ToA.java**
        *   **Problem Statement:** Generates sequences of natural numbers from 1 to N using either a standard array or an `ArrayList`.
        *   **Logic (numbersFrom1ToNUsingArray):** This method creates an `int` array of size `A`. It then iterates from `i = 0` to `A-1`, assigning `i + 1` to `array[i]`. This populates the array with natural numbers from 1 to `A`.
        *   **Logic (numbersFrom1ToNUsingArrayList):** This method creates an `ArrayList<Integer>`. It iterates from `i = 1` to `N`, adding each `i` to the `ArrayList`. This populates the `ArrayList` with natural numbers from 1 to `N`.
        *   **Sample Input:**
            ```
            Enter A for ArrayList logic: 5
            Enter A for Array logic: 3
            ```
        *   **Sample Output:**
            ```
            [1, 2, 3, 4, 5]
            [1, 2, 3]
            ```

    *   **PairSumCounter.java**
        *   **Problem Statement:** Count the number of unordered pairs `(i, j)` with `i < j` in an integer array whose sum equals a given number `B`.
        *   **Logic:** The `countPairs` method initializes a `count` to 0. It uses nested loops to consider all possible unordered pairs `(i, j)` where `i < j`. The outer loop iterates from `i = 0` to `arr.length - 1`. The inner loop iterates from `j = i + 1` to `arr.length - 1`. Inside the inner loop, it checks if the sum of `arr[i]` and `arr[j]` is equal to the target sum `B`. If they are equal, `count` is incremented. The method returns the final `count`. This approach has a time complexity of O(N^2).
        *   **Sample Input:**
            ```
            Enter size of array: 5
            Element 1: 1
            Element 2: 2
            Element 3: 3
            Element 4: 4
            Element 5: 5
            Enter a number to check pair counts: 5
            ```
        *   **Sample Output:** `2` (Pairs are (1,4) and (2,3))

    *   **ReverseArrayWithinGivenRange.java**
        *   **Problem Statement:** Reverse a portion of an array within a given range `B` and `C` (inclusive indices).
        *   **Logic:** The `reverseArray` method takes an integer array `A` and two indices `B` (start) and `C` (end). It uses a `while` loop with two pointers, `start = B` and `end = C`. While `start < end`, it swaps `A[start]` and `A[end]` using a temporary variable `temp`. Then, `start` is incremented and `end` is decremented. This continues until the pointers cross or meet, effectively reversing the elements within the specified range.
        *   **Sample Input:** `A = {12, 54, 23, 14, 76, 70, 25}`, `B = 1`, `C = 5` (Indices 1 to 5: {54, 23, 14, 76, 70})
        *   **Sample Output:** `[12, 70, 76, 14, 23, 54, 25]`

    *   **ReverseTheNumArray_1.java**
        *   **Problem Statement:** Reverse the entire one-dimensional integer array.
        *   **Logic:** An integer array `a` is initialized. The program then reverses the array in-place. It uses a `for` loop that iterates from `i = 0` up to `a.length / 2 - 1`. In each iteration, it swaps the element at index `i` with the element at index `a.length - 1 - i` using a temporary variable `temp`. This effectively swaps elements from the beginning with elements from the end until the middle of the array is reached.
        *   **Sample Input:** `a = {-1, 43, 432, 54, 65, 12, 75, 423, 56, 85, 91}`
        *   **Sample Output:**
            ```
            Original Array is: [-1, 43, 432, 54, 65, 12, 75, 423, 56, 85, 91]
            Reversed Array is: [91, 85, 56, 423, 75, 12, 65, 54, 432, 43, -1]
            ```

    *   **RightRotateBy1Digit.java**
        *   **Problem Statement:** Right-rotate a one-dimensional integer array by one position in-place.
        *   **Logic:** The `rightRotateByOne` method first handles null or empty arrays. It then stores the last element of the array in a temporary variable `temp`. It then iterates backward from the second-to-last element (`arr.length - 1`) down to the second element (`i > 0`). In each iteration, it shifts the element at `arr[i-1]` to `arr[i]`. Finally, the stored `temp` element is placed at the first position (`arr[0]`). This ensures an in-place rotation with O(N) time complexity and O(1) space complexity.
        *   **Sample Input:**
            ```
            Enter the number of elements in the array: 5
            Enter the elements of the array:
            Element 1: 1
            Element 2: 2
            Element 3: 3
            Element 4: 4
            Element 5: 5
            ```
        *   **Sample Output:**
            ```
            Initial Array is: [1, 2, 3, 4, 5]
            Rotated Array is: [5, 1, 2, 3, 4]
            ```

    *   **RightRotateTheArrayByK.java**
        *   **Problem Statement:** Right-rotate a one-dimensional integer array by `K` positions.
        *   **Logic:** The `rotateByK` method first handles null or empty arrays. It then calculates the effective number of rotations by taking `k = k % arr.length`. This is because rotating an array `N` times (where `N` is the array length) brings it back to its original state. Then, it enters a `while` loop that calls the `rightRotateByOne` method (which performs a single right rotation) `k` times.
        *   **Sample Input:**
            ```
            Enter the number of elements in the array: 5
            Enter the elements of the array:
            Element 1: 1
            Element 2: 2
            Element 3: 3
            Element 4: 4
            Element 5: 5
            Enter the number of rotations required: 2
            ```
        *   **Sample Output:**
            ```
            Initial Array is: [1, 2, 3, 4, 5]
            Rotated Array is: [4, 5, 1, 2, 3]
            ```

    *   **RightShiftElements.java**
        *   **Problem Statement:** Right-shift all elements of an array by one position, moving the last element to the first position.
        *   **Logic:** An integer array `A` is initialized. The last element `A[A.length-1]` is stored in a temporary variable `temp`. A `for` loop iterates backward from the last index (`A.length-1`) down to the second index (`i >= 1`). In each iteration, `A[i]` is assigned the value of `A[i-1]`, effectively shifting elements to the right. Finally, the `temp` variable (original last element) is placed at the first position (`A[0] = temp`).
        *   **Sample Input:**
            ```
            Enter the number of elements of the arrays: 5
            1 2 3 4 5
            ```
        *   **Sample Output:**
            ```
            Initial Array: [1, 2, 3, 4, 5]
            Right Shifted Array is: [5, 1, 2, 3, 4]
            ```

    *   **UniqueElementsFinder.java**
        *   **Problem Statement:** Find and return the unique elements from an `ArrayList` of integers. An element is considered unique if it appears only once in the list.
        *   **Logic:** The `uniqueElements` method takes an `ArrayList<Integer> list`. It initializes a new `ArrayList<Integer> result`. It then iterates through the input `list` using an outer `for` loop. For each `currentElement`, an inner `for` loop counts its `freq`uency in the entire `list`. If `freq` is exactly 1 (meaning the element is unique), `currentElement` is added to the `result` list. Finally, the `result` list containing only unique elements is returned. This approach has a time complexity of O(N^2).
        *   **Sample Input:**
            ```
            Enter the number of elements: 7
            Enter 7 elements:
            1 2 3 2 4 2 5
            ```
        *   **Sample Output:**
            ```
            Given Array: [1, 2, 3, 2, 4, 2, 5]
            Unique Array is: [1, 3, 4, 5]
            ```

*   **Advance:** (Currently empty, ready for advanced one-dimensional array problems)

*   **Medium:** (Currently empty, ready for intermediate one-dimensional array problems)

*   **Random:** Contains a variety of one-dimensional array problems for general practice, such as:
    *   `OneDArray_10.java`
    *   `OneDArray_2.java`
    *   `OneDArray_3.java`
    *   `OneDArray_4.java`
    *   `OneDArray_5.java`
    *   `OneDArray_6.java`
    *   `OneDArray_7.java`
    *   `OneDArray_8.java`
    *   `OneDArray_9.java`
    *   `OneDimensionalArrays_1.java`

*   **Revisit:** (Currently empty, for problems that require revisiting or further practice)

### Two-Dimensional Arrays
This section covers problems related to multi-dimensional arrays (matrices).

*   **CheckIdentityMatrix.java**
    *   **Problem Statement:** Check if a given 2D matrix is an identity matrix. An identity matrix is a square matrix where all diagonal elements are 1 and all off-diagonal elements are 0.
    *   **Logic:** The `checkIdentityMatrixOrNot` method iterates through each element of the 2D array `A` using nested `for` loops. For each element at `(i, j)`:
        *   If `i == j` (it's a diagonal element), it checks if `A[i][j]` is `1`. If not, it returns `0` (not an identity matrix).
        *   If `i != j` (it's an off-diagonal element), it checks if `A[i][j]` is `0`. If not, it returns `0` (not an identity matrix).
        If the loops complete without returning `0`, it means all conditions for an identity matrix are met, so it returns `1`.
    *   **Sample Input 1:**
        ```java
        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        };
        ```
    *   **Sample Output 1:** `Check: 0` (because `matrix[1][2]` is 1, not 0)
    *   **Sample Input 2 (Identity Matrix):**
        ```java
        int[][] matrix = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        ```
    *   **Sample Output 2 (Identity Matrix):** `Check: 1`

*   **MatrixColumnSum.java**
    *   **Problem Statement:** Given a 2D Array `A[][]`, return the sum of every column in an array.
    *   **Logic:** The `computeColumnSums` method takes a 2D integer `matrix`. It determines the number of columns from `matrix[0].length`. It then initializes an `int` array `columnSums` of this size, with all elements set to 0. It uses nested loops: the outer loop iterates through each `col` from `0` to `columns - 1`, and the inner loop iterates through each `row` from `0` to `matrix.length - 1`. In the inner loop, it adds `matrix[row][col]` to `columnSums[col]`. Finally, it returns the `columnSums` array.
    *   **Sample Input:**
        ```java
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ```
    *   **Sample Output:** `Array is: [28, 32, 36, 40]`

*   **MatrixEvenElementFilter.java**
    *   **Problem Statement:** Filter and return only the even elements from each row of the input 2D matrix.
    *   **Logic:** The `evenElements` method takes a 2D `ArrayList<ArrayList<Integer>> mat`. It initializes a new 2D `ArrayList<ArrayList<Integer>> result`. It then iterates through each row of the input `mat` using an outer `for` loop. For each row, it creates a new `ArrayList<Integer> evenRow`. An inner `for` loop iterates through the elements of the current row. If an element `mat.get(i).get(j)` is even (`% 2 == 0`), it's added to `evenRow`. After processing all elements in a row, `evenRow` is added to the `result` 2D `ArrayList`. Finally, the `result` 2D `ArrayList` containing only even numbers from each row is returned.
    *   **Sample Input:**
        ```java
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10)));
        matrix.add(new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15)));
        ```
    *   **Sample Output:**
        ```
        Initial Arraylist: [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]
        Final Arraylist is: [[2, 4], [6, 8, 10], [12, 14]]
        ```

*   **MatrixRowMaxFinder.java**
    *   **Problem Statement:** Find the maximum element in a specific row of a 2D matrix.
    *   **Logic:** The `findRowMaximum` method takes a 2D `ArrayList<ArrayList<Integer>> matrix` and a `rowIndex`. It initializes a variable `max` with the first element of the specified row (`matrix.get(rowIndex).get(0)`). It then iterates through the remaining elements of that row (starting from index 1). In each iteration, it compares the current element `matrix.get(rowIndex).get(i)` with `max`. If the current element is greater, `max` is updated. After checking all elements in the row, the final `max` value is returned.
    *   **Sample Input:**
        ```java
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10)));
        matrix.add(new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15)));
        // Calling findRowMaximum for row index 2
        ```
    *   **Sample Output:**
        ```
        Given Arraylist is: [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]
        Maximum element is: 15
        ```

*   **MatrixRowPrinter.java**
    *   **Problem Statement:** Create and display a two-dimensional matrix by prompting the user for dimensions and elements, then print the matrix row by row.
    *   **Logic:** The `main` method uses a `Scanner` to get the number of rows (`N`) and columns (`M`) from the user. It then creates an `N x M` integer matrix. Nested `for` loops are used to prompt the user to enter each element and populate the matrix. Another set of nested `for` loops is used to iterate through the matrix and print each element, followed by a newline character after each row to display it row by row.
    *   **Sample Input:**
        ```
        Enter number of rows (N): 2
        Enter number of columns (M): 3
        Enter the elements of the matrix:
        Enter element at position [0][0]: 1
        Enter element at position [0][1]: 2
        Enter element at position [0][2]: 3
        Enter element at position [1][0]: 4
        Enter element at position [1][1]: 5
        Enter element at position [1][2]: 6
        ```
    *   **Sample Output:**
        ```
        The matrix you entered is:
        1 2 3 
        4 5 6 
        ```

*   **MatrixRowSumCalculator.java**
    *   **Problem Statement:** Calculate the sum of elements in a specific row of a 2D matrix.
    *   **Logic:** The `calculateRowSum` method takes a 2D `ArrayList<ArrayList<Integer>> matrix` and a `rowIndex`. It initializes a `sum` variable to 0. It then iterates through the elements of the specified row (`matrix.get(rowIndex)`) using a `for` loop. In each iteration, it adds the current element `matrix.get(rowIndex).get(i)` to `sum`. Finally, it returns the total `sum` of the elements in that row.
    *   **Sample Input:**
        ```java
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10)));
        matrix.add(new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15)));
        // Calling calculateRowSum for row index 2
        ```
    *   **Sample Output:**
        ```
        Given Arraylist is: [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]
        Sum of given row num is: 65
        ```

*   **TransaposeSquareMatrix.java**
    *   **Problem Statement:** Calculate the transpose of a square matrix in-place.
    *   **Logic:** The `squareTransposeMatrix` method takes a square 2D integer array `A`. It iterates through the matrix using nested `for` loops. The outer loop iterates for rows `r` from `0` to `A.length - 1`. The inner loop iterates for columns `c` from `0` to `A[r].length - 1`. To perform an in-place transpose, it's crucial to swap elements only once. This is achieved by swapping `A[r][c]` with `A[c][r]` only when `r < c`. This ensures that elements are swapped across the main diagonal without being swapped back.
    *   **Sample Input:**
        ```java
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ```
    *   **Sample Output:**
        ```
        Given Matrix:
        [1, 2, 3] 
        [4, 5, 6] 
        [7, 8, 9] 
        Transpose Matrix:
        [1, 4, 7] 
        [2, 5, 8] 
        [3, 6, 9] 
        ```

*   **TransposeOfRectangularMatrix.java**
    *   **Problem Statement:** Calculate the transpose of a given rectangular matrix. The transpose of a matrix is obtained by changing rows to columns and columns to rows.
    *   **Logic:** The `transposeOfMatrix` method takes a 2D integer array `A`. It first determines the dimensions of the transposed matrix: the number of rows in the original matrix becomes the number of columns in the transpose, and the number of columns in the original becomes the number of rows in the transpose. It creates a new 2D integer array `transpose` with these swapped dimensions (`A[0].length` rows and `A.length` columns). It then uses nested `for` loops to iterate through the original matrix. For each element `A[r][c]`, it assigns this value to `transpose[c][r]`. Finally, it returns the `transpose` matrix.
    *   **Sample Input:**
        ```java
        int[][] matrix = {
                {1, 2, 3, 6},
                {4, 5, 6, -1},
                {7, 8, 9, 5}
        };
        ```
    *   **Sample Output:**
        ```
        Given Matrix:
        [1, 2, 3, 6] 
        [4, 5, 6, -1] 
        [7, 8, 9, 5] 
        Transpose Of the Matrix:
        [1, 4, 7] 
        [2, 5, 8] 
        [3, 6, 9] 
        [6, -1, 5] 
        ```

*   **UniqueElementsInRows.java**
    *   **Problem Statement:** Find unique elements within each row of a 2D `ArrayList`.
    *   **Logic:** The `solve` method takes a 2D `ArrayList<ArrayList<Integer>> A`. It initializes a new 2D `ArrayList<ArrayList<Integer>> result`. It then iterates through each row of the input `A`. For each row (which is itself a 1D `ArrayList<Integer>`), it calls the `uniqueElements` method from `UniqueElementsFinder.java` (which is imported statically) to get the unique elements of that specific row. The returned `ArrayList` of unique elements for the current row is then added to the `result` 2D `ArrayList`. Finally, the `result` 2D `ArrayList` containing unique elements from each row is returned.
    *   **Sample Input:**
        ```java
        ArrayList<ArrayList<Integer>> twoDArrayList = new ArrayList<>();
        twoDArrayList.add(new ArrayList<>(Arrays.asList(12, 2, 3, 3)));
        twoDArrayList.add(new ArrayList<>(Arrays.asList(4, 5, 6, 3, 6)));
        twoDArrayList.add(new ArrayList<>(Arrays.asList(7, 8, 9, 5, 7, 1, 6)));
        ```
    *   **Sample Output:** `Unique Elements in 2D Arraylist: [[12, 2], [4, 5, 3], [8, 9, 1, 6]]`

*   **WaveFormatPrinting.java**
    *   **Problem Statement:** Print matrix elements in a wave-like pattern (column-wise traversal, alternating direction for each column).
    *   **Logic:** (The provided file `WaveFormatPrinting.java` currently only initializes a matrix and has commented-out lines. The actual implementation for wave format printing is missing. A typical logic for column-wise wave printing involves iterating through columns. For even-indexed columns, iterate rows from top to bottom. For odd-indexed columns, iterate rows from bottom to top.)
    *   **Conceptual Input:**
        ```java
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ```
    *   **Conceptual Output (Column-wise wave):** `1 5 9 13 14 10 6 2 3 7 11 15 16 12 8 4`

## Getting Started

To compile and run the programs:

1.  Clone the repository:
    ```bash
    git clone https://github.com/your-username/Arrays-In-Java.git
    ```
2.  Navigate to the project directory:
    ```bash
    cd Arrays-In-Java
    ```
3.  Compile a specific Java file (e.g., `AllEvenElementsOfArray.java`):
    ```bash
    javac src/main/OneDimensionalArrays/Easy/AllEvenElementsOfArray.java
    ```
4.  Run the compiled class:
    ```bash
    java -cp src/main/OneDimensionalArrays/Easy AllEvenElementsOfArray
    ```

Alternatively, if using Maven:

1.  Build the project:
    ```bash
    mvn clean install
    ```
2.  Run specific classes (if configured in `pom.xml` or using an IDE).

## Contributing

Feel free to contribute by adding new problems, improving existing solutions, or enhancing the documentation. Please follow standard pull request guidelines.

## License

This project is open-source and available under the [MIT License](LICENSE).
