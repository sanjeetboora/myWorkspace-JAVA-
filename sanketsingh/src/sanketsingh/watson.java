package sanketsingh;

import java.util.Scanner;

public class watson {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int[] A = takeinput(N);
		abc( A, N);
		 display(A);
	}


	public static void abc(int[] A,int N){
		int i = 0;

		while (i < N) {

			if (i % 2 != 0) {
				int j = 1;
				while (j < N - 1) {
					if (A[j] > A[j + 1]) {
						swap(A,j, j + 1);
						
					}
					j = j + 2;
				}
			}

					else {
						int j = 0;
						while (j < N - 1) {
							if (A[j] > A[j + 1]) {
								swap(A,j, j + 1);
							}
							j = j + 2;
						}
					}
			i = i + 1;
				}
		

	}
	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void display(int[] arr) {

		for (int val : arr) {
			
			System.out.print(val + " ");
		}
		
	}

	public static int[] takeinput(int size) {
		
		int[] rv = null;

		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}
}
