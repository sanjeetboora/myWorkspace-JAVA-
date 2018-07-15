package array;

import java.util.*;
//https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
public class RotateSqMatrixBy90 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[][] mat = new int[num][num];
//		int mat[][] = { 
//				{ 1, 2, 3, 4 },
//				{ 5, 6, 7, 8 }, 
//				{ 9, 10, 11, 12 }, 
//				{ 13, 14, 15, 16 } 
//				};
		displayMatrix(mat);
		RotateBy90(mat, num);
		System.out.println("-------------AFTER 90 DEGREE ROTATION---------");
		displayMatrix(mat);
	}

	public static void RotateBy90(int[][] mat, int num) {
		for (int i = 0; i < num / 2; i++) {
			for (int k = i; k < num - i - 1; k++) {
				int temp = mat[i][k];
				mat[i][k] = mat[k][num - i - 1];
				mat[k][num - i - 1] = mat[num - 1 - i][num - 1 - k];
				mat[num - 1 - i][num - 1 - k] = mat[num - 1 - k][i];
				mat[num - 1 - k][i] = temp;
			}
		}
	}

	public static void displayMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
