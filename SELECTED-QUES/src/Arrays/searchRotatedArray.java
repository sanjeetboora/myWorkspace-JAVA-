package Arrays;

import java.util.Scanner;

public class searchRotatedArray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		int key = scn.nextInt();
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int idx = searchElement(arr, 0, N, key);
		if (idx == -1) {
			System.out.println("key not found");
		} else {
			System.out.println(idx);
		}

	}

	public static int searchElement(int arr[], int low, int high, int key) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == key) {
			return mid;
		}
		if (arr[low] <= arr[mid]) {
			if (key >= arr[low] && key <= arr[mid]) {
				return searchElement(arr, low, mid - 1, key);
			} else {
				return searchElement(arr, mid + 1, high, key);
			}
		} else {
			if (key >= arr[mid] && key <= arr[high]) {
				return searchElement(arr, mid + 1, high, key);
			} else {
				return searchElement(arr, low, mid - 1, key);
			}
		}
	}

}
