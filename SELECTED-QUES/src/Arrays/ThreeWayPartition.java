package Arrays;

import java.util.*;

public class ThreeWayPartition {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int lowVal = scn.nextInt();
		int highVal = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		partition(arr, n, lowVal, highVal);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void partition(int arr[], int n, int lowVal, int highVal) {
		int si = 0, ei = n - 1;
		for (int i = 0; i <= ei; i++) {
			if (arr[i] < lowVal) {
				int temp = arr[i];
				arr[i] = arr[si];
				arr[si] = temp;
				si++;
			} else if (arr[i] > highVal) {
				int temp = arr[i];
				arr[i] = arr[ei];
				arr[ei] = temp;
				ei--;
				i--;
			}
		}

	}
}
