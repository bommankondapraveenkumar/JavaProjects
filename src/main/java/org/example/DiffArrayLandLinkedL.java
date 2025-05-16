package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DiffArrayLandLinkedL {

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<>();

        long start, end;
        arrayList.add(1);
        arrayList.add(2);
        start=System.nanoTime();
        arrayList.add(3);
        end= System.nanoTime();
        System.out.println("difference for arrayList:"+ (end-start));
        arrayList.add(0,99);


        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        start =System.nanoTime();
        linkedList.add(3);
        end =System.nanoTime();
        System.out.println("difference for linkedList:"+ (end-start));

        linkedList.add(0,99);

    }
}
