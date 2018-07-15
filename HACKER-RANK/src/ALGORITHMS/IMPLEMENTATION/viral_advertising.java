package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class viral_advertising {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int m = 5, count = 0;
		for (int i = 0; i < num; i++) {

			m = (m / 2);
			count += m;
			m = m * 3;

		}System.out.println(count);
	}

}
