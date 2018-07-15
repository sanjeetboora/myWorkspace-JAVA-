package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class the_love_letter_mystrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		for (int i = 0; i < test; i++) {
			String str = scn.next();
			answer(str);
		}
	}

	public static void answer(String str) {
		int count = 0, len = str.length(), i = 0;
		boolean flag = false;
		while (i < len / 2 && flag == false) {
			count += Math.abs(str.charAt(i) - str.charAt(len - 1 - i));
			i++;

		}
		System.out.println(count);

	}

}
