package org.acc.test.scanner;

import java.util.Scanner;

public class StudentDetails {
	private void average() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mark1");
		short mark1 = sc.nextShort();

		System.out.println("Enter Mark2");
		short mark2 = sc.nextShort();

		System.out.println("Enter Mark3");
		short mark3 = sc.nextShort();

		System.out.println("Enter Mark4");
		short mark4 = sc.nextShort();

		System.out.println("Enter Mark5");
		short mark5 = sc.nextShort();

		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		System.out.println("Total mark:" + total);
		
		float avg = total/5;
		System.out.println("Average mark:"+avg);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Id");
		short id = sc.nextShort();
		System.out.println("Student ID:"+id);
		
		System.out.println("Enter Student Name");
		String name = sc.next();
		System.out.println("Student Name:"+name);
		
		System.out.println("Enter Student Email");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.println("Student Email Id:"+email);
		
		System.out.println("Enter student Phone number");
		int phNo = sc.nextInt();
		System.out.println("Student Phone number:" + phNo);

		System.out.println("Enter Student Dept");
		String dept = sc.next();
		System.out.println("Studetnt Dept:" + dept);

		System.out.println("Enter Student gender");
		char gender = sc.next().charAt(0);
		System.out.println("Student Gender:" + gender);

		System.out.println("Enter Student City");
		String city = sc.next();
		System.out.println("Student City:" + city);
		
		StudentDetails avg = new StudentDetails();
		avg.average();

	}
}
