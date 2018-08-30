package Arrays;

import java.util.Scanner;

public class reorderArray_42 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int idxarr[] = new int[N];
		for (int i = 0; i < N; i++) {
			idxarr[i] = scn.nextInt();
		}

		reorder(arr, idxarr, N);
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			System.out.print(idxarr[i] + " ");
		}
	}

	public static void reorder(int arr[], int idxarr[], int n) {
		for (int i = 0; i < n; i++) {
			while (idxarr[i] != i) {
				int temp = idxarr[idxarr[i]];
				int tempidx = arr[idxarr[i]];
				arr[idxarr[i]] = arr[i];
				idxarr[idxarr[i]] = idxarr[i];
				idxarr[i] = temp;
				arr[i] = tempidx;
			}
		}
	}

}
