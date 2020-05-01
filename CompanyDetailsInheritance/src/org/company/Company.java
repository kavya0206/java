package org.company;

import org.client.Client;

public class Company extends Client {
	public void companyName() {
		System.out.println("Company Name: XYZ");
	}

	public static void main(String[] args) {
		Company cmp = new Company();
		cmp.companyName();
		cmp.clientName();
	}
}
