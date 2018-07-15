package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class day_of_the_programmer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();

		System.out.println(answer(year));

	}

	static String answer(int year) {
		String date = "";
		if (year < 1918) {
			if (year % 4 == 0) {
				date = "12.09." + year;

			} else {
				date = "13.09." + year;
			}

		}
		if (year == 1918) {

			date = "26.09." + year;

		}
		if (year > 1918) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				date = "12.09." + year;

			} else {
				date = "13.09." + year;
			}

		}
		return date;
	}

}
