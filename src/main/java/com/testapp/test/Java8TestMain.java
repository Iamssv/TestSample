package com.testapp.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8TestMain {
	public static void main(String []args) {
		
		
		/*
		 * List<String> s=Arrays.asList("Sakthi","Kumar","Raj","Ashok");
		 * System.out.println(s); List<Integer>
		 * m=s.stream().map(String::length).collect(Collectors.toList()); Set<String>
		 * m1=s.stream().limit(2).collect(Collectors.toSet()); System.out.println(m);
		 * System.out.println(m1);
		 * System.out.println("**************************************");
		 * System.out.println("Count the duplicates"); String
		 * ss="there was a there was an idot named *****  ***** ***** ***** was";
		 * List<String> sss=Arrays.asList(ss.split(" ")); Map<Object, Long>
		 * count=sss.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()))
		 * ; count.forEach( (k , v ) -> System.out.println( k + " : "+ v ));
		 * System.out.println("**************************************"); Set<String>
		 * setList=new HashSet<String>(sss); for(String s0:setList) {
		 * System.out.println(s0+"     valu    "+Collections.frequency(sss, s0)); }
		 * 
		 * System.out.println("**************************************");
		 * System.out.println("filter"); Map<Object, Long>
		 * count1=sss.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())
		 * ).entrySet().stream().filter(x->
		 * x.getValue()>2).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::
		 * getValue)); count1.forEach((k,v)->System.out.println(k+"  :  " +v));
		 * System.out.println("**************************************");
		 * 
		 * System.out.println("**************************************");
		 * System.out.println("Max in list"); List<Integer> maxList=Arrays.asList(1, 2,
		 * 3, 4, 56, 7, 89, 10);
		 * System.out.println("**************************************");
		 * System.out.println("**************SUM OF NUMBERs**************");
		 * System.out.println(maxList.stream().mapToInt(x->x).sum());
		 * System.out.println("**************************************");
		 * //max.stream().distinct().collect()
		 * System.out.println(Collections.max(maxList));
		 * System.out.println(maxList.stream().distinct().collect(Collectors.toList()));
		 * System.out.println(maxList.stream().collect(Collectors.toSet()));
		 * System.out.println("**************************************");
		 * System.out.println("Sorting objects"); System.out.println(); Student alex =
		 * new Student("Alex", 23,"xxx"); Student john = new Student("John", 40,"xxx");
		 * Student peter = new Student("Peter", 32,"xxx"); List<Student> people =
		 * Arrays.asList(alex, john, peter); System.out.println("Min from the object");
		 * System.out.println();
		 * System.out.println(people.stream().min(Comparator.comparing(Student::getAge))
		 * ); System.out.println("by object"); System.out.println();
		 * people.stream().sorted(Comparator.comparing(Student::getName)).forEach(System
		 * .out::println); System.out.println();
		 * people.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.
		 * out::println);
		 * 
		 * System.out.println(
		 * "***************************************************************"); String
		 * name = ""; Optional<String> opt = Optional.ofNullable(name);
		 * 
		 * System.out.println(opt.isPresent());
		 */
		
	}

}
