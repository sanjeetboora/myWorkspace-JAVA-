package practice;

import java.util.Scanner;

public class SpiralClockwise {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] mat1 = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat1[i][j] = scn.nextInt();
			}
		}
		// int[][] mat1 = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15,
		// 16, 17, 18 } };

		spiralPrint(mat1, rows, cols);
	}

	public static void spiralPrint(int[][] mat, int r, int c) {
		int sr = 0, sc = 0, er = r - 1, ec = c - 1, i = 0;
		while (sr <= er && sc <= ec) {
			i = sc;
			while (i <= ec) {
				System.out.println(mat[sr][i] + " ");
				i++;
			}
			sr++;
			i = sr;
			while (i <= er) {
				System.out.println(mat[i][ec] + " ");
				i++;
			}
			ec--;
			if (sr <= er) {
				i = ec;
				while (i >= sc) {
					System.out.println(mat[er][i] + " ");
					i--;
				}
				er--;
			}
			if (sc <= ec) {
				i = er;
				while (i >= sr) {
					System.out.println(mat[i][sc] + " ");
					i--;
				}
				sc++;
			}
		}
	}
}
