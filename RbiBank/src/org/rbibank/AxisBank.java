package org.rbibank;

public class AxisBank extends Deposit {
	public void axisRdAccount() {
		System.out.println("Axis Recurring Deposit");
	}

	public void axisFdAccount() {
		System.out.println("Axis Fixed Deposit");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.axisRdAccount();
		axis.axisFdAccount();
	}
}
