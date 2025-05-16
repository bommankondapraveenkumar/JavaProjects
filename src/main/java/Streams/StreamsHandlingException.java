package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsHandlingException {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "23", "34", "12", "abc", "22");
        List<Integer> a = list.stream().map(n->
                {
                    try {
                        return Integer.parseInt(n);
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                }
        ).collect(Collectors.toList());
        a.forEach(System.out::println);
    }
}
