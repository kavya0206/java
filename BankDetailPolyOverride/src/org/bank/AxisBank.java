package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Deposit interest for Axis bank is 5%");
	}

	public static void main(String[] args) {
		AxisBank ax = new AxisBank();
		ax.saving();
		ax.fixed();
		ax.deposit();
	}
}
