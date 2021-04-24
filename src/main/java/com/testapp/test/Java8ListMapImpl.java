package com.testapp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8ListMapImpl {

	public static void main(String[] args) {
		
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7);
		Consumer<Integer> consumer=e->System.out.println(e);
		stream.forEach(consumer);
		System.out.println("******************************");
		Supplier<Integer> supplier=()->(new Random()).nextInt(1000);
		Stream<Integer> randomNumbers=Stream.generate(supplier);
		randomNumbers.limit(1).forEach(e->System.out.println(e));
		System.out.println("******************************");
		Stream<IntStream> streamstr=Stream.of("asda_bd123".chars());
		IntPredicate predicate=i->i<10;
		streamstr.forEach(e->System.out.println(e));
		System.out.println("******************************");
		Stream<String> streamStrsplit=Stream.of("A$B$C$D".split("\\$"));
		//streamStrsplit.forEach(e->System.out.println(e));
		List<String> strList=streamStrsplit.filter(i->i.equals("A")||i.equals("B")).collect(Collectors.toList());
		System.out.println(strList);
		strList.forEach(e->System.out.println(e));
		System.out.println("******************************");
		Stream<String> negateStream=Stream.of("aaa","bbb","bbb","ccc","dddd","d","aa","aaaaaa");
		Predicate<? super String> negatePredicate=x->x.startsWith("a");
		List<String> negateList=negateStream.filter(negatePredicate.negate()).collect(Collectors.toList());
		negateList.forEach(e->System.out.println(e));
		System.out.println("******************************");
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        System.out.println(StringProcessor.filter(
                list, x -> x.startsWith("A")));                    // [A, AA, AAA]

        System.out.println(StringProcessor.filter(
                list, x -> x.startsWith("A") && x.length() == 3)); // [AAA]
        System.out.println("******************************");
        Student h1 = new Student( "amazon",1, "aws.amazon.com");
        Student h2 = new Student( "linode", 2,"linode.com");
        Student h3 = new Student("liquidweb", 3, "liquidweb.com");
        Student h4 = new Student( "google",4, "google.com");

        List<Student> listObject = Arrays.asList(new Student[]{h1, h2, h3, h4});

        List<Student> result2 = StringProcessor.filterObject(listObject, studentPredicate());
        System.out.println("result2 : " + result2); // linode
        System.out.println("******************************");
        Map<String, String> m0 = new HashMap<>();
        m0.put("payerId", "123");
        m0.put("member", "456");
        m0.put("name", "789");
        Map<String, String> m1 = new HashMap<>();
        m1.put("payerId", "223");
        m1.put("member", "456");
        m1.put("lastname", "789");
        Map<String, String> m2 = new HashMap<>();
        m2.put("payerId", "000");
        m2.put("firstname", "222");
        m2.put("name", "111");
        Map<String, String> m3 = new HashMap<>();
        m3.put("payerId", "000");
        m3.put("member", "111");
        m3.put("name", "222");

        List<Map<String, String>> l = new ArrayList<>(Arrays.asList(m0, m1,m2,m3));
        Set<String> mapFilter= StringProcessor.filterMap(l, MapPredicate());
        System.out.println(mapFilter.size());
        mapFilter.forEach(e->System.out.println(e));
        System.out.println("******************************");
        
		/*
		 * l.stream().flatMap(list->list.entrySet().stream() .filter(entry ->
		 * entry.getKey().equals("x")) .collect(Collectors.toMap(Map.Entry::getKey,
		 * Map.Entry::getValue)).forEach(e->System.out.println(e));
		 */
		/*
		 * RequestedPayerID= 33099 Map1 -> payerId = CANPY Map2 -> payerId = 33099 Map3
		 * -> payerId = 33099
		 * 
		 * CANPY
		 */
        
        
        
	}
	
	public static Predicate<Student> studentPredicate() {
        return n -> n.getName().equals("linode");
    }
	
	public static Predicate<Map<String,String>> MapPredicate(){
		return n-> n.get("payerId").equals("123");
	}
	
}
class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
    
    static List<Student> filterObject(List<Student> list, Predicate<Student> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
    
    static Set<String> filterMap(List<Map<String,String>> listMap, Predicate<Map<String,String>> predicate){
    	
		return listMap.stream().filter(predicate.negate()).map(m->m.get("payerId")).collect(Collectors.toSet());
    	
    }
}