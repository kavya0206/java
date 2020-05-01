package org.rbibank;

public class IciciBank extends Deposit {
	public void iciciRdAccount() {
		System.out.println(" ICICI Recurring Deposit");
	}

	public void iciciFdAccount() {
		System.out.println(" ICICI Fixed Deposit");
	}

	public static void main(String[] args) {
		IciciBank icici = new IciciBank();
		icici.deposit();
		icici.iciciRdAccount();
		icici.iciciFdAccount();
	}
}
