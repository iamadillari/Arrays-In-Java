package main.OneDimensionalArrays.Random;

import java.util.ArrayList;

public class OneDArray_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(18);
        arrayList.add(10);
        System.out.println("ArrayList Initial value at index '2': "+arrayList.get(2));
        arrayList.set(2,65);
        System.out.println("ArrayList value After setting up new value at index '2': "+arrayList.get(2));
    }
}
