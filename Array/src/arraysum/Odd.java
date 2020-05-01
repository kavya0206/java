package arraysum;

import java.util.Arrays;
import java.util.Scanner;

public class Odd {
private void search() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array1 : ");
	int size1 = sc.nextInt();
	String myArray1[] = new String[size1];
	System.out.println("Enter elements of the array1 : ");
	for (int i = 0; i < size1; i++) {
		myArray1[i] = sc.next();
	}
	String s1= Arrays.toString(myArray1);
	System.out.println(s1);
	System.out.println("Enter Element to be searched:");
	String k = sc.next();
	if( s1.contains(k))
	{
		System.out.println("YES");
	}

	else {
		System.out.println("NO");
	}
	
}
public static void main(String[] args) {
	Odd s = new Odd();
	s.search();
}
}
