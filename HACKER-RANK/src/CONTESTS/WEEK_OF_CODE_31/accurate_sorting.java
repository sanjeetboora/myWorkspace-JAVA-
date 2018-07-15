package CONTESTS.WEEK_OF_CODE_31;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class accurate_sorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int n = in.nextInt();
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = in.nextInt();

			}
			answer_btao(arr);
		}
	}

	public static void answer_btao(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] + 1) {

				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
			if (arr[i] > arr[i + 1]) {
				flag = false;
				System.out.println("No");
				break;

			}
		}

		if (flag == true) {
			System.out.println("Yes");
		}
	}
}
