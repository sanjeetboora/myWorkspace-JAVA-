package CONTESTS.WEEK_OF_CODE_31;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class beautiful_world {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String check = "aeiouy";
		boolean flag = true;
		int i = 0;
		if (str.length() == 1) {
			System.out.println("Yes");
		} else {
			for (i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					flag = false;
					System.out.println("No");
					break;
				} else if (check.indexOf(str.charAt(i)) != -1 && check.indexOf(str.charAt(i + 1)) != -1) {
					flag = false;
					System.out.println("No");
					break;
				}

				else if (i == str.length() - 2 && flag == true) {
					System.out.println("Yes");
				}
			}
		}

	}

}
