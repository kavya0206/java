package org.phone;

public class Phone {
	// different datatype order in arguments
	public void phoneInfo(String name, int phNo) {
		System.out.println("Phone name:" + name + "\n" + "Phone number:" + phNo);

	}

	public void phoneInfo(int phNo, String name) {
		System.out.println("Phone number:" + phNo + "\n" + "Phone name:" + name);
	}

	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo("iPhone", 654343553);
		ph.phoneInfo(86434394, "oneplus");
	}
}
