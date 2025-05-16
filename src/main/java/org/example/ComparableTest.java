package org.example;

import java.util.ArrayList;
import java.util.List;

class ComparableTest implements Comparable<ComparableTest> {
    int id;
    String name;
    int marks;

    ComparableTest(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(ComparableTest other) {
        return other.marks - this.marks; // Descending order
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }


    //without using collections manually checking each
    public static void bubbleSortDescending(List<ComparableTest> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {  
                    // swap if current < next (for descending)
                    ComparableTest temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<ComparableTest> employees = new ArrayList<>();
        employees.add(new ComparableTest(3, "Alice", 35));
        employees.add(new ComparableTest(1, "Bob", 65));
        employees.add(new ComparableTest(2, "Charlie", 87));

        bubbleSortDescending(employees);

        System.out.println(employees);
        // Output: [2 Charlie 87, 1 Bob 65, 3 Alice 35]
    }
}
