package lunchtime2018;

import java.util.Scanner;
//aues 3https://ide.codingblocks.com/#/s/29185;
public class judgintgDelay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long x = scn.nextLong();
	

		for (long j = 0; j < x; j++) {
			long n = scn.nextLong();
			long count = 0;
			for (long i = 0; i < n; i++) {
				long n1 = scn.nextLong();
				long n2 = scn.nextLong();
				if ((n2 - n1) > 5) {
					count++;
				}
			}
			System.out.println(count);
		}

	}
}


