package Arrays;

import java.util.Scanner;

public class maxSumRotation {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(rotationSum(arr, N));

	}

	public static int rotationSum(int arr[], int N) {
		int arrSum = 0, rotSum = 0;
		for (int i = 0; i < N; i++) {
			arrSum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			rotSum += arr[i] * i;
		}
		int maxSum = rotSum;
		for (int i = 1; i < arr.length; i++) {
			int Sum = rotSum - (arrSum - arr[i - 1]) + arr[i - 1] * (N - 1);
			maxSum = Math.max(Sum, maxSum);
		}
		return maxSum;
	}
}
