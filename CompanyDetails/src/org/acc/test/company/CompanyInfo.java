package org.acc.test.company;

public class CompanyInfo {
//method creation
	private void companyName() {
System.out.println("Company name: XYZ Private Ltd");
	}
	private void companyId() {
	System.out.println("Company Id: 1234567");
	}
	private void companyAddress() {
		System.out.println("Compnay Address: Address");
	}
	//main method
	public static void main(String[] args) {
		//object creation
		CompanyInfo company = new CompanyInfo();
		//method call
		company.companyName();
		company.companyId();
		company.companyAddress();
	}
}
