package ALGORITHMS.BIT_MANIPULATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sum_vs_xor {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();

		int zeroes = numZeroes(n);
		long result = 1L << zeroes;
		System.out.println(result);
	}

	private static int numZeroes(long n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 0) {
				count++;
			}
			n >>= 1;
		}
		return count;
	}
}