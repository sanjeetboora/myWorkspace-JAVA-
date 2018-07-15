package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class beautiful_days_at_the_movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int first = scn.nextInt();
		int second = scn.nextInt();
		int divisor = scn.nextInt();
		int count = 0;
		for (int i = first; i <= second; i++) {
			int rev = reverse(i);
		//	System.out.println(i + " => " + rev);
			int diff = Math.abs(i - rev);
			if (diff % divisor == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static int reverse(int num) {
		int a = 0;
		while (num >= 1) {
			a = a * 10 + (num % 10);
			num = num / 10;

		}
		return a;
	}

}
