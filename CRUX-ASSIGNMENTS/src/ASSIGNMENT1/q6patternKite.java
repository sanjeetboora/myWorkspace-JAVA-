package ASSIGNMENT1;

import java.util.Scanner;

public class q6patternKite {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		printpatternKite(num);
	}

	public static void printpatternKite(int num) {
		for (int row = 1; row < num/2; row++) {
			for (int col = num/2 - row; col >= 0; col--) {
				System.out.print(" ");
			}
			for (int col1 = 1; col1 <= row; col1++) {
				System.out.print("*");
			}
			for (int col2 = 1; col2 <= row-1; col2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = 1; row <=num/2; row++) {
			for (int col1 = 1; col1<=row ; col1++) {
				System.out.print(" ");
			}
			for (int col = num/2-row; col >= 0; col--) {
				System.out.print("*");
			}
			for (int col = num/2-row; col >= 1; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
