package ALGORITHMS.BIT_MANIPULATION;

import java.util.Scanner;

public class xor_sequence {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		long queries = scn.nextLong();
		for (int i = 0; i < queries; i++) {
			Long L = Long.parseUnsignedLong(scn.next());
			Long R = Long.parseUnsignedLong(scn.next());
			System.out.println(0 ^ check(R) ^ check(L - 1));
		}

	}

	public static long check(long x) {
		long a = x % 8;
		if (a == 0 || a == 1)
			return x;
		if (a == 2 || a == 3)
			return 2;
		if (a == 4 || a == 5)
			return x + 2;
		if (a == 6 || a == 7)
			return 0;
		return 0;
	}
}

// public static long xor(long L, Long R) {
// Long sum = 0L;
// Long num = 0L;
// for (Long i = L; i <= R; i++) {
// if (i << (64-3) == 0L) {
// num = i;
//
// } else if (i % 4 == 1) {
// num = 1L;
// } else if (i % 4 == 2) {
// num = i + 1;
//
// } else if (i % 4 == 3) {
// num = 0L;
//
// }
// sum = sum ^ num;
// }
// return sum;
// }
