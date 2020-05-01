package org.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UserList {

	public static void main(String[] args) {
               
		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr no. of emp");
		int n = sc.nextInt();
	/*	for (int i = 0; i < n; i++) {
			System.out.println("Enter id");
			e1.setEmpId(sc.nextInt());
			System.out.println("Enter Name");
			e1.setName(sc.next());
			System.out.println("Enter phno");
			e1.setPhno(sc.nextLong());
		}*/
		List<Employee> l1= new LinkedList<>();
		for (int i = 0; i < n; i++) {
			Employee e = l1.get(i);
			e.setEmpId(sc.nextInt());
			e.setName(sc.next());
			e.setPhno(sc.nextLong());
		}
		System.out.println(l1);

		/*for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i).getEmpId());
			System.out.println(l1.get(i).getName());
			System.out.println(l1.get(i).getPhno());

		}
*/
	}
}
