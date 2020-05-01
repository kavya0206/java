package arraysum;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rotations:");
		int rotateBy = sc.nextInt();
		System.out.println("Rotate given array " + Arrays.toString(input));
		int[] rotatedArray = rotateLeft(input, input.length, rotateBy);
		System.out.println("Rotated array: " + Arrays.toString(rotatedArray));

	}

	private static int[] rotateLeft(int[] rotatedArray, int length, int rotateBy) {
		for (int i = 0; i < rotateBy; i++) {
			// take out the first element
			int temp = rotatedArray[0];
			for (int j = 0; j < length - 1; j++) {
				// shift array elements towards left by 1 place
				rotatedArray[j] = rotatedArray[j + 1];
			}
			rotatedArray[length - 1] = temp;
		}
		return rotatedArray;
	}

}
