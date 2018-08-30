package Arrays;

import java.util.Scanner;

public class KSmallestPairs {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N1 = scn.nextInt();
		int arr1[] = new int[N1];
		int N2 = scn.nextInt();
		int arr2[] = new int[N2];
		int K = scn.nextInt();
		for (int i = 0; i < N1; i++) {
			arr1[i] = scn.nextInt();
		}
		for (int i = 0; i < N2; i++) {
			arr2[i] = scn.nextInt();
		}
		kSmallestPairs(arr1, arr2, N1, N2, K);

	}

	public static void kSmallestPairs(int arr1[], int arr2[], int N1, int N2, int K) {
		if (K > N1 * N2) {
			System.out.println("pairs doesn't exist");
			return;
		}
		int index[] = new int[N1];
		while (K > 0) {
			int minidx = 0, minSum = Integer.MAX_VALUE;
			
			for (int j = 0; j < N1; j++) {
				if (arr1[j] + arr2[index[j]] < minSum && index[j] < N2) {
					minidx = j;
					minSum = arr1[j] + arr2[index[j]];
				}
			}
			System.out.println("pair is " + arr1[minidx] + " and " + arr2[index[minidx]]);
			index[minidx]++;
			K--;
		}
	}

}
