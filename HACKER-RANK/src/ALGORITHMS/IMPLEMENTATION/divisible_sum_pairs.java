package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class divisible_sum_pairs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		result_btao(k, a);
	}

	public static void result_btao(int devide, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum % devide == 0 && i < j) {
					//System.out.println(arr[i] + "and " + arr[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}