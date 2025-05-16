package org.example;

import java.util.Arrays;
import java.util.List;

public class Largest {
    public static void main(String[] args){
        List<Integer> arr= Arrays.asList(2,3,4,5,3,5,3,2,4,6,4);
        int largest=0;
        for(int i=0;i<arr.size();i++){
            if(largest< arr.get(i)){
                largest=arr.get(i);
            }
        }

        System.out.println(largest);
    }

}
