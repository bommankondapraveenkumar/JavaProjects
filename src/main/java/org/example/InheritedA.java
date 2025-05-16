package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class InheritedA{
    InheritedA(){
        System.out.println("its a constructor");
    }
    void duplicatesHs() {

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> dupilcates = new HashSet<>();

        List<Integer> arrList = Arrays.asList(2, 4, 6, 7, 65, 43, 6, 456, 78, 7, 65, 43, 6);
        for (Integer a : arrList) {
            if (!hs.add(a)) {
                dupilcates.add(a);
            }
        }
        System.out.println("duplicates using hashset::" + dupilcates);
    }

}
