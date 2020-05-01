package org.acc.test.scanner;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp ID:");
		int id = sc.nextInt();
		System.out.println("Emp ID:" + id);

		System.out.println("Enter Emp Name");
		String name = sc.next();
		System.out.println("Emp Name:" + name);

		System.out.println("Enter Emp Email");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.println("Emp Email ID:" + email);

		System.out.println("Enter Emp Phone number");
		int phNo = sc.nextInt();
		System.out.println("Emp Phone number:" + phNo);

		System.out.println("Enter Emp Salary");
		float salary = sc.nextFloat();
		System.out.println("Emp Salary:" + salary);

		System.out.println("Enter Emp gender");
		char gender = sc.next().charAt(0);
		System.out.println("Emp Gender:" + gender);

		System.out.println("Enter Emp City");
		String city = sc.next();
		System.out.println("Emp City:" + city);
	}
}
