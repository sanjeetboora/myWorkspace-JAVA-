package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class hackerrank_is_a_string {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			System.out.println(checkIfIsHacker(s));
			// your code goes here
		}
	}

	public static String checkIfIsHacker(String s) {

		String str = "hackerrank";
		if (s.length() < str.length()) {
			return "NO";
		}
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (j < str.length() && s.charAt(i) == str.charAt(j)) {
				j++;
			}
		}
		return (j == str.length() ? "YES" : "NO");

	}
}
