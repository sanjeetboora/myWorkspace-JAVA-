package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;

public class counting_valleys {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		answer_btao(n, str);
	}

	public static void answer_btao(int num, String str) {

		int count = 0, result = 0;

		for (int i = 0; i < str.length(); i++) {
			char sub = str.charAt(i);

			if (sub == 'D') {
				count--;
			} else if (sub == 'U') {
				count++;
			}
			if (count == 0 && str.charAt(i) == 'U') {
				result++;
			}

		}
		System.out.println(result);
	}
}