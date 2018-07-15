package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;

public class library_fine {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner s = new Scanner(System.in);
		int d1 = s.nextInt();
		int m1 = s.nextInt();
		int y1 = s.nextInt();
		int d2 = s.nextInt();
		int m2 = s.nextInt();
		int y2 = s.nextInt();
		int fine = (y1 > y2) ? 10000
				: (y1 == y2) && (m1 > m2) ? ((m1 - m2) * 500)
						: (y1 == y2) && (m1 == m2) && (d1 > d2) ? ((d1 - d2) * 15) : 0;
		System.out.println(fine);
	}
}