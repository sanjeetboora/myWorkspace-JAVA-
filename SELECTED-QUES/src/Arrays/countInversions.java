package Arrays;

import java.util.Scanner;

public class countInversions {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(inversions(arr, 0, n - 1));

	}

	public static int inversions(int arr[], int low, int high) {
		int result = 0;
		if (low < high) {
			int mid = (low + high) / 2;
			result += inversions(arr, low, mid);
			result += inversions(arr, mid + 1, high);
			result += merge(arr, low, mid, high);

		}
		return result;
	}

	public static int merge(int arr[], int low, int mid, int high) {
		int count = 0, idx = 0, l = low, m = mid + 1;
		int temp[] = new int[high - low + 1];
		if (low <= mid && mid < high) {
			while (l <= mid && m <= high) {
				if (arr[l] > arr[m]) {
					count += (mid - l + 1);
					m++;
				} else {
					l++;
				}
			}
		}
		return count;
	}

}