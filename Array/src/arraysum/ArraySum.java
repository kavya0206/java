package arraysum;

public class ArraySum {
	public static void main(String[] args) {
		int a[] = new int[10];
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
