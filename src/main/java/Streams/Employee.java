package Streams;

import com.sun.java.browser.plugin2.DOM;

public class Employee {
    String name;
    Double salary;
    String address;

    public Employee(String name,Double salary, String address){
        this.name = name;
        this.address=address;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public Double getSalary(){
        return salary;
    }
}

