package Arrays;

import java.util.Scanner;

public class RotateMatrix {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
//		int arr[][] = new int[N][N];
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = scn.nextInt();
//			}
//		}
		int arr[][]=   {
			            {1, 2, 3, 4},
			            {5, 6, 7, 8},
			            {9, 10, 11, 12},
			            {13, 14, 15, 16}};
		rotateMatrix(arr, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void rotateMatrix(int arr[][], int N) {
		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - i - 1; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][N - i - 1];
				arr[j][N - i - 1] = arr[N - i - 1][N - 1 - j];
				arr[N - i - 1][N - 1 - j] = arr[N - j - 1][i];
				arr[N - j - 1][i] = temp;
				;

			}
		}
	}

}
