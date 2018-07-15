package ALGORITHMS.STRINGS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class string_construction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		for (int j = 0; j < num; j++) {
			String str = scn.next();
			
			int count = 0;
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < str.length(); i++) {
				char curr = str.charAt(i);
				if (!map.containsKey(curr)) {
					map.put(curr, 0);
					count++;
				}

			}System.out.println(count);

		}
	}
}
