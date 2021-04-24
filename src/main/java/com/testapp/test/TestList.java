package com.testapp.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestList {

	
	public static void main(String[] args) {
		
		TestList a=new TestList();
		
		List<Map<String, Map<String, String>>> aa=new ArrayList<>();
		Map<String, Map<String, String>> e=new HashMap<>();
		
		Map<String, String> ee=new HashMap<>();
		//ee.put("name", "testValue");
		//ee.put("name", "testValue");
		
		e.put("records", ee);
		
		//Map<String, String> eee=new HashMap<>();
		//eee.put("name", "testValue");
		//ee.put("name", "testValue");
		
		//e.put("indirecord", eee);
		aa.add(e);
		/*
		 * System.out.println("*********************");
		 * System.out.println(aa.get(0).values().toString());
		 * System.out.println(aa.get(0).values().toString().length());
		 * System.out.println(aa.get(0).values().toString().length()>4);
		 * System.out.println(aa.get(0).values().size());
		 * System.out.println(aa.get(0).values().isEmpty()); System.out.println(aa!=null
		 * && aa.size()>0 &&
		 * aa.get(0).values().toString().length()>2?"not empty":"empty");
		 * System.out.println(
		 * "**************************************************************************************"
		 * ); Student student=new Student("ashok", 22, "99999999");
		 * System.out.println(a.testforReturn(student).getName());
		 */
		a.validate("Sakthi", "Vel", "");
		
	}
	
	
	
	public Student testforReturn(Student student) {
		for(int i=0;i<10;i++) {
			if(i==5) {
				testreturn(student);
			}
			System.out.println(student.getName()+ "   value    i    "+i);
		}
		System.out.println("inside method    "+student.getName());
		return student;
	}
	
	private Student testreturn(Student student) {
		student.setName("kumar");
		return student;
	}
	
	private boolean validate(String fn,String ln, String dob) {
		if(fn.isEmpty()) {
			System.out.println("fn empty");
		}
		if(ln.isEmpty()) {
			System.out.println("ln empty");
		}
		if(dob.isEmpty()) {
			System.out.println("dob empty");
		}
		
		if(fn.isEmpty()&&ln.isEmpty()&&dob.isEmpty()) {
			System.out.println("all are empty");
		}
		if((fn.isEmpty()||ln.isEmpty()||dob.isEmpty())) {
			System.out.println((fn.isEmpty()||ln.isEmpty()||dob.isEmpty()));
		}
		return (fn.isEmpty()||ln.isEmpty()||dob.isEmpty());
	}
	
}
