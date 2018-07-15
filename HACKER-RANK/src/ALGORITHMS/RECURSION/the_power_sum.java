package RECURSION;

import java.util.Scanner;

public class the_power_sum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(pow_sum(x, n, 1, 0));
	}

	public static int pow_sum(int x, int n, int num, int res) {

		if (res == x) {
			return 1;
		}
		if (Math.pow(num, n) > x) {
			return 0;
		}
		if (res > x) {
			return 0;
		}
		int count = 0;
		count += pow_sum(x, n, num + 1, res + (int) Math.pow(num, n));
		count += pow_sum(x, n, num + 1, res);
		return count;
	}
}
