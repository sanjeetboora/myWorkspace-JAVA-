package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class sequence_equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int arr[] = new int[num + 1];

		int[] p_inverse = new int[num + 1];
		for (int x = 1; x <= num; x++) {
			int px = scn.nextInt();
			p_inverse[px] = x;
		}

		/* Calculate and print each y */
		for (int x = 1; x <= num; x++) {
			int y = p_inverse[p_inverse[x]];
			System.out.println(y);
		}
	}
}
