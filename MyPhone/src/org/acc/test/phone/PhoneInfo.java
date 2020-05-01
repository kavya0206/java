package org.acc.test.phone;

public class PhoneInfo {
	// method creation
	private void phoneName() {
		System.out.println("Phone name: iPhone");
	}

	private void phoneMieiNum() {
		System.out.println("Phone Miei number: 1244645778823");
	}

	private void camera() {
		System.out.println("Camera: Rear camera 32pixel");
	}

	private void storage() {
		System.out.println("Storage: 64GB");
	}

	private void osName() {
		System.out.println("OS Name: IOS");
	}

	// main method
	public static void main(String[] args) {
		// object creation
		PhoneInfo phone = new PhoneInfo();
		// method call
		phone.phoneName();
		phone.phoneMieiNum();
		phone.camera();
		phone.storage();
		phone.osName();
	}
}
