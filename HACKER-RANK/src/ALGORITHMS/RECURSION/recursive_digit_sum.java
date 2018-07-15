package RECURSION;

import java.math.BigInteger;
import java.util.Scanner;

public class recursive_digit_sum {
	public static int getSuperDigit(StringBuilder p) {
		if (p.length() == 1) {
			return Integer.parseInt(p.toString());
		}
		int digitSum = 0;
		for (int i = 0; i < p.length(); i++) {
			digitSum += Integer.parseInt(p.substring(i, i + 1));
		}
		return getSuperDigit(new StringBuilder("" + digitSum));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int k = scanner.nextInt();
		long p = 0;
		for (int i = 0; i < n.length(); i++) {
			p += Integer.parseInt(n.substring(i, i + 1)) * k;
		}
		System.out.println(getSuperDigit(new StringBuilder("" + p)));
	}
}
