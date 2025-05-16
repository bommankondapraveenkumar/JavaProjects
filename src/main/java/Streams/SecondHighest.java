package Streams;

import java.util.*;

public class SecondHighest {
    public static void main(String[] args) {
        // List<Integer,List<Integer>> ex= new ArrayList<>();
        List<Integer> listSalary = Arrays.asList(1, 2, 3, 4, 5, 543, 321, 2, 345, 4, 32, 345, 432);
        System.out.println(listSalary.stream().reduce(0, (a, b) -> a + b));
        System.out.println(listSalary.stream().count());
        System.out.println("max:" + listSalary.stream().max(Integer::compareTo).orElseThrow(NumberFormatException::new));
        listSalary.stream().forEach(System.out::println);
        System.out.println(listSalary.stream().distinct().sorted(Collections.reverseOrder()).limit(5).skip(2).findFirst().get());

        HashMap<Integer, Integer> duplicates = new HashMap<>();
        List<Integer> arr1 = Arrays.asList(1, 3, 5, 44, 43, 23, 45, 43, 55, 456, 543);

        for (Integer a : arr1) {
            duplicates.put(a, duplicates.getOrDefault(a, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> map : duplicates.entrySet()) {
            System.out.println("value :" + map.getKey() + "repeared" + map.getValue() + "times");
        }
    }
}