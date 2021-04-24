package com.testapp.test;

import java.util.Comparator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TestComparator implements Comparator<Student> {

  @Override
  public int compare(Student arg0, Student arg1) {
    // TODO Auto-generated method stub
    return arg0.getName().compareTo(arg1.getName());
  }
}
