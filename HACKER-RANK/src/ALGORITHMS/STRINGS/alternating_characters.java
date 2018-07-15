package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class alternating_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String str = sc.next();
			System.out.println(answer(str));
		}
	}

	public static int answer(String str) {
		int count = 0;
		if (str.length() == 1) {
			count = 0;
		} else {
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					
					count++;
				}
			}
		}
		return count;
	}

}
