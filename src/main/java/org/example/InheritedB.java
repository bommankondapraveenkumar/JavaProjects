package org.example;
//
//class InheritedB implements Runnable extends InheritedA  {
//
//    InheritedB() {
//        super();
//        //this();
//       // super.duplicatesHs();
//        System.out.println("system.iueugb,.d");
//    }
//
//    public static void main(String[] args) {
//        InheritedB in = new InheritedB();
//    }
//
//}

import java.util.*;
import java.util.stream.Collectors;

class InheritedB{
    public static void duplicates(){
        int[] arr={2,3,4,5,32,3,4,3,23,4,32,34,32};
        int k=0;
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> values = new HashSet<>();
        for(int a:arr){
            if(!values.add(a)){
                duplicates.add(a);
            }
        }
        duplicates.forEach(System.out::println);
    }
    public static void countDuplicates(){
        int[] arr={2,3,4,5,32,3,4,3,23,4,32,34,32};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println(map);
    }
    public static void countCharacter(){
        String str="hello hello hello ";
        HashMap<Character,Integer> map= new LinkedHashMap<>();
        for(Character c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }

    public static void priorityQue(){
        Integer k=1;
        int[] arr= {3,4,4,1,3,34,4,34,5,43,45,43,45,4,3,45,43,34,5,433,45,43,45};
        PriorityQueue<Integer> pque= new PriorityQueue<>(Collections.reverseOrder());
        for(int a : arr){
            pque.offer(a);
            if(pque.size()>k){
                pque.poll();
            }
        }
        System.out.println(pque.peek());
    }

    public static void streams(){
        int[] arr= {3,4,4,1,3,34,4,34,5,43,45,43,45,4,3,45,43,34,5,433,45,43,45};
        List<Integer> arr1=Arrays.asList(3,4,4,1,3,34,4,34,5,43,45,43,45,4,3,45);
        Set<Integer> dup= new HashSet<>();
        System.out.println(arr1.stream().filter(n->n%2==0).map(n->n*n).map(n->dup.add(n)).collect(Collectors.toList()));

        //List<Integer>a1=()->arr.finalize();
      //  List<Integer> a= (List<Integer>) Arrays.stream(arr).filter(n->n%2==0).map(n->n*2);
        //System.out.println(a);
    }
    public static void main(String[] args){
        streams();
    }
}
