package org.acc.test.emp;

import org.acc.test.client.Client;
import org.acc.test.company.Company;
import org.acc.test.project.Project;

public class Employee {
	private void empName() {
		System.out.println("Emp Name: xxx");
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		Company cm = new Company();
		Project pro = new Project();
		Client cl = new Client();
		
		// calling method from different class in different package
		
		emp.empName();

		cm.companyName();

		pro.projectName();

		cl.clientName();
	}
}
