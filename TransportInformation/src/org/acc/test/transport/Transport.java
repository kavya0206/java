package org.acc.test.transport;

import org.acc.test.air.Air;
import org.acc.test.road.Road;
import org.acc.test.water.Water;

public class Transport {
	public void transportForm() {
		System.out.println("Transport Form");
	}
	public static void main(String[] args) {
		Transport t = new Transport();
		t.transportForm();
		//method call from different class in different packages
		Road r = new Road();
		r.bike();
		r.cycle();
		r.bus();
		r.car();
		Air a = new Air();
		a.areoPlane();
		a.helicopter();
		Water w = new Water();
		w.boat();
		w.ship();
	}
}
