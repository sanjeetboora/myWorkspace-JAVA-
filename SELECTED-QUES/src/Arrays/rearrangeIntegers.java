package Arrays;

import java.util.*;

public class rearrangeIntegers {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		rearrange(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void rearrange(int arr[], int n) {
		int pivot = 0;
		int si = 0, i = 0;
		while (i < n) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[si];
				arr[si] = temp;
				si++;
			}
			i++;
		}
		for (int l = 0; l < n; l++) {
			System.out.print(arr[l] + ", ");
		}
		System.out.println(si + " si ");
		for (int j = 0; j < n && si < n; j++) {
			if ((j % 2 == 0) && arr[j] < 0) {
				int temp = arr[j];
				arr[j] = arr[si];
				arr[si] = temp;
				si++;
			}
		}

	}
}
