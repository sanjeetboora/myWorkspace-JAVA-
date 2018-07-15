package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class designer_pdf_viewer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] h = new int[26];
		for (int h_i = 0; h_i < 26; h_i++) {
			h[h_i] = in.nextInt();
		}//
		
		String word = in.next();
		answer_btao(h, word);
	}

	public static void answer_btao(int[] arr, String word) {
		int[] arr_max = new int[word.length()];
		for (int i = 0; i < word.length(); i++) {
			int charac = word.charAt(i) - 'a';
			arr_max[i] = arr[charac];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < word.length(); i++) {

			if (arr_max[i] >= max) {
				max = arr_max[i];
			}
		}
		int area = max * word.length();
		System.out.println(area);
	}
}
