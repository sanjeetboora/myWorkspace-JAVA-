import java.util.ArrayList;
import java.util.Scanner;

//Take as input str, a string. str represents keys pressed on a nokia phone keypad.
//We are concerned with all possible words that can be written with the pressed keys.
//E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”
//a. Write a recursive function which returns the count of words for a given keypad string. 
//	Print the value returned.
//b. Write a recursive function which returns an ArrayList of words for a given keypad string.
//	Print the value returned.
//c. Write a recursive function which prints all possible words for a given keypad string 
//	(void is the return type for function).
public class ques_3 {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
		System.out.println(countKPC(data, 1));
		printKPC(data, "");
	
		System.out.println(getKPC(data));

	}

	public static int countKPC(String str, int count) {

		if (str.length() == 0) {
			return count;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		String code = getcodes(cc);
		
		for (int i = 0; i < code.length(); i++) {
			count=1+ countKPC(ros, count);
			//System.out.println(count);
		
		}
		return count-1;
	}

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recResult = getKPC(ros);
		ArrayList<String> myResult = new ArrayList<>();
		String code = getcodes(ch);
		for (int i = 0; i < recResult.size(); i++) {
			String recstring = recResult.get(i);
			for (int j = 0; j < code.length(); j++) {
				myResult.add(code.charAt(j) + recResult.get(i));
			}
		}
		return myResult;
	}

	public static void printKPC(String str, String getthecode) {

		if (str.length() == 0) {
			System.out.println(getthecode);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		String code = getcodes(cc);
		for (int i = 0; i < code.length(); i++) {
			printKPC(ros, getthecode + code.charAt(i));
		}
	}

	public static String getcodes(char ch) {
		String str = null;
		if (ch == '1') {
			str = "abc";
		} else if (ch == '2') {
			str = "def";
		} else if (ch == '3') {
			str = "ghi";
		} else if (ch == '4') {
			str = "jkl";
		} else if (ch == '5') {
			str = "mno";
		} else if (ch == '6') {
			str = "pqr";
		} else if (ch == '7') {
			str = "stu";
		} else if (ch == '8') {
			str = "vwx";

		} else if (ch == '9') {
			str = "yz";
		} else if (ch == '0') {
			str = "_/";

		}
		return str;
	}
}

// public class Solution {
// private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl",
// "mno", "pqrs", "tuv", "wxyz" };
//
// public List<String> letterCombinations(String digits) {
// List<String> ret = new LinkedList<String>();
// combination("", digits, 0, ret);
// return ret;
// }
//
// private void combination(String prefix, String digits, int offset,
// List<String> ret) {
// if (offset >= digits.length()) {
// ret.add(prefix);
// return;
// }
// String letters = KEYS[(digits.charAt(offset) - '0')];
// for (int i = 0; i < letters.length(); i++) {
// combination(prefix + letters.charAt(i), digits, offset + 1, ret);
// }
// }
// }
