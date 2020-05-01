package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserDefined {
public static void main(String[] args) {
	Map m1 = new LinkedHashMap();
	
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
		m1.put("EmpId", empId);
		m1.put("Name", name);
		m1.put("Phone", phone);
		m1.put("Address", address);
		m1.put("DOB",dob);
		m1.put("DOJ", doj);
		m1.put("Gender", gender);
		m1.put("Salary", sal);
		System.out.println("Emp" +i + " " + m1);
	}
}
}
