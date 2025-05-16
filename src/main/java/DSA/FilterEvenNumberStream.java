package DSA;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEvenNumberStream {
    public static void main(String[] arr) {
        List<Integer> numbers = Arrays.asList(90, 2, 3, 4, 5, 6);
        System.out.println(numbers.stream().filter(n->n%5==0).collect(Collectors.toList()));
        System.out.println(numbers.stream().map(c->Math.cos(c)).collect(Collectors.toList()));
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()));//second highest
        System.out.println(numbers.stream().max(Integer::compareTo).orElse(0));
        System.out.println(numbers.stream().min(Integer::compareTo).orElse(0));
        int min= Collections.min(numbers);
        System.out.println(min);
    }
}
