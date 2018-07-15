package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class picking_numbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[101];
		for (int i = 0; i < n; i++) {
			int input = in.nextInt();
			arr[input]++;

		}
		int max = 0;
		for (int j = 0; j < 100; j++) {
			if (arr[j] + arr[j + 1] > max) {
				max = arr[j] + arr[j + 1];
			}
		}
		System.out.println(max);

	}
}
