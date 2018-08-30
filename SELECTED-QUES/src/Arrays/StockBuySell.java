package Arrays;

import java.util.*;

class Interval {
	int buy;
	int sell;
}

public class StockBuySell {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		stocks(arr, N);

	}

	public static void stocks(int arr[], int N) {
		if (N == 1) {
			return;
		}
		Interval profit[] = new Interval[N];
		int i = 0, j = N - 1, count = 0;
		;
		while (i < N - 1) {
			while ((i < N - 1) && (arr[i] >= arr[i + 1])) {
				i++;
			}
			if (i == N - 1) {
				break;
			}
			Interval e = new Interval();
			e.buy = i++;
			while ((i < N) && (arr[i] >= arr[i - 1])) {
				i++;
			}

			e.sell = i-1;
			profit[count] = e;
			count++;
		}
		for (int k = 0; k < count; k++) {
			System.out.println("buy : " + profit[k].buy + " & sell : " + profit[k].sell);
		}

	}
}
