package org.test.controls;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not Eligible");
		}
	}
}
