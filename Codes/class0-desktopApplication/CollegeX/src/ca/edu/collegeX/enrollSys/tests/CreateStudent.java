package ca.edu.collegeX.enrollSys.tests;

import ca.edu.collegeX.enrollSys.model.Student;

public class CreateStudent {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Jack");
		student.setEmail("jack@gmail.com");
		student.setAddress("Av. Sherbrooke, 5001");
		student.setId((long) 3);
		
		System.out.println(student.getName());
		System.out.println(student.getEmail());
		System.out.println(student.getAddress());
		System.out.println(student.getId());	
	}
}
