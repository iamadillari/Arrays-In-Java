package main.OneDimensionalArrays.Random;

//looping through the elements of the array
public class OneDArray_10 {
    public static void main(String[] args) {
                //index: 0   1   2   3   4
        int[] scores = {85, 90, 78, 92, 88};
        //Method-1, using normal for loop
        System.out.println("USING FOR LOOPS: ");
        for (int i = 0; i != scores.length; i++) {
            System.out.println("Element at the index '"+i+"' is-> "+scores[i]);
        }
        //index:      0  1  2  3  4  5
        int[] ages = {28,38,17,39,23,42};
        //method-2, using the enhanced for loop
        System.out.println("USING ENHANCED FOR LOOPS: ");
        for (int age : ages){
            System.out.println(age);
        }
        //method-3 (least used in Arrays, but still valid)
        System.out.println("USING WHILE LOOPS: ");
        //index:      0  1  2  3  4  5
        int[] code = {28,38,17,39,23,42};
        int size=0;
        while (size!=code.length){
            System.out.println(code[size]);
            size++;
        }
    }
}
