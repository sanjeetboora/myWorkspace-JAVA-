package Arrays;

import java.util.Scanner;

public class minSwapstoBringElementsTogether {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();

		}
		System.out.println(minswap(arr, N, k));
	}

	public static int minswap(int arr[], int n, int k) {
		int result = 0, count = 0, extra = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] <= k) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			if (arr[i] > k) {
				extra++;
			}
		}
		result = extra;
		for (int i = 0, j = count; j < n; j++, i++) {
			if (arr[i] > k) {
				extra--;
			}
			if (arr[j] > k) {
				extra++;
			}
			result = Math.min(result, extra);
		}
		return result;
	}
}
