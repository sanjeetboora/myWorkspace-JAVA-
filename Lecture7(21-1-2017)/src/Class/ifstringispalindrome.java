package Class;

import java.util.Scanner;

public class ifstringispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(ifstringpalindrome(str));
	}

	public static boolean ifstringpalindrome(String str) {
		int length = str.length(), mid = length / 2;
		boolean val = true;
		for (int j = 0; j < mid; j++) {

			if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
				val = false;
				return val;

			}

		}
		return val;
	}
}