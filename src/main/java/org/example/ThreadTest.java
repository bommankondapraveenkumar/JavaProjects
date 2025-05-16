package org.example;

import java.util.Map;
import java.util.TreeMap;

public class ThreadTest extends Thread {
    @Override
    public void run(){
        System.out.println("thread is running");
        System.out.println(anuything());
    }

    public static void main(String[] args){
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        Runnable r = ()-> System.out.println("its running");
        Thread th=new Thread(r);
        th.start();
    }

    public static Object anuything(){
        Map<Integer,String> map= new TreeMap<>();
        map.put(2,"a");
        map.put(5,"b");
        map.put(1,"e");
        map.put(2,"g");
        System.out.println(map);
        return "runnig";
    }
}
