package arraysum;

public class Array {
	public static void main(String[] args) {
		int a[] = { 10, 10, 20, 50, 50, 60, 60, 80};
		int j = 0;
		for (int i = 0; i <= a.length-1; i++) {
			if (a[i] != a[i + 1]) {
			a[j++] = a[i];
				System.out.println(a[i]);
			}
			
		}
		a[j] = a[a.length-1];
		System.out.println(a[j]);
	}
}
