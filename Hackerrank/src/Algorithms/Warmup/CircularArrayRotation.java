package Warmup;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int y = 0;

		y = k % n;
		for (int i = 0; i < q; i++) {
			int data = in.nextInt();
			if (data < y) {
				System.out.println(arr[n - y + data]);
			} else {
				System.out.println(arr[Math.abs(y - data)]);
			}
		}

	}

}
