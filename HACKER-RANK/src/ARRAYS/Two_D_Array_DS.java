package ARRAYS;

import java.util.Scanner;

public class Two_D_Array_DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 6; col++) {
				arr[row][col] = scn.nextInt();
			}

		}
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1]
						+ arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
				System.out.println(arr[row][col] + " " + arr[row][col + 1] + " " + arr[row][col + 1]);
				System.out.println(arr[row + 1][col + 1]);
				System.out.println(arr[row + 2][col] + " " + arr[row + 2][col + 1] + " " + arr[row + 2][col + 2]);
				if (sum > max) {
					max = sum;
				}
				System.out.println("////////////////////////////");

				System.out.println(max);
				System.out.println("////////////////////////////");
			}

		}
		System.out.println(max);
	}

}
