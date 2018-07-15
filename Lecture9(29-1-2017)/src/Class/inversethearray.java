package Class;

import java.util.Scanner;

public class inversethearray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = {2,3,1,0,4};
		int data = scn.nextInt();
		display(reversearray(arr, 0));
	}

	public static int[] reversearray(int[] arr, int si) {
		if (si == arr.length) {

			return new int[si];
		}

		int[] result = null;
		result = reversearray(arr, si + 1);
		result[arr[si]] = si;
		
		return result;
	}

	public static void display(int[] arr) {
		for (int val : arr) {

			System.out.print(val + ",");
		}
	}

	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
		int[] rv = null;
		System.out.println("enter size of array");
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter " + i + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

}
