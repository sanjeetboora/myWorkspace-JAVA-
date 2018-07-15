package ALGORITHMS.BIT_MANIPULATION;

import java.util.Scanner;

public class a_or_b {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "e24dd004";
		long hex = Long.parseLong(str.trim(),16);
		String binary=Long.toBinaryString(hex);
		System.out.println(binary);
	}
}
