package org.emp;

public class Employee {
	// Different Datatype arguments
	public void empId(int id) {
		System.out.println("Interger id");
	}

	public void empId(long id) {
		System.out.println("Long id");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId(1203);
		emp.empId(12309l);
	}
}
