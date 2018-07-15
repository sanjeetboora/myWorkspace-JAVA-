package Class;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class permutation {
		public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			String data = scn.nextLine();
			 ArrayList<String> list = getpermutation(data);
			 Collections.reverse(list);
		System.out.println(list);
			
			System.out.println(getpermutation(data).size());
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
				for (int j= 0; j <=recstring.length(); j++) {
					String mystring=recstring.substring(0, j)+ch+recstring.substring(j);
				myResult.add(mystring);
			}}

			return myResult;
		}

	}

