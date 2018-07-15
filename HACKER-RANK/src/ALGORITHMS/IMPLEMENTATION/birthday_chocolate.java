package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class birthday_chocolate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = result_btao(s, d, m);
		System.out.println(result);
	}

	public static int result_btao(int[] squares, int d, int m) {
		int i, j, count = 0, x = 0, n = squares.length;
		if (m == 1)
			n = m;
		for (i = 0; i < (n - m) + 1; i++) {
			x = 0;
			for (j = 0; j < m; j++) {
				x = x + squares[i + j];
			}
			if (x == d)
				count++;
		}
		return count;
	}

}
