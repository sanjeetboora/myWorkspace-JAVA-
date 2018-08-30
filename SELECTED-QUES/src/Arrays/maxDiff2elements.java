package Arrays;

import java.util.Scanner;

public class maxDiff2elements {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();

		}

		System.out.println(maxdiff(arr, N, k));
	}

	public static int maxdiff(int arr[], int n, int k) {
		int max = arr[0], max_indx = 0, min = arr[0], min_indx = 0;
		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
				max_indx = i;
			}
			if (min > arr[i]) {
				min = arr[i];
				min_indx = i;
			}
		}
		int ans = max - min;
		if (k < max) {
			arr[max_indx] -= k;
			max = arr[max_indx];
			arr[min_indx] += k;
			min = arr[min_indx];
			if (min > max) {
				int temp = max;
				max = min;
				min = temp;
				int index = max_indx;
				max_indx = min_indx;
				min_indx = index;
				ans = max - min;
			}

			for (int i = 0; i < n; i++) {
				if (i != min_indx && i != max_indx) {
					int sub = arr[i] - k, add = arr[i] + k;
					if (sub >= min || add <= max)
						continue;
					if (max - sub <= add - min)
						min = sub;
					else
						max = add;
				}
			}
		}
		ans = Math.min(ans, max - min);
		return ans;
	}
}
