package org.test.controls;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i, fact = 1;
		for (i = 1; i <= n; ++i) {
			fact *=i;
		}
		System.out.println(fact);
	}

}
