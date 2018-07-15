package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class super_reduced_string {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(reduce(str));
	}

	public static String reduce(String s) {

		if (s.length() == 0)
			return "Empty String";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				a[i] = ' ';
				a[i + 1] = ' ';
				return reduce(new String(a).replaceAll(" ", ""));
			}
		}

		return new String(a).replaceAll(" ", "");
	}
}
