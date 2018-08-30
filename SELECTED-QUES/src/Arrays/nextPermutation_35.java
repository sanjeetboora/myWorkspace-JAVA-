package Arrays;

import java.util.*;

public class nextPermutation_35{
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		nextPermutation(arr, N);
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void nextPermutation(int arr[], int n) {
		int i = n - 1;
		for (i = n - 1; i > 0; i--) {
			if (arr[i - 1] < arr[i]) {
				break;
			}
		}
		if (i == 0) {
			reversesort(arr, 0, n - 1);
			return;
		} else {
			int num = arr[i - 1];
			int j = n - 1;
			for (j = n - 1; j >= i; j--) {
				if (num < arr[j]) {
					break;
				}
			}
			int tmp = arr[i - 1];
			arr[i - 1] = arr[j];
			arr[j] = tmp;
			reversesort(arr, i, n - 1);
		}
	}

	public static void reversesort(int[] arr, int start, int end) {
		if (start > end)
			return;
		for (int i = start; i <= (end + start) / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[start + end - i];
			arr[start + end - i] = tmp;
		}
	}

}
