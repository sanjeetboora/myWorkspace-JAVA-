package ASSIGNMENT1;

import java.util.Scanner;

public class q7patternBox {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		patternBox(num);
	}

	public static void patternBox(int num) {
		for (int row = 0; row <= num / 2; row++) {
			for (int col1 = num / 2 - row; col1 >= 0; col1--) {
				System.out.print("*");
			}
			for (int col2 = 1; col2 <= (row*2); col2++) {
				System.out.print(" ");
			}
			for (int col3 = num / 2 - row; col3 >=0 ; col3--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = 0; row <= num / 2; row++) {
			for (int col1 = 0; col1 <= num / 2 - row; col1++) {
				System.out.print("*");
			}
			for (int col2 = 1; col2 <= (row*2); col2++) {
				System.out.print(" ");
			}
			for (int col3 = num / 2 - row; col3 >=0 ; col3--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
