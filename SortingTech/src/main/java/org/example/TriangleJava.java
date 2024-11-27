package org.example;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TriangleJava {
    public static final Logger loggerFactory = LogManager.getLogManager().getLogger("TriangleJava");
    public static void main(String[] args) {
        int rows = 5;
        String str="abcd";
        for(int i = 1; i <= rows; ++i)  {
//            loggerFactory.info("hello");
            System.out.println("Hello Java");
        }
    }
}
