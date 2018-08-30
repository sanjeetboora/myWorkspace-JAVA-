package Arrays;

import java.util.Scanner;
//Given an array arr[], find the maximum j – i such that arr[j] > arr[i].
public class maxIdxDiff_36 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(maxdiff(arr, N));
	}

	public static int maxdiff(int arr[], int n) {
		int maxdiff = -1;
		int minarr[] = new int[n];
		int maxarr[] = new int[n];
		minarr[0] = arr[0];
		maxarr[n - 1] = arr[n - 1];
		for (int i = 1; i < maxarr.length; i++) {
			minarr[i] = Math.min(minarr[i - 1], arr[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			maxarr[i] = Math.max(maxarr[i + 1], arr[i]);
		}
		int i = 0, j = 0;
		while (i < n && j < n) {
			if (minarr[i] < maxarr[j]) {
				maxdiff = Math.max(maxdiff, j - i);
				j++;
			} else {
				i++;
			}
		}
		return maxdiff;
	}
}
