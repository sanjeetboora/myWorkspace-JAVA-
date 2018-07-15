package ALGORITHMS.STRINGS;

import java.util.Scanner;

public abstract class beautiful_binary_string {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		char[] arr = B.toCharArray();
		int result = minSteps(n, arr);
		System.out.println(result);
	}

	static int minSteps(int n, char[] arr) {
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			if (arr[i] == '0' && arr[i + 1] == '1' && arr[i + 2] == '0') {
				arr[i + 2] = '1';
				count++;
			}
		}
		return count;
	}
}
