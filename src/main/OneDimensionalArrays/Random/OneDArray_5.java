package com.learning.arrays.OneDimensionalArrays.Random;

import java.util.ArrayList;

public class OneDArray_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(18);
        arrayList.add(10);
        System.out.println("Initial ArrayList : "+arrayList);
        arrayList.remove(2);
        System.out.println("Final ArrayList : "+arrayList);
    }
}
