package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class getBoardPath {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
		System.out.println(getKPC(data));
		System.out.println(getKPC(data).size());
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
		String code=getcodes(ch);
		for (int i = 0; i < recResult.size(); i++) {
			String recstring = recResult.get(i);
			for (int j= 0; j <code.length(); j++) {
			myResult.add(code.charAt(j)+recResult.get(i));
		}}

		return myResult;
	}

}
