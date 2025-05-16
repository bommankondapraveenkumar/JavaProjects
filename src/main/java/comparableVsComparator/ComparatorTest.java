package comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    String name;
    int num;
    ComparatorTest(int num,String name) {
        this.name = name;
        this.num=num;
    }

    public String getName(){
        return name;
    }
    public int getNum(){
        return num;
    }

    public static void main(String[] args) {
        List<ComparatorTest> employees = new ArrayList<>();
        employees.add(new ComparatorTest(1, "lam1"));
        employees.add(new ComparatorTest(2, "am2"));
        employees.add(new ComparatorTest(3, "sam3"));
        Collections.sort(employees,new NewName());

        for(ComparatorTest e:employees){
            System.out.println(e.getName());
        }

        Collections.sort(employees,new NewNum());
        for(ComparatorTest e : employees){
            System.out.println(e.getNum());
        }
        //employees.sort((e1, e2) -> e1.name.compareTo(e2.name));//using lambda expression
        // employees.sort(Comparator.comparing(e -> e.name));//or use comparing
        // employees.sort(Comparator.comparing(Employee::getName)
        //  .thenComparing(Employee::getId));
        System.out.println(employees);
    }
    public static class NewName implements Comparator<ComparatorTest>{
        public int compare(ComparatorTest o1, ComparatorTest o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }
    public static class NewNum implements Comparator<ComparatorTest>{
        @Override
        public int compare(ComparatorTest o1, ComparatorTest o2) {
            return Integer.compare(o1.getNum(),o2.getNum());
        }
    }
    @Override
    public String toString(){
        return num+" "+name;
    }
}
