package arraysum;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		int a[] = new int[10];
		int sum = 0, avg = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		avg = sum / 10;
		System.out.println(avg);
	}
}
