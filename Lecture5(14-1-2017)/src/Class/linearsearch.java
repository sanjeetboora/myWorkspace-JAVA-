package Class;

import java.util.Scanner;

public class linearsearch {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int N = scn.nextInt();
		int[] arr = takeinput();
		System.out.println(linearSearch(arr, N));
	}
	public static int[] takeinput() {
		int[] rv = null;
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}
	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}
		return -1;
	}
}