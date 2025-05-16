package DSA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DuplicacatesUsingHashset {

    public static void main(String[] args){
        int[] arr={3,3,3,345,9,4,3,2,34,5,3,3,45,43,45,4,3,4};
        System.out.println(duplicates(arr));
    }
    public static HashSet<Integer> duplicates(int[] arr){
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(Integer in : arr){
            if(!a.add(in)){
                duplicates.add(in);
            }
        }

        int[] arrr1= {1,2,4,5,3,2,34,3,2,345};
        Set<Integer> duplicates2 = new HashSet<>();
        Set<Integer> seen = new HashSet<>();


        for(Integer a1:arrr1){
                if(!seen.add(a1)){
                    duplicates.add(a1);
                }
        }
        seen.forEach(System.out::println);
       // duplicates.forEach(System.out::println);

        return new HashSet<>(duplicates);
    }






}
