package Class;

import java.util.Scanner;

public class allIndexofanelement {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = takeinput();
		int data = scn.nextInt();
		display(allindex(arr, data, 0, 0));
	}

	public static int[] allindex(int[] arr, int num, int si, int count) {
		if (si == arr.length) {

			return new int[count];
		}

		int[] result = null;
		if (arr[si] == num)
			result = allindex(arr, num, si + 1, count + 1);
		else
			result = allindex(arr, num, si + 1, count);

		if (arr[si] == num) {
			result[count] = si;
		}
		if (result.length == 0 && si == 0) {
			System.out.println("-1");
		}
		return result;
	}

	public static void display(int[] arr) {
		for (int val : arr) {

			System.out.print(val + ",");
		}
	}

	public static int[] takeinput() {
		
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
