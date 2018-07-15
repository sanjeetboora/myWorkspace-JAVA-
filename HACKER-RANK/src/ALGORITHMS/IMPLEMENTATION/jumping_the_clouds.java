package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class jumping_the_clouds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		int jump = 0;
		for (int j = 0; j < n-1; j += 2) {
			if (c[j] != 0) {
				j--;
			}
			jump++;
		}
		System.out.println(jump);
	}
}
