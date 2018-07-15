package sanketsingh;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long t = scn.nextLong();
		for (int k = 0; k < t; k++) {
			int s = scn.nextInt();
			int n = scn.nextInt();
			int[] sic = new int[n];
			for (int i = 0; i < n; i++) {
				sic[i] = scn.nextInt();
			}
			int[] res = new int[n * s];
			for (int i = 0; i < res.length; i++) {
				res[i] = scn.nextInt();
			}
			int c = 0;
			for (int i = 0; i < res.length; i += n) {
				for (int j = i; j < i + n; j++) {
					if (sic[res[j] - 1] > 0) {
						System.out.print(res[j] + " ");
						sic[res[j] - 1]--;
						break;
					} else if (sic[res[j] - 1] == 0) {
						c++;
						if (c == n) {
							System.out.print("0 ");
						}
					} else {
						continue;
					}
				}
			}
			System.out.println();
		}
	}
}
// code
// Scanner scn = new Scanner(System.in);
// int T = scn.nextInt();
// for (int i = 0; i < T; i++) {
// int M = scn.nextInt();
// int N = scn.nextInt();
// int[] seatsav = new int[N];
// for (int j = 0; j < N; j++) {
// seatsav[j] = scn.nextInt();
// }
// int[] choices = new int[M * N];
// for (int k = 0; k < M * N; k++) {
// choices[k] = scn.nextInt();
// }
// answer(M, N, seatsav, choices);
// }
//
// }
//
// public static void answer(int M, int N, int[] seatsav, int[] choices) {
// ArrayList<Integer> arr = new ArrayList<>();
// for (int x = 0; x < M; x++) {
// for (int y = 0; y < N; y++) {
// if (seatsav[choices[y]] != 0) {
// arr.add(choices[y]);
// break;
// }
//
// }
// }
// System.out.println(arr);
// }
// }
