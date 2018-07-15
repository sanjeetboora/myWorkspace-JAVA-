package ALGORITHMS.BIT_MANIPULATION;

import java.util.Scanner;

public class the_great_xor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long queries = scn.nextLong();

		for (long i = 0L; i < queries; i++) {
			long sum = 0L;
			long num = scn.nextLong();
			long check = (num & 1), count = 0L;
			while (num > 0) {
				if (check == 0) {
					sum = sum + (long) Math.pow(2, count);

				}
				num = num >> 1;
				check = (num & 1);
				count++;
			}
			System.out.println(sum);
		}

	}
}
