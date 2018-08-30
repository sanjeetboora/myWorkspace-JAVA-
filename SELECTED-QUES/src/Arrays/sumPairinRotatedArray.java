package Arrays;

import java.util.Scanner;

public class sumPairinRotatedArray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int N = scn.nextInt();
		 int arr[] = new int[N];
		 int sum = scn.nextInt();
		 for (int i = 0; i < N; i++) {
		 arr[i] = scn.nextInt();
		 }
		System.out.println(sumPair(arr, N, sum));
	}

	public static boolean sumPair(int arr[], int N, int sum) {
		int i = 0;
		for (i = 0; i < N; i++) {
			if (arr[i] > arr[i + 1]) {
				break;
			}
		}
		int lidx = (i + 1) % N;
		int ridx = i;

		while (lidx != ridx) {
			if (arr[lidx] + arr[ridx] == sum) {
				return true;
			}
			if (arr[lidx] + arr[ridx] < sum) {
				lidx = (lidx + 1) % N;
			} else {
				ridx = (N + ridx - 1) % N;
			}
		}
		return false;
	}

}
