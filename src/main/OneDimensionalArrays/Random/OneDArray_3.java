package main.OneDimensionalArrays.Random;

import java.util.ArrayList;

public class OneDArray_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(18);
        arrayList.add(10);
        System.out.println("ArrayList value at index '2': "+arrayList.get(2));
        System.out.println("ArrayList value at index '4': "+arrayList.get(4)); //IndexOutOfBoundsException (Index 4 out of bounds for length 4)
    }
}
