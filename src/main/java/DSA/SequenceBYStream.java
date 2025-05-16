package DSA;

import java.util.Map;
import java.util.stream.Collectors;

public class SequenceBYStream {
    public static void main(String[] args){
        String str= "there are many strings";
        Map<Character,Long> s= str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(s);
    }
}