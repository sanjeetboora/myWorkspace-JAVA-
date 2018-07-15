package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;

public class utopian_tree {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		for (int i = 0; i < n; i++) {
			types[i] = in.nextInt();
		}
		int j = 0;

		while (j < n) {
			int val = 1;
			for (int k = 0; k < types[j]; k++) {
				if (k % 2 == 0) {
					val = val * 2;
				}
				if (k % 2 != 0) {
					
					val = val + 1;
				}
			}
			System.out.println(val);
			j++;
		}

	}
}
