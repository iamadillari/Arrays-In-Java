package main.OneDimensionalArrays.Random;

public class OneDimensionalArrays_1 {
    public static void main(String[] args) {
        //syntax of creating an array
        int[] a = {1,2,3,4,5};
        int[] b = new int[5];
        //or, int a[] = {1,2,3,4,5};
        System.out.println(b[3]);

        //below one will give compilation error.
        /* Syntax Error: You cannot specify the size of an array within the type declaration
        on the left side.
        The compiler expects to see the type (what it is) and the name, but not the size.
        No Memory Allocation: Even if it were valid syntax,
        this line would only "declare" a variable; it wouldn't actually create
        the space in memory for those 10 integers.
        */
        //int[10] num;
        int[] numbers = new int[10];
        char[] chars = new char[5];
        System.out.println("Default value of the char is: "+chars[3]);
        int[] num = new int[10];
        System.out.println("Default value of the int is: "+num[2]);

    }
}
