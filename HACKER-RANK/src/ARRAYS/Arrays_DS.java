package ARRAYS;

import java.util.Scanner;

public class Arrays_DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int len = scn.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scn.nextInt();
		}
		for (int j = len - 1; j >= 0; j--) {
			System.out.println(arr[j]);
		}

	}

}
