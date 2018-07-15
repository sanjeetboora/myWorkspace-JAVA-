package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class keypadcode {

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

	public static String getcodes(char ch) {
		String str =null;
		if (ch=='1') {
			str="abc";
		}
		else if (ch=='2') {
			str="def";
		}
		else if (ch=='3') {
			str="ghi";
		}
		else if (ch=='4') {
			str="jkl";
		}
		else if (ch=='5') {
			str="mno";
		}
		else if (ch=='6') {
			str="pqr";
		}
		else if (ch=='7') {
			str="stu";
		}
		else if (ch=='8') {
			str="vwx";
			
		}
		else if (ch=='9') {
			str="yz";
		}
		else if (ch=='0') {
			str="_/";
			
		}
		return str;
	}
}