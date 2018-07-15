package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class equalize_the_array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[101];
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, ++arr[s.nextInt()]);
		}
		System.out.println(n - max);
	}
}
