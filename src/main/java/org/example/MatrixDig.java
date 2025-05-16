package org.example;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MatrixDig {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        Integer leftDig=0;
        Integer rightDig=0;
        Integer count=0;
        for(List<Integer> a :arr){
            for(int i=0;i<a.size();i++){
                if(i==count){
                    leftDig+=a.get(i);
                    System.out.println(leftDig);
                }
                if(i==(arr.size()-count)-1){
                    rightDig+=a.get(i);
                    System.out.println(rightDig);
                }
            }
            count++;
        }
        return leftDig-rightDig;

    }
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(6);
        List<List<Integer>> b = new ArrayList<>();
        b.add(a);
        b.add(a);
        b.add(a);
        System.out.println(diagonalDifference(b));

    }

}
