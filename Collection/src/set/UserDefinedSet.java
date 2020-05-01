package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefinedSet {
	public static void main(String[] args) {
		Set s1 = new HashSet();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			System.out.println("Emp" + i);
			System.out.println("Empid");
			int empId = sc.nextInt();
			System.out.println("Name");
			String name = sc.next();
			System.out.println("Phone");
			long phone = sc.nextLong();
			System.out.println("Address");
			String address = sc.next();
			System.out.println("DOB");
			String dob = sc.next();
			System.out.println("DOJ");
			String doj = sc.next();
			System.out.println("Gender");
			char gender = sc.next().charAt(0);
			System.out.println("Salary");
			float sal = sc.nextFloat();
			System.out.println("Empid:" + empId);
			System.out.println("Name:" + name);
			System.out.println("Phone:" + phone);
			System.out.println("Address:" + address);
			System.out.println("DOB:" + dob);
			System.out.println("DOJ:" + doj);
			System.out.println("Gender:" + gender);
			System.out.println("Salary:" + sal);
		}
	}
}
