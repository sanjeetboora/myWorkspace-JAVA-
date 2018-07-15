package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sock_merchant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];

		int max = Integer.MIN_VALUE, returnvalue = 0;
		for (int i = 0; i < n; i++) {
			types[i] = in.nextInt();
			if (types[i] >= max) {
				max = types[i];
			}
		}
		int[] count = new int[max + 1];
		for (int i = 0; i < n; i++) {
			count[types[i]] += 1;
		}
		int ab = 0;
		for (int k = 0; k < max + 1; k++) {
			if (count[k] != 0 && count[k] % 2 == 0) {
				ab += count[k] / 2;
			}
			if (count[k] != 0 && count[k] % 2 != 0) {
				ab += (count[k] - 1) / 2;
			}

		}

		System.out.println(ab);
	}
}
