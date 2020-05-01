package org.bike;

public class Ktm extends Bike {

	@Override
	public void cost() {
		System.out.println("Cost");

	}

	@Override
	public void speed() {
		System.out.println("Speed");
	}

	public static void main(String[] args) {
		Ktm ktm = new Ktm();
		ktm.cost();
		ktm.speed();
	}
}
