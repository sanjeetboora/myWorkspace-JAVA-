package Arrays;

import java.util.Scanner;

public class generatePossiblesortedarrays {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		int arr1[] = new int[N1];
		int arr2[] = new int[N2];
		for (int i = 0; i < N1; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < N2; i++) {
			arr2[i] = scn.nextInt();
		}
		int arr3[] = new int[N1 + N2];
		sortedSubarrays(arr1, arr2, arr3, 0, N1, 0, N2, 0, true);
	}

	public static void sortedSubarrays(int arr1[], int arr2[], int arr3[], int start1, int n1, int start2, int n2,
			int start3, boolean flag) {
		if (flag) {
			if (start3 != 0) {
				print(arr3, start3 + 1);
			}
			for (int i = start1; i < n1; i++) {
				if (start3 == 0) {
					arr3[start3] = arr1[i];
					sortedSubarrays(arr1, arr2, arr3, i + 1, n1, start2, n2, start3, !flag);
				} else if (arr1[i] > arr3[start3]) {
					arr3[start3 + 1] = arr1[i];
					sortedSubarrays(arr1, arr2, arr3, i + 1, n1, start2, n2, start3 + 1, !flag);
				}
			}
		} else {
			for (int i = start2; i < n2; i++) {
				if (arr2[i] > arr3[start3]) {
					arr3[start3 + 1] = arr2[i];
					sortedSubarrays(arr1, arr2, arr3, start1, n1, i + 1, n2, start3 + 1, !flag);
				}
			}

		}
	}

	public static void print(int arr[], int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
