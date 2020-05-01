package org.company;

public class CompanyInfo {
//Different number of arguments (Datatype count)
	public void companyName(String name) {
		System.out.println("One argument");
		System.out.println("Name:"+name);
	}
	public void companyName(String name, char g, int id) {
		System.out.println("Three arguments");
		System.out.println("Name:"+name +"\n"+ "Char:"+g +"\n"+ "Integer:"+id);
	}
	public void companyName(String name, String company, char g, int ph) {
		System.out.println("Many arguments");
		System.out.println("Name:"+name +"\n"+ "Company:"+company +"\n"+ "Char:"+g +"\n"+ "Integer:"+ph);
	}
	public static void main(String[] args) {
		CompanyInfo cmp = new CompanyInfo();
		cmp.companyName("XYZ");
		cmp.companyName("XYZ", 'm', 12);
		cmp.companyName("XYZ", "company", 'f', 10);
	}
}
