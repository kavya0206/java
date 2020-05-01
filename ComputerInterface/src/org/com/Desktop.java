package org.com;

public class Desktop implements Hardware, Software {
	private void desktopModel() {
		System.out.println("Desktop Models");

	}

	@Override
	public void softwareResources() {
		System.out.println("Software");

	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();
	}
}
