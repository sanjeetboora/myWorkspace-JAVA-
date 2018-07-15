package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class Caesar_cipher {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int len = scn.nextInt();
		String str = scn.next();
		char[] chs = str.toCharArray();
		int to_rotate = scn.nextInt();
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] >= 'a' && chs[i] <= 'z') {
				chs[i] = (char) (((chs[i] + to_rotate - 'a') % 26) + 'a');

			}
			if (chs[i] >= 'A' && chs[i] <= 'Z') {
				chs[i] = (char) (((chs[i] + to_rotate - 'A') % 26) + 'A');

			}
		}
		String str1 = new String(chs);
		System.out.println(str1);

	}

}
