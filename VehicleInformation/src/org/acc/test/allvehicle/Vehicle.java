package org.acc.test.allvehicle;

import org.acc.test.fourwheeler.FourWheeler;
import org.acc.test.threewheeler.ThreeWheeler;
import org.acc.test.twowheeler.TwoWheeler;

public class Vehicle {
	public void vehicleNecessery() {
		System.out.println("Two wheeler\n");
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.vehicleNecessery();
		TwoWheeler two = new TwoWheeler();
		two.bike();
		two.cycle();
		ThreeWheeler three = new ThreeWheeler();
		three.auto();
		FourWheeler four = new FourWheeler();
		four.car();
		four.bus();
		four.lorry();
	}
}
