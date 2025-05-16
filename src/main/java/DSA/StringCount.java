package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCount {

    private static Object Character;

    public static HashMap<Integer,Integer> charCount(int[] arr) {
//        HashMap<Character,Integer> s= new HashMap<>();
//        for(Character c: str.toCharArray()){
//           s.put(c,s.getOrDefault(c,0)+1);
//        }
//        return s;

        HashMap<Integer,Integer> number = new LinkedHashMap<>();
        for(Integer a:arr){
            number.put(a,number.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:number.entrySet()){
            System.out.println("number : "+entry.getKey()+" repeeated: "+entry.getValue()+" Times");
        }

        return number;
    }
    public static void main(String[] args){
        String str="praveen";
        int[] arr={7,3,3,34,4,4,9,6,234,4,32,34,3,4,32,34,32,34,3,4,32};
        System.out.println(charCount(arr));

        Integer a =1;
        Integer b =2;
        a= a^b;
        b= a^b;
        a= a^b;

        System.out.println(a);
        String str1="praveen";
        char[] c= str1.toCharArray();
        HashMap<Character,Integer> dupcount= new HashMap<>();
        for(char n:c){
            dupcount.put(n,dupcount.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: dupcount.entrySet()){
            System.out.println("character: "+entry.getKey() +" times: "+entry.getValue());
        }
    }
}
