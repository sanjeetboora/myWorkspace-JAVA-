package Lecture9;
import java.util.Scanner;
public class stringops {

	public static void main(String[] args) {

//		String s1 = "str";
		// substrings(s1);
		// printchars(s1);
		// if (ispalindrome(s1))
		// System.out.println("yes it is a palindrome");
		// else
		// System.out.println("not a palindrome");
		// /////////////
		// substrings(s1);
		// System.out.println(countpalindrome(s1));
		Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(togglecase(str));
		
		// System.out.println(replace("aiou"));
//		System.out.print(addDifference("aclmf"));
		// System.out.print(compression("aaabbdccs"));
	}

	public static void printchars(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static boolean ispalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void substrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static int countpalindrome(String str) {
		int counter = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j <= str.length() + 1; j++) {
				if (ispalindrome(str.substring(i, j))) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static String togglecase(String str) {
		char s;
		String ss = "";
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc >= 'A' && cc <= 'Z') {
				s = (char) (str.charAt(i) - 'A' + 'a');
				ss = ss + s;
			} else if (cc >= 'a' && cc <= 'z') {
				s = (char) (str.charAt(i) + 'A' - 'a');
				ss = ss + s;
			}

		}
		return ss;

	}

	public static String replace(String str) {
		char s;
		String retval = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				s = (char) (str.charAt(i) + 1);
				retval = retval + s;
			} else {
				s = (char) (str.charAt(i) - 1);
				retval = retval + s;
			}
		}
		return retval;
	}

	public static String addDifference(String str) {
		int s;
		String retval = "";
		for (int i = 1; i < str.length(); i++) {
			if (i < str.length()) {
				s = str.charAt(i) - str.charAt(i - 1);
				retval = retval + str.charAt(i - 1) + s;
			} else
				retval = retval + str.charAt(i-1);
		}
		return retval+str.charAt(str.length()-1);
	}

}