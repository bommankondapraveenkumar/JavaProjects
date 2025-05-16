package comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
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

    /*@Override
    public int compareTo(ComparableTest other) {
        return  this.name.compareTo(other.name);  // Sort by ID (Ascending)
    }*/

    @Override
    public int compareTo(ComparableTest other) {
        return  other.marks - this.marks;  // Sort by ID (Ascending)
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
    public static void main(String[] args) {
       List<ComparableTest> employees = new ArrayList<>();
       employees.add(new ComparableTest(3, "Alice",35));
       employees.add(new ComparableTest(1, "Bob",65));
       employees.add(new ComparableTest(2, "Charlie",87));

       Collections.sort(employees); // Uses compareTo() in Employee class
       System.out.println(employees); // Output: [1 - Bob, 2 - Charlie, 3 - Alice]
    }
}
