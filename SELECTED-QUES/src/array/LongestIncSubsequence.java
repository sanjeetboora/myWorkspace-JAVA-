package array;

import java.util.Scanner;

public class LongestIncSubsequence {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();

		}
		System.out.println(LIS(arr, num));
	}

	public static int LIS(int[] arr, int num) {
		int[] output = new int[num];
		output[0] = 1;
		for (int i = 1; i < output.length; i++) {
			output[i] = 1;
			for (int k = i - 1; k >= 0; k--) {
				if (arr[k] > arr[i]) {
					continue;
				}
				int res = output[k] + 1;
				if (res > output[i]) {
					output[i] = res;
				}

			}
		}
		int max = output[0];
		for (int l = 0; l < output.length; l++) {
			if (output[l] > max) {
				max = output[l];

			}
		}
		return max;
	}

}
