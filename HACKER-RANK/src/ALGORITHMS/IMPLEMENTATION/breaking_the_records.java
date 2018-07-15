package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class breaking_the_records {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		result_btao(score, score[0], score[0]);
		// your code goes here
	}

	public static void result_btao(int[] arr, int high, int low) {
		int lowcount = 0;
		int highcount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < low) {
				low = arr[i];
				lowcount++;
			}
			if (arr[i] > high) {
				high = arr[i];
				highcount++;
			}
		}
		System.out.println(highcount + " " + lowcount);

	}
}
