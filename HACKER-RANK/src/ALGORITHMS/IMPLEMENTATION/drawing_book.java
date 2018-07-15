package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class drawing_book {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		answer_bta(n, p);
		// your code goes here
	}

	public static void answer_bta(int total, int page) {
		int turn = 0;
		if (page <= total / 2) {
			if (page % 2 != 0) {
				turn = (page - 1) / 2;
			} else if (page % 2 == 0) {
				turn = page / 2;
			}
		}
		if (page > total / 2) {
			int ab = total - page;
			if (ab % 2 != 0) {
				turn = (ab - 1) / 2;
			} else if (ab % 2 == 0) {
				turn = ab / 2;
			}
		}
		System.out.println(turn);
	}

}
