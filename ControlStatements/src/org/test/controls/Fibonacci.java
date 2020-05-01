package org.test.controls;

public class Fibonacci {
	public static void main(String[] args) {
		int i, sum;
		int n1 = 0, n2=1;
		for (i = 0; i <= 100; i++) {
			System.out.println(n1);
			sum = n1+n2;
			n1=n2;
			n2=sum;
		}
	}
}
