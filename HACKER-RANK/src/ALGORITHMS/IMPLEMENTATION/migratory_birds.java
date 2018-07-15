package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class migratory_birds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		int[] count = new int[6];
		for (int i = 0; i < n; i++) {
			types[i] = in.nextInt();
			count[types[i]] += 1;
		}
		int max = Integer.MIN_VALUE, returnvalue = 0;
		for (int i = 0; i < 6; i++) {
			if (count[i] >= max) {
				max = count[i];
			}
		}
		for (int j = 0; j < 6; j++) {
			if (count[j] == max) {
				returnvalue = j;
			break;
			}
		}

		System.out.println(returnvalue);
	}
}