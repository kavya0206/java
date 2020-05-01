package org.test.controls;

public class EvenCount {
	public static void main(String[] args) {
		int i, count = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
