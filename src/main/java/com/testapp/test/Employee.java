package com.testapp.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee> {

  private String name;
  private int age;
  private String phone;

  @Override
  public int compareTo(Employee arg0) {
    // TODO Auto-generated method stub
    return name.compareTo(arg0.name);
  }

  /*@Override
  public int compareTo(Employee arg0) {
  	// TODO Auto-generated method stub
  	if(age==arg0.age) {
  		return 0;
  	}
  	else if(age>arg0.age) {
  		return 1;
  	}
  	else {
  		return -1;
  	}
  }*/

}
