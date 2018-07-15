package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class time_in_words {

	private static String[] numNames = { "", "one", "two", "three", "four", "five", "six", "seven",
			"eight", "nine","ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
			"seventeen", "eighteen","nineteen" };
	private static String[] tensPlaces = { "", "", "twenty", "thirty", "fourty", "fifty" };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		StringBuffer sb = new StringBuffer();

		String hours = getInWords(h);
		String minutes = getInWords(m);

		if ((m > 0 && m < 30) && m != 15) {
			sb.append(minutes + " minutes past " + hours);
		}
		if ((m > 30 && m < 60) && m != 45) {
			hours = getInWords(h + 1);
			m = 60 - m;
			minutes = getInWords(m);
			sb.append(minutes + " minutes to " + hours);
		}
		if (m == 0) {
			sb.append(hours + " o' clock");
		}
		if (m == 15) {
			sb.append("quarter past " + hours);
		}
		if (m == 30) {
			sb.append("half past " + hours);
		}
		if (m == 45) {
			hours = getInWords(h + 1);
			sb.append("quarter to " + hours);
		}
		System.out.println(sb);
		in.close();
	}

	private static String getInWords(int num) {

		if (num > 0 && num < 20) {

			return numNames[num];
		} else {
			int dev = num / 10;
			int rem = num % 10;
			return tensPlaces[dev] + " " + numNames[rem];
		}
	}

}
