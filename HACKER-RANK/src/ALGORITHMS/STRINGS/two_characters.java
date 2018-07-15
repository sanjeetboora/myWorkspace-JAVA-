package ALGORITHMS.STRINGS;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class two_characters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int len = in.nextInt();
		String str = in.next();
		//System.out.println(select_required_chars(str));
		answer_btao(str, str);
	}

	public static void answer_btao(String str, String strcopy) {
		ArrayList<String> retval = new ArrayList<>();
		ArrayList<String> all_pairs = select_required_chars(strcopy);
		// System.out.println(all_pairs);
		for (int j = 0; j < all_pairs.size(); j++) {
			str = strcopy;
			for (int i = 0; i < strcopy.length(); i++) {
				// System.out.println(str+"*********");
				char abc = strcopy.charAt(i);
				if (abc != all_pairs.get(j).charAt(0) && abc != all_pairs.get(j).charAt(1)) {
					String str1 = str.replace(abc, ' ');
					str = str1.replaceAll("\\s+", "");
					// System.out.println(str+"====");
				}

			}
			// System.out.println(str+"-----------------");
			if (if_valid(str)) {
				// System.out.println(str + "++++++++++++++++++++++++++++");
				retval.add(str);
			}

		}
		int max = 0;

		for (int j = 0; j < retval.size(); j++) {
			if (max <= retval.get(j).length()) {
				max = retval.get(j).length();
			}
		}
		System.out.println(max);

	}

	public static boolean if_valid(String to_check) {
		boolean flag = true;
		if (to_check.isEmpty() || to_check.length() == 1) {
			flag = true;
		}
		if (to_check.length() == 2) {
			if (to_check.charAt(0) == to_check.charAt(1)) {
				flag = false;
			}
		} else {
			for (int i = 0; i < to_check.length() - 1; i++) {
				if (to_check.charAt(i) == to_check.charAt(i + 1)) {
					flag = false;
				}
			}
		}
		return flag;
	}

	public static ArrayList<String> select_required_chars(String str) {
		String diffchars = "";
		diffchars += str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (!diffchars.contains(String.valueOf(str.charAt(i)))) {
				diffchars += str.charAt(i);
			}
		}
		// System.out.println(diffchars);
		ArrayList<String> arrstr = new ArrayList<>();
		for (int j = 0; j < (diffchars.length()) - 1; j++) {
			for (int k = j+1; k < diffchars.length(); k++) {
				String abc = "";
				if (diffchars.charAt(j) != diffchars.charAt(k)) {
					abc = diffchars.charAt(j) + "";
					abc += diffchars.charAt(k);
					arrstr.add(abc);
				}
			}
		}
		return arrstr;

	}

}
