package org.add;

public class GreensTech {
	public void greensOmr(String name) {
		System.out.println("Method overload");
		System.out.println("Name:" + name);
	}

	// Different Datatype
	public void greensOmr(int phNo) {
		System.out.println("Different datatype");
		System.out.println("Phone:" + phNo);
	}

	// Datatype count
	public void greensOmr(int phNo, String name, String address) {
		System.out.println("Datatype count");
		System.out.println("Phone number:" + phNo + "\n" + "Name:" + name + "\n" + "Address:" + address);
	}

	// Datatype order
	public void greensOmr(int phNo, String name) {
		System.out.println("Datatype order: int, string");
		System.out.println("Integer:" + phNo + "\n" + "String:" + name);
	}

	public void greensOmr(String name, int phNo) {
		System.out.println("Datatype order: string, int");
		System.out.println("String:" + name + "\n" + "Integer:" + phNo);
	}

	public static void main(String[] args) {
		GreensTech gr = new GreensTech();
		gr.greensOmr("Greens");
		gr.greensOmr(12334);
		gr.greensOmr(1323, "greens", "OMR");
		gr.greensOmr(3445, "Greens");
		gr.greensOmr("Greens", 34334);
	}
}
