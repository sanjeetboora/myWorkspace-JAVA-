import java.util.ArrayList;
import java.util.Scanner;

//Take as input str, a string. We are concerned with all the possible
//	 subsequences of str.
//	 E.g. “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”,
//	 “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.
//	 a. Write a recursive function which returns the count of subsequences for
//	 a given string.
//	 Print the value returned.
//	 b. Write a recursive function which returns an ArrayList of subsequences
//	 for a given string.
//	 Print the value returned.
//	 c. Write a recursive function which prints all possible subsequences for
//	 a given string
//	 (void is the return type for function).
public class ques_1 {
	public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = scn.nextLine();
		System.out.println(countSS(data, 0));
		System.out.println(returnSS(data));
		printss(data, "");

	}

	public static int countSS(String str, int count) {
		if (str.length() == 0) {
			count = 1;
			return count;
		}
		String ros = str.substring(1);
		int recResult = countSS(ros, count);
		for (int i = 0; i < recResult; i++) {
			count = count + 2;
		}
		return count;
	}

	public static ArrayList<String> returnSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recResult = returnSS(ros);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(ch + recResult.get(i));
		}
		return myResult;
	}

	public static void printss(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printss(ros, osf + "");
		printss(ros, osf + cc);
	}
}
