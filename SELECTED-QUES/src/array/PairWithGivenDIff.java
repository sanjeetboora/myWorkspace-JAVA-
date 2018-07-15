package array;

import java.util.Arrays;
import java.util.Scanner;
//https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/
public class PairWithGivenDIff {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();

		}
		int givensum=scn.nextInt();
		pairWithDiff(arr, givensum);
	}

	public static void pairWithDiff(int[] arr, int givensum) {
		Arrays.sort(arr);
		int var1 = 0;
		for (int i = 1; i < arr.length; i++) {
			if ((arr[i] - arr[var1]) > givensum) {
				var1++;
			} else if ((arr[i] - arr[var1]) == givensum) {
				System.out.println("pair found " + arr[var1] + " and " + arr[i]);
				return;
			}
		}
		System.out.println("pair doesn't exist");
	}

}
