package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class SalaryFromEmpl {

    public static void main(String[] args){

        List<Employee> employees = Arrays.asList(new Employee("praveen",150000.0,"hyderabad"),
                new Employee("praveen2",160000.0,"hyderabad"),
                new Employee("praveen3",170000.0,"hyderabad"),
                new Employee("praveen4",180000.0,"hyderabad"),
                new Employee("praveen5",190000.0,"hyderabad"));

        Set<Double> seen = new HashSet<>();
        List<Integer> salary= Arrays.asList(1,2,4,2,3,4,234,3,234,32,34,32,343);
       // employees.parallelStream().map(Employee::getSalary).filter(n->n>=170000.0).forEachOrdered(System.out::println);
        System.out.println(employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(2).limit(1).collect(Collectors.toList()));
        //System.out.println(salary.stream().filter(n->!seen.add(n)).collect(Collectors.toList()));
        System.out.println(employees.stream().map(Employee::getSalary).filter(n->!seen.add(n)).collect(Collectors.toList()));
        System.out.println(salary.stream().max(Integer::compareTo).get());
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sortedEmployees.forEach(System.out::println);
        List<Integer> sortedDesc = salary.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        sortedDesc.forEach(System.out::println);

        Optional<Double> secondHighestSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(secondHighestSalary.get());


        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie");

        Map<String, Long> nameCount = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println(nameCount);

        Optional<String> longestString = Arrays.asList("apple", "banana", "cherry").stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println(longestString.orElse(null)); // ba

        Map<Double, String> empMap = employees.stream()
                .collect(Collectors.toMap(Employee::getSalary, Employee::getName));

        System.out.println(empMap); // {1=Alice, 2=Bob}
        String nametr="praveen";
        char[] nameschar = nametr.toCharArray();
        Map<Character, Long> nameCountchar = nametr.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(nameCountchar);

                
    }

}
