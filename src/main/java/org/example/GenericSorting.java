package org.example;

import com.sun.media.sound.SF2Layer;
import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericSorting {

    public static void main(String[] args) {
        int[] sortedArray = {0, 2, 12, 1, 5, 1, 6, 1, 44, 2, 52, 1, 5, 1, 54, 515, 45, 15, 46, 5, 546, 5, 561, 51, 564, 6, 0, 2};
        ArrayList<Integer> A3 = new ArrayList<>();
        ArrayList<Integer> A4 = new ArrayList<>();
        Integer A1 = null;
        Integer A2 = null;
        int[] unsortedArray={};
        unsortedArray= Arrays.stream(sortedArray).sorted().toArray();
        for (int i = 0; i < unsortedArray.length; i++) {
            A1 = unsortedArray[i];
            if (!A3.contains(A1)) {
                for (int j = 0; j < unsortedArray.length; j++) {
                    if (A1.equals(unsortedArray[j])) {
                        A3.add(unsortedArray[j]);
                    }
                }
            }
        }
        System.out.println("Sorted array length::" + A3.size());
        System.out.println("unsorted array length:" + unsortedArray.length);
        System.out.println(A3);
    }
}
