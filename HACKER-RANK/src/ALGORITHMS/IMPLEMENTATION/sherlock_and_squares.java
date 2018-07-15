package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class sherlock_and_squares {

	public static void main(String[] args) {
		// TODO
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		for (int i = 0; i < num; i++) {
			long first = scn.nextLong();
			long second = scn.nextLong();
			no_of_sq_digits(first, second);
		}

	}

	public static void no_of_sq_digits(long first, long second) {

		int count = 0;
		if (first == second) {
			for (long i = 1; i <= Math.sqrt(second); i++) {
				long k = i * i;
				if (k == second) {
					count++;
				}
			}
			System.out.println(count);

		} else {

			for (long i = 1; i <= Math.sqrt(second); i++) {
				long k = i * i;
				if (k >= first && k <= second) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
