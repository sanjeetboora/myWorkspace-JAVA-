import java.util.ArrayList;
import java.util.Scanner;

//Take as input str, a string. We are concerned with all the possible ascii-subsequences of str.
//E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”
//a. Write a recursive function which returns the count of ascii-subsequences for a given string. 
//Print the value returned.
//b. Write a recursive function which returns an ArrayList of ascii-subsequences for a given string. 
//Print the value returned.
//c. Write a recursive function which prints all possible ascii-subsequences for a given string 
//(void is the return type for function).
public class ques_2 {

public static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = scn.nextLine();
//		System.out.println(countSS_w_ascii(data, 0));
//		System.out.println(returnSS_w_ascii(data));
		printss_w_ascii(data, "");

	}

	public static int countSS_w_ascii(String str, int count) {
		if (str.length() == 0) {
			count = 1;
			return count;
		}
		String ros = str.substring(1);
		int recResult = countSS_w_ascii(ros, count);
		for (int i = 0; i < recResult; i++) {
			count = count + 3;
		}
		return count;
	}

	public static ArrayList<String> returnSS_w_ascii(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recResult = returnSS_w_ascii(ros);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(ch + recResult.get(i));
			myResult.add((int)ch + recResult.get(i));
		}
		return myResult;
	}

	public static void printss_w_ascii(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		printss_w_ascii(ros, osf + "");
		printss_w_ascii(ros, osf + cc);
		printss_w_ascii(ros, osf + (int)cc);
	}
}

