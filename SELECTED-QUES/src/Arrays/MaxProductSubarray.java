package Arrays;

import java.util.Scanner;

public class MaxProductSubarray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(maxProductSubarray(arr, n));

	}

	public static int maxProductSubarray(int arr[], int n) {
		int maxproduct = arr[0];
		int maxpos = arr[0];
		int minneg = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int maxcurrpos = Math.max(Math.max(maxpos * arr[i], minneg * arr[i]), arr[i]);
			int mincurrneg = Math.min(Math.min(maxpos * arr[i], minneg * arr[i]), arr[i]);
			maxproduct = Math.max(maxcurrpos, mincurrneg);
			maxpos = maxcurrpos;
			minneg = mincurrneg;
		}
		return maxproduct;
	}

}
