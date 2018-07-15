package ALGORITHMS.STRINGS;

import java.util.Scanner;

public class making_anagrams {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String first = scn.nextLine();
		String second = scn.nextLine();

		boolean flag = false;

		System.out.println(anagramcount(first, second));
	}

	public static int anagramcount(String first, String second) {
		int count = 0;
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for (int i = 0; i < first.length(); i++) {
			arr1[first.charAt(i) - 97] += 1;
		}
		for (int k = 0; k < second.length(); k++) {
			arr2[second.charAt(k) - 97] += 1;
		}
		for (int j = 0; j < 26; j++) {
			count += Math.abs(arr1[j] - arr2[j]);

		}
		return count;
	}
}
