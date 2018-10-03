package practice;

import java.util.*;

public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long x = scn.nextLong();
		int n = scn.nextInt();
		int count = 1;
		long q;
		if (x == n)
			System.out.print(count);
		else {
			q = x / n;
			do {
				q = q / n;
				count++;
			} while (q >= n);

			System.out.print(count);
		}

	}

}
