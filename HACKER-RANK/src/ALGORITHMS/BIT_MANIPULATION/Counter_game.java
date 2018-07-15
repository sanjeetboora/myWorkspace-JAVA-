package ALGORITHMS.BIT_MANIPULATION;

import java.util.Scanner;

public class Counter_game {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long queries = scn.nextLong();

		for (long i = 0L; i < queries; i++) {
			Long num = Long.parseUnsignedLong(scn.next());
			winner(num);
		}
	}

	public static void winner(long N) {
		boolean ans = true;
		while (N != 1) {
			long check = (N & (N - 1));
			if (check == 0) {
				N = N >> 1;
			} else {
				N = N - Long.highestOneBit(N);
			}
			ans = !ans;
		}
		if (ans) {
			System.out.println("Richard");
		} else {
			System.out.println("Louise");
		}

	}
}
