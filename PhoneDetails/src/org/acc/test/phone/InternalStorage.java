package org.acc.test.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("Processor Name: Intel");
	}

	private void ramSize() {
		System.out.println("RAM Size: 64GB");
	}
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		ExternalStorage e = new ExternalStorage();
		
		// method call from different class
		
		i.processorName();
		i.ramSize();
		e.size();
	}
}
