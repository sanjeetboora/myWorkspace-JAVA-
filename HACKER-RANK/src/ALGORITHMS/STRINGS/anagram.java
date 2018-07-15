package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		for (int j = 0; j < num; j++) {
			String str = scn.next();
			if (str.length() % 2 == 0) {
				String first = str.substring(0, str.length() / 2);
				String second = str.substring(str.length() / 2);
				System.out.println(anagramcount(first, second));
			} else {
				
				System.out.println("-1");
			}

		}
	}

	public static int anagramcount(String first, String second) {
		int count = 0;
		int[] arr1 = new int[26];
		
		for (int i = 0; i < first.length(); i++) {
			arr1[first.charAt(i) - 97] += 1;
		}
		
		for (int j = 0; j < second.length(); j++) {
			if (arr1[second.charAt(j) - 97] == 0) {
				count++;
			} else {
				arr1[second.charAt(j) - 97]-=1;
			}

		}
		return count;
	}
}
