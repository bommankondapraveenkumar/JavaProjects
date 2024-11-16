package org.example;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

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
