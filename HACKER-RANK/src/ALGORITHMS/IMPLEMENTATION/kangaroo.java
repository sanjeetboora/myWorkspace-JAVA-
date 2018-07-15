package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		result_bta(x1, v1, x2, v2);
	}

	public static void result_bta(int x1, int v1, int x2, int v2) {
		
		boolean condition = false;

		while ((x1 > x2 && v1 < v2) || (x1 < x2 && v1 > v2)) {
			x1 += v1;
			x2 += v2;
			if (x1 == x2) {
				System.out.println("YES");
				condition = true;
			}
		}
		if (condition == false)
			System.out.println("NO");

		
	}

}
