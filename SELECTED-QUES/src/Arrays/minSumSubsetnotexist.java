package Arrays;

import java.util.Scanner;

public class minSumSubsetnotexist {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(minSum(arr, N));
	}

	public static int minSum(int arr[], int n) {
		int sum = 1;
		for (int i = 0; i < n && arr[i] <= sum; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
