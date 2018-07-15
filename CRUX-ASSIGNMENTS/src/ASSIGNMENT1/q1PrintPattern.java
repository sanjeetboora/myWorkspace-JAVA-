package ASSIGNMENT1;

import java.util.*;

public class q1PrintPattern {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		printPattern1(num);
	}

	public static void printPattern1(int num) {
		for (int row = 1; row <= num; row++) {
			for (int spc = num - row - 1; spc >= 0; spc--) {
				System.out.print("  ");

			}
			for (int col = 0; col < row; col++) {
				System.out.print((row + col) + " ");
			}
			for (int col = row - 2; col >= 0; col--) {
				System.out.print((row + col) + " ");
			}
			System.out.println();
		}
	}
}
