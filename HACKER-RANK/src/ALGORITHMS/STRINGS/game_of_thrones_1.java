package ALGORITHMS.STRINGS;

import java.util.ArrayList;
import java.util.Scanner;

public class game_of_thrones_1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String data = scn.nextLine();
		boolean flag = false;

		if (ispalindrome(data)) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}
	}

	public static boolean ispalindrome(String str) {
		boolean flag = false, pal = true;
		;
		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-97] += 1;
		}
		for (int j = 0; j < 26; j++) {
			if (arr[j] != 0) {
				if (arr[j] % 2 == 0) {
				} else {
					if (!flag && arr[j] % 2 == 1) {
						flag = true;
					} else {
						pal = false;
					}
				}
			}
		}
		return pal;
	}
}
