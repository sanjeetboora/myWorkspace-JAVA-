package array;

import java.util.Scanner;

//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
public class equilibriumIndex {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] arr = new int[num]; // {-7, 1, 5, 2, -4, 3, 0};
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();

		}
		System.out.println(equilibriumIdx(arr, num));

	}

	public static int equilibriumIdx(int[] arr, int num) {
		int leftsum = 0, sum = 0;
		for (int i = 0; i < num; i++) {
			sum += arr[i];

		}
		for (int k = 0; k < num; k++) {
			sum -= arr[k];
			if (sum == leftsum) {
				return k;
			}
			leftsum += arr[k];

		}
		return -1;
	}

}
