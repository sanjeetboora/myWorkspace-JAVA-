package Arrays;

import java.util.*;

public class segregate0and1 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		segregate(arr, 0, n - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ", ");
		}

	}

	public static void segregate(int arr[], int left, int right) {
		while (left < right) {
			if (arr[left] == 1) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
			} else {
				left++;
			}
		}
	}

}
