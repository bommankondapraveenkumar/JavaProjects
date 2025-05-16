package DSA;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Collectors;

public class ReverseAStringStream {
    public static void main(String [] args){
      List<String> str= Arrays.asList("d","a","b","c");
     System.out.println(str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
     List<Integer> ints=Arrays.asList(1,2,4,55,2,1,234,3,21,2,3,21,23,4);
     int[] aa= {13,45,5,5};
     int max= ints.stream().max(Integer::compare).orElseThrow(null);
     int min= ints.stream().min(Long::compare).orElseThrow(null);
     System.out.println(max);
     System.out.println(min);
     List<Integer> a1= Arrays.asList(1,2,4,4,2,8,34,5,42,345,6,54,5);
     int b1=a1.stream().filter(n->n%2==0).map(n->n*n).reduce(10,Integer::sum);
        System.out.println(b1);
        String str1= "praveen";
        String str2="";
       char[] aaa= str1.toCharArray();
        HashMap<Character,Integer> has=new HashMap<>();

       for(char a:aaa){
           has.put(a,has.getOrDefault(a,0)+1);
       }
       for(Map.Entry<Character, Integer> entry: has.entrySet()){
           System.out.println((entry.getKey()+"printing numbers and counts"+entry.getValue()));
       }
        System.out.println(has);
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        System.out.println(str2);
    }

}
