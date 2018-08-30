package Arrays;

import java.util.Scanner;

public class StockSellBuy2 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(stocks(arr, N));

	}
	public static int stocks(int arr[],int n) {
		int max=arr[n-1],min=arr[0];
		int prof[] = new int[n];
		for (int i = n-2; i >=0; i--) {
			if(max<arr[i]) {
				max=arr[i];
			}
			prof[i]=Math.max(prof[i+1], max-arr[i]);
		}
		for (int i = 1; i < n; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			prof[i]=Math.max(prof[i-1],prof[i]+arr[i]-min);
		}
		return prof[n-1];
	}

}
