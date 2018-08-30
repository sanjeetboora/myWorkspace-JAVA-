package Arrays;

import java.util.Scanner;

//In a given array nums of positive integers, find three non-overlapping subarrays with maximum sum.
//Each subarray will be of size k, and we want to maximize the sum of all 3*k entries.Return the result
//as a list of indices representing the starting position of each interval (0-indexed). If there are multiple answers, return the lexicographically smallest one.
public class maxSum3NonOverlappingSubarrays_37 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		int sol[] = maxSum(arr, N, k);
		for (int i = 0; i < 3; i++) {
			System.out.print(sol[i] + " ");
		}
	}

	public static int[] maxSum(int arr[], int n, int k) {
		int result[] = new int[3];
		int sum[] = new int[n + 1];
		int left[] = new int[n];
		int right[] = new int[n];
		for (int i = 0; i < n; i++) {
			sum[i + 1] = sum[i] + arr[i];
		}
		for (int i = k, total = sum[k] - sum[0]; i < n; i++) {
			if (sum[i + 1] - sum[i + 1 - k] > total) {
				left[i] = i + 1 - k;
				total = sum[i + 1] - sum[i + 1 - k];
			} else {
				left[i] = left[i - 1];
			}
		}
		right[n - k] = n - k;
		for (int i = n - k - 1, total = sum[n] - sum[n - k]; i >= 0; i--) {
			if (sum[i + k] - sum[i] >= total) {
				right[i] = i;
				total = sum[i + k] - sum[i];
			} else {
				right[i] = right[i + 1];
			}
		}
		int maxsum = 0;
		for (int i = k; i < n - 2 * k; i++) {
			int l = left[i - 1], r = right[i + k];
			int total = sum[i + k] - sum[i] + sum[l + k] - sum[l] + sum[r + k] - sum[r];
			if (total > maxsum) {
				maxsum = total;
				result[0] = l;
				result[1] = i;
				result[2] = r;
			}
		}
		return result;
	}

}
