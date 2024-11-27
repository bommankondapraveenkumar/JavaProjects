package org.example;

import java.util.Arrays;

public class SortingManual {
    public static void main(String[] args) {
        int[] unsortedArray = {1, 4, 1, 1, 2, 3, 13, 24, 14, 3, 21, 23, 4, 2, 3, 4, 2, 11, 34, 1, 3, 45, 6, 78, 7, 65, 43, 2, 3, 45};
        Integer temp1=null;
        Integer count=1;
        while(count>0) {
            count=0;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i + 1] < unsortedArray[i]) {
                    Integer temp = null;
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    count+=1;
                }
            }
        }
        System.out.println(Arrays.stream(unsortedArray).toArray());
    }
}
