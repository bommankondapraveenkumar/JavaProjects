package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 2, 4, 5, 3, 2, 5);
        System.out.println("" + arr.stream().sorted().distinct().collect(Collectors.toList()));
        HashMap<Integer, Integer> arr1 = new HashMap<>();
        HashMap<Integer, Integer> duplicate = new HashMap<>();

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> duplicateHs = new HashSet<>();

        for (Integer a1 : arr) {
            if (!hs.add(a1)) {
                duplicateHs.add(a1);
                System.out.println("hashset" + duplicateHs);
            }
            else{
                System.out.println("hashset" + a1);
            }
        }

        for (Integer a : arr) {
            arr1.put(a, arr1.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : arr1.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("element:" + entry.getKey() + "count:" + entry.getValue());
        }
    }

}
