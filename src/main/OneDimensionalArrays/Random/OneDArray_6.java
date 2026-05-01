package com.learning.arrays.OneDimensionalArrays.Random;

import java.util.ArrayList;
import java.util.Collections;

public class OneDArray_6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(37);
        arrayList.add(5);
        arrayList.add(11);
        arrayList.add(19);
        System.out.println("Initial ArrayList before soring: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Final ArrayList after sorting : " + arrayList);
    }
}
