package Arrays;

import java.util.Scanner;

//Given an array of positive integers. We need to make the given array a ‘Palindrome’. Only allowed operation on array is merge. Merging two adjacent elements means replacing them with their sum. The task is to find minimum number of merge operations required to make given array a ‘Palindrome’.
public class minMergeForPalindrome_41 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(minOps(arr, N));
	}

	public static int minOps(int arr[], int n) {
		int ops = 0;
		for (int i = 0, j = n - 1; i <= j;) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else if (arr[i] < arr[j]) {
				i++;
				arr[i] += arr[i - 1];
				ops++;
			} else {
				j--;
				arr[j] += arr[j + 1];
				ops++;
			}
		}
		return ops;
	}

}
