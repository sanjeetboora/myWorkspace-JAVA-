package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class between_two_sets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		result_de(a, b, n, m);
	}

	public static void result_de(int[] first, int[] second, int n, int m) {
		int max = 0, count = 0, num = first[first.length - 1];

		if (n > m) {
			max = n;
		} else {
			max = m;
		}
		while (num <= second[0]) {
			boolean decide = true;
			for (int j = 0; j < max; j++) {
				if (j < n && j < m) {
					if (num % first[j] != 0 || second[j] % num != 0) {
						decide = false;
					}
				} else if (j < n && j >= m) {
					if (num % first[j] != 0) {
						decide = false;
					}
				} else if (j >= n && j < m) {
					if (second[j] % num != 0) {
						decide = false;
					}
				}
			}

			if (decide) {
				// System.out.println(num);
				count++;
				num++;

			} else {
				num++;
			}
		}
		System.out.println(count);
	}

}
