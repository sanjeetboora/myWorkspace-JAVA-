package Arrays;

import java.util.Scanner;

public class bitonicSubarrayMaxlen {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(bitonic(arr, n));
	}

	public static int bitonic(int arr[], int n) {
		if (n == 0) {
			return 0;
		}
		int incstart = 0, decstart = 0, i = 0, maxLen = 1;
		while (i < n - 1) {
			while ((i < n - 1) && (arr[i] <= arr[i + 1])) {
				i++;
			}
			while ((i < n - 1) && (arr[i] > arr[i + 1])) {
				decstart = i + 1;
				i++;
			}
			maxLen = Math.max(maxLen, i - (incstart - 1));
			incstart = decstart;
		}
		return maxLen;
	}
}
