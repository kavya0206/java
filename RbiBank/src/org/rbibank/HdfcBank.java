package org.rbibank;

public class HdfcBank extends Deposit {
	public void hdfcRdAccount() {
		System.out.println(" HDFC Recurring Deposit");
	}

	public void hdfcFdAccount() {
		System.out.println(" HDFC Fixed Deposit");
	}

	public static void main(String[] args) {
		HdfcBank hdfc = new HdfcBank();
		hdfc.deposit();
		hdfc.hdfcRdAccount();
		hdfc.hdfcFdAccount();
	}
}
