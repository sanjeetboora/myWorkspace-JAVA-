package Arrays;

import java.util.Scanner;

public class minNoFromgivenSequence {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.next();
		number(str);
		number("IDID");
		number("I");
		number("DD");
		number("II");
		number("DIDI");
		number("IIDDD");
		number("DDIDDIID");
	}

	public static void number(String str) {
		int num = 1;
		int start = -1;
		int end = 0;

		while (end < str.length() || start < str.length()) {
			if (end < str.length() && str.charAt(end) == 'D') {
				num++;
			} else {
				int tempmin = num;
				while (start < end) {
					System.out.print(tempmin);
					tempmin--;
					start++;
				}
				num++;
			}
			end++;
		}
		System.out.println();
	}

}
