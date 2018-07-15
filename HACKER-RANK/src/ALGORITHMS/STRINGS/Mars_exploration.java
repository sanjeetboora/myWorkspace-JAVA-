package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class Mars_exploration {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		char str[] = S.toCharArray();
		int count = 0;

		for (int i = 0; i < str.length; i += 3) {
			if (str[i] != 'S') {
				count++;
			}
			if (str[i + 1] != 'O') {
				count++;
			}
			if (str[i + 2] != 'S') {
				count++;
			}
		}

		System.out.println(count);
	}
}
