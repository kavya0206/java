package org.acc.test.emp;

public class Employee {
	// method creation
	private void empId() {
		System.out.println("Emp ID: 112");
	}

	private void empName() {
		System.out.println("Emp name: XXX");
	}

	private void empDob() {
		System.out.println("Emp Dob: 01/01/2020");
	}

	private void empEmail() {
		System.out.println("Emp Email: xxx@gmail.com");
	}

	private void empAddress() {
		System.out.println("Emp Address: Address");
	}
	//main method
	public static void main(String[] args) {
		//object creation
		Employee emp = new Employee();
		//Method call
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empEmail();
		emp.empAddress();
	}
}
