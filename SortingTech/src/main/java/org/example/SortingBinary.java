package org.example;

import java.util.ArrayList;

public class SortingBinary {
    public static void main(String[] args) {
        int[] unsortedArray = {0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0};
        ArrayList<Integer> zeroSorting = new ArrayList<>();
        ArrayList<Integer> oneSorting = new ArrayList<>();
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < unsortedArray.length; i++) {
            if (unsortedArray[i] == 0) {
                zeroSorting.add(unsortedArray[i]);
            } else {
                oneSorting.add(unsortedArray[i]);
            }
        }
        sortedArray.addAll(zeroSorting);
        sortedArray.addAll(oneSorting);
        System.out.println(sortedArray);
    }
}
