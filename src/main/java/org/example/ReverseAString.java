package org.example;

import java.util.List;

public class ReverseAString {

    public static void main(String[] args){
        System.out.println(reverseAString("nithya"));
    }
    public static String reverseAString(String s){
        StringBuilder b = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            b.append(s.charAt(i));
        }
        return b.toString();
        //return new StringBuilder(s).reverse().toString();
    }
}

