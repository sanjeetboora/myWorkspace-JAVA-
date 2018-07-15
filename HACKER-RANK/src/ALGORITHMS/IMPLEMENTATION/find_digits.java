package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class find_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			int num = scn.nextInt();
			answer_btao(num);
		}
	}

	public static void answer_btao(int num) {

		int actual_num = num, count = 0;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			if (rem == 0) {
				continue;
			}
			if (actual_num % rem == 0) {
				count++;
			}

		}
		System.out.println(count);
	}
}
