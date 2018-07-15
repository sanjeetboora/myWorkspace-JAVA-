import java.util.ArrayList;
import java.util.Scanner;

//Take as input str, a string. We are concerned with all possible permutations of characters in str.
//E.g. “abc” can produce following words “abc”, “acb”, “bac”, “bca”, “cab”, “cba”
//a. Write a recursive function which returns the count of different permutations for a given string. 
//Print the value returned.
//b. Write a recursive function which returns an ArrayList of permutations for a given string. 
//Print the value returned.
//c. Write a recursive function which prints all possible permutations for a given string 
//(void is the return type for function).
public class ques_4 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = "abc";
		System.out.println(countPermutations(data.length()));
		System.out.println(getpermutation(data));
		System.out.println(getpermutation(data).size());
		printpermutation(data,"");
	}

	public static int countPermutations(int str) {
		if (str == 0 || str == 1) {
			return 1;
		}
		int count = str * countPermutations(str - 1);
		return count;
	}

	public static ArrayList<String> getpermutation(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recResult = getpermutation(ros);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < recResult.size(); i++) {
			String recstring = recResult.get(i);
			for (int j = 0; j <= recstring.length(); j++) {
				String mystring = recstring.substring(0, j) + ch + recstring.substring(j);
				myResult.add(mystring);
			}
		}
		return myResult;
	}

	public static void printpermutation(String quest, String ans) {
		if (quest.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < quest.length(); i++) {
			char ch = quest.charAt(i);
				String ros = quest.substring(0, i) + quest.substring(i + 1);
				printpermutation(ros, ans + ch);

		}

	}
}
