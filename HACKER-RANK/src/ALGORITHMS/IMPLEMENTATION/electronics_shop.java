package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class electronics_shop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] pendrives = new int[m];
		for (int pendrives_i = 0; pendrives_i < m; pendrives_i++) {
			pendrives[pendrives_i] = in.nextInt();
		}
		Arrays.sort(keyboards);
		Arrays.sort(pendrives);
		answer_btao(s, keyboards, pendrives);
	}

	public static void answer_btao(int total, int[] key, int[] pen) {
		int result = 0;
		if (key[0] + pen[0] > total) {
			result = -1;
		} else {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < key.length; i++) {
				for (int j = 0; j < pen.length; j++) {
					int sum = key[i] + pen[j];
					if (sum > max && sum <= total) {
						max = sum;
					}
				}
			}
			result = max;
		}
		System.out.println(result);
	}
}
