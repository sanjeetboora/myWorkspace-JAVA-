package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hurdle_race {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		answer_btao(n, k, height);
	}

	public static void answer_btao(int n, int k, int[] height) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (height[i] >= max) {
				max = height[i];
			}
		}
		int num = max - k;
		if (num < 0) {
			num = 0;
		}
		System.out.println(num);
	}
}
