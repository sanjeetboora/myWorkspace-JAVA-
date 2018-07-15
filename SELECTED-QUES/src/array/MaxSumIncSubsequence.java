package array;

import java.util.Scanner;

//https://www.geeksforgeeks.org/dynamic-programming-set-14-maximum-sum-increasing-subsequence/
public class MaxSumIncSubsequence {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();

		}
		System.out.println(MaxSumLIS(arr, num));
	}

	public static int MaxSumLIS(int[] arr, int num) {
		int max = arr[0];
		int[] output = new int[num];
		for (int i = 0; i < output.length; i++) {
			output[i] = arr[i];
			for (int k = 0; k < i; k++) {
				if ((arr[i] > arr[k]) && (output[i] < (output[k] + arr[i]))) {
					output[i] = arr[i] + output[k];
				}
			}
		}
		for (int m = 0; m < output.length; m++) {
			if (max < output[m]) {
				max=output[m];
			}
		}
		return max;
	}

}
