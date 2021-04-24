package com.testapp.test;

public class TestObjectNullCheck {
	
	public static void main(String[] args) {
		
		College col=new College();
		Department dep=new Department();
		col.setDepartment(dep);
		
		Student student=new Student("Sakthi",22,"992");
		dep.setStudent(student);
		System.out.println(student.getName());
		if(col.getDepartment()!=null&&col.getDepartment().getStudent()!=null&&col.getDepartment().getStudent().getName()!=null) {
			
		}
		col.getDepartment().getStudent().setName("raja");
		System.out.println(student.getName());
		System.out.println("nothing to worry");
		//System.out.println(col.getDepartment().getStudent());
		//System.out.println(col.getDepartment().getName()!=null);
		
		

		
		
		
	}

}
