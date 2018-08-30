package Arrays;

import java.util.Scanner;

public class stockSellBuyKtimes {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		int N = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(stocks(arr, N, k));

	}

	public static int stocks(int arr[], int n, int k) {
		int profits[][] = new int[k + 1][n + 1];
		for (int i = 0; i <= k; i++) {
			profits[i][0] = 0;
		}
		for (int i = 0; i <= n; i++) {
			profits[0][i] = 0;
		}
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j < n; j++) {
				int max = 0;
				for (int l = 0; l < j; l++) {
					max = Math.max(profits[i - 1][l] + (arr[j] - arr[l]), max);
					profits[i][j] = Math.max(max, profits[i][j - 1]);
				}
			}
		}
		return profits[k][n - 1];
	}
}
