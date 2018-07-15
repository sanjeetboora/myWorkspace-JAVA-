package ALGORITHMS.BIT_MANIPULATION;

import java.util.Scanner;

public class and_product {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			long a = in.nextLong();
			long b = in.nextLong();
			long res = a & (a + 1);
			int i = 1;
			while (a + (long) Math.pow(2, i) <= b) {
				res = (a + (long) Math.pow(2, i)) & res;
				++i;
			}
			System.out.println(res & b);
		}
	}
}

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
//
// long queries = scn.nextLong();
// for (int i = 0; i < queries; i++) {
// Long L = Long.parseUnsignedLong(scn.next());
// Long R = Long.parseUnsignedLong(scn.next());
//
// System.out.println(and(L, R));
// }
// }
//
// public static long and(long L, Long R) {
// Long sum = L;
// Long num = 1L;
// for (Long i = L+1; i <= R; i++) {
// sum = sum & i;
// }
// return sum;
// }
//
// }
