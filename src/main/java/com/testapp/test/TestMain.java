package com.testapp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestMain {

  public static void main(String[] args) {
    // TestWorkClass a=new TestWorkClass();
    /*ArrayList<Student> al = new ArrayList<Student>();
    al.add(new Student("b", 10, "c9"));
    al.add(new Student("c", 8, "c3"));
    al.add(new Student("a", 22, "c8"));
    al.add(new Student("f", 1, "c7"));
    TestComparator tc = new TestComparator();
    Collections.sort(al, tc);

    al.stream()
        .forEach(
            item -> {
              System.out.println(" name " + item.getName() + "   age   " + item.getAge());
            });

    System.out.println(Arrays.toString(al.toArray()));

    System.out.println("-----------------------------------------");

    ArrayList<Employee> b1 = new ArrayList<Employee>();
    b1.add(new Employee("a", 11, "c9"));
    b1.add(new Employee("b", 81, "c3"));
    b1.add(new Employee("c", 2, "c8"));
    b1.add(new Employee("d", 100, "c7"));
    System.out.println("-----------------------------------------");
    System.out.println("--------------Consumer--------------------------");
    System.out.println("-----------------------------------------");
    Consumer<Employee> empConsumer = t -> System.out.println(t);
    b1.forEach(empConsumer);
    System.out.println("-----------------------------------------");
    System.out.println("-----------------------------------------");
    System.out.println("--------------Supplier--------------------------");
    System.out.println("-----------------------------------------");
    Supplier<Double> doublesupplier = () -> Math.random();
    DoubleSupplier doubleSup = Math::random;

    System.out.println(doubleSup.getAsDouble());
    System.out.println(doublesupplier.get());
    System.out.println("-----------------------------------------");
    System.out.println("--------------Predicate--------------------------");
    System.out.println("-----------------------------------------");
    Predicate<Employee> empPredicate = (t) -> t. > 80;
    b1.stream().filter(empPredicate).forEach(empConsumer);

    System.out.println("-----------------------------------------");
    System.out.println("--------------Function--------------------------");
    System.out.println("-----------------------------------------");

    Function<String, Integer> func = String::length;

    List<String> names =
        Arrays.asList("sam", "ram", "kumar", "arul", "vijay", "ajith", "sakthi", "raja");
    names.stream().map(func).forEach(System.out::println);
    System.out.println("-----------------------------------------");
    Collections.sort(b1);

    b1.stream()
        .forEach(
            item -> {
              System.out.println(" name " + item.getName() + "   age   " + item.getAge());
            });
    System.out.println(Arrays.toString(b1.toArray()));

    String s = "Learn Share Learn";
    int output = s.indexOf("ea", 3); // returns 13
    System.out.println(output);

    int bitmask = 0x0F;
    int val = 0x2222;
    System.out.println(bitmask);
    System.out.println(val);
    // prints "2"
    System.out.println(val & bitmask);*/
  }
}
