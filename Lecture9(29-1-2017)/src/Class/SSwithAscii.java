package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class SSwithAscii {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
		System.out.println(getSS(data));
		System.out.println(getSS(data).size());
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recResult = getSS(ros);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(ch + recResult.get(i));
			myResult.add((int)(ch) + recResult.get(i));
		}

		return myResult;
	}

}