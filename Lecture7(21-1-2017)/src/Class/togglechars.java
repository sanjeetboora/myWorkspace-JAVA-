package Class;

import java.util.Scanner;

public class togglechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(togglechars1(str));
	}

	public static String togglechars1(String str) {
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if (ch >= 'A' && ch <= 'Z') {
				char converted = (char) (ch - 'A' + 'a');
				sb.append(converted);

			} else if (ch >= 'a' && ch <= 'z') {
				char converted = (char) (ch - 'a' + 'A');
				sb.append(converted);

			}

		}
		return sb.toString();

	}
}
