package Arrays;

import java.util.Scanner;

public class sortarr012 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		sortarr(arr, n - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void sortarr(int arr[], int size) {
		int idx0 = 0, idx1 = 0, idx2 = size;
		while (idx1 <= idx2) {
			if (arr[idx1] == 0) {
				int temp = arr[idx0];
				arr[idx0] = arr[idx1];
				arr[idx1] = temp;
				idx0++;
				idx1++;
			} else if (arr[idx1] == 2) {
				int temp = arr[idx1];
				arr[idx1] = arr[idx2];
				arr[idx2] = temp;
				idx2--;
			} else if (arr[idx1] == 1) {
				idx1++;
			}

		}
	}

}
