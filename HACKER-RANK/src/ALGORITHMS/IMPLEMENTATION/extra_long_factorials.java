package ALGORITHMS.IMPLEMENTATION;

import java.math.BigInteger;
import java.util.Scanner;

public class extra_long_factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(factorial(scn.nextBigInteger()));

	}

	public static BigInteger factorial(BigInteger num) {
		if (num == BigInteger.ZERO || num == BigInteger.ONE) {
			return BigInteger.ONE;
		} else {
			return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
	}

}
