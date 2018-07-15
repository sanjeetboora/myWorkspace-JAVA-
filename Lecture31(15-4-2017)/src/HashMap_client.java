import java.util.ArrayList;

import java.util.Scanner;
import java.util.Set;

public class HashMap_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		HashMap<String, Integer> popmap = new HashMap<>();
		popmap.put("A", 10);
		popmap.put("B", 20);
		popmap.put("C", 30);
		popmap.display();
		
		popmap.put("B", 80);
		popmap.put("A1", 240);
		popmap.put("B1", 250);
		popmap.put("C1", 260);
		popmap.display();
		popmap.put("A3", 190);
		popmap.put("B3", 170);
		popmap.put("C3", 100);
		popmap.display();
		System.out.println(get_highest_freq_char(str));
		int[] arr1 = { 1, 1, 2, 2, 3, 5 };
		int[] arr2 = { 1, 1, 1, 2, 2, 4, 5 };
		int[] arr3 = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		System.out.println(getchar1(arr1, arr2));
		System.out.println(getchar2(arr1, arr2));
		System.out.println(getarr(arr3));
	

	}

	public static Character get_highest_freq_char(String str) throws Exception {
		HashMap<Character, Integer> getmaxchar = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (getmaxchar.containsKey(str.charAt(i))) {
				getmaxchar.put(str.charAt(i), (getmaxchar.get(str.charAt(i)) + 1));
			} else {
				getmaxchar.put(str.charAt(i), 1);
			}
		}
		int max = 0;
		char ab = ' ';
		for (int j = 0; j < str.length(); j++) {
			if (getmaxchar.get(str.charAt(j)) > max) {
				max = getmaxchar.get(str.charAt(j));
				ab = str.charAt(j);
			}
		}
		return ab;

	}

	public static ArrayList<Integer> getchar1(int[] one, int[] two) throws Exception {
		ArrayList<Integer> rv = new ArrayList<Integer>();
		HashMap<Integer, Integer> first = new HashMap<>();
		HashMap<Integer, Integer> second = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			if (first.containsKey(one[i])) {
				first.put(one[i], (first.get(one[i] + 1)));
			} else {
				first.put(one[i], 1);
			}
		}
		for (int j = 0; j < two.length; j++) {
			if (first.containsKey(two[j])) {
				rv.add(two[j]);
				first.remove(two[j]);
			}
		}

		return rv;
	}

	public static ArrayList<Integer> getchar2(int[] one, int[] two) throws Exception {
		ArrayList<Integer> rv = new ArrayList<Integer>();
		HashMap<Integer, Integer> first = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			if (first.containsKey(one[i])) {
				first.put(one[i], (first.get(one[i]) + 1));
			} else {
				first.put(one[i], 1);
			}
		}
		for (int j = 0; j < two.length; j++) {
			if (first.containsKey(two[j]) && first.get(two[j]) > 0) {
				rv.add(two[j]);
				first.put(two[j], first.get(two[j]) - 1);
			}
		}

		return rv;
	}

	public static ArrayList<Integer> getarr(int[] arr) throws Exception {
		ArrayList<Integer> rv = new ArrayList<Integer>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			map.put(arr[i], !map.containsKey((arr[i]) - 1));

			if (map.containsKey((arr[i]) + 1)) {
				map.put((arr[i]) + 1, false);
			}

		}
		int startseq = 0, seqlen = 0;
		int startlongestseq = 0, longestseqlen = 0;
		// Set<Integer> ints = map.keySet();
		ArrayList<Integer> ints = map.keyset();
		for (Integer k : ints) {
			if (map.get(k) == true) {
				startseq = k;
				seqlen = 1;
				while (map.containsKey(startseq + seqlen)) {
					seqlen++;
				}
				if (seqlen > longestseqlen) {
					longestseqlen = seqlen;
					startlongestseq = startseq;
				}
			}
		}
		for (int i = startlongestseq; i < startlongestseq + longestseqlen; i++) {
			rv.add(i);
		}
		return rv;
	}

}
