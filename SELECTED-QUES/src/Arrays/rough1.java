package Arrays;

import java.util.*;

public class rough1 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 6, 3, 6 };
		int arrSize = arr.length;
		printSubArrays(arr, arrSize);

	}

	public static void printSubArrays(int[] arrA, int arrSize) {

		int minidx = 0, maxidx = 1, maxand = 0;
		for (int startPoint = 0; startPoint < arrSize; startPoint++) {
			// group sizes
			for (int grps = startPoint; grps <= arrSize; grps++) {
				int arr[] = new int[grps - startPoint + 1];
				int k = 0;
				for (int j = startPoint; j < grps; j++) {
					arr[k] = arrA[j];
					k++;
				}
				int max = maxfunc(arr)[0];
				if (max != -1) {

					if (max >= maxand) {
						if (max == maxand) {
							int a = maxfunc(arr)[1] + startPoint;
							int b = maxfunc(arr)[2] + startPoint;
							if (a <= minidx && b <= maxidx) {
								minidx = a;
								maxidx = b;
							}
						}
					}
				}

			}
		}
		System.out.println(minidx);
		System.out.println(maxidx);

	}

	public static int[] maxfunc(int arr[]) {
		int n = arr.length;
		int a[] = new int[3];
		if (n <= 1) {
			for (int i = 0; i < 3; i++) {
				a[i] = -1;

			}
			return a;
		}
		int b[] = arr;
		Arrays.sort(b);
		a[0] = (b[n - 1] & b[n - 2]);
		for (int i = 0; i < n; i++) {
			if (arr[i] == b[n - 2]) {
				a[1] = i;
			}
			if (arr[i] == b[n - 1]) {
				a[2] = i;
			}
		}
		return a;
	}
}
