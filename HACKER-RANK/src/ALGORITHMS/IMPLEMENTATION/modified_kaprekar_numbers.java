package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class modified_kaprekar_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int low = scn.nextInt();
		int high = scn.nextInt();
		int count = 0;
		for (int i = low; i <= high; i++) {
			String str = String.valueOf((long) i * i);
			int first = 0;
			String f = str.substring(0, str.length() / 2);
			if (f.length() != 0) {
				first = Integer.valueOf(f);
			}
			int sec = 0;
			String s = str.substring(str.length() / 2);
			if (s.length() != 0) {
				sec = Integer.valueOf(s);
			}
			if (first + sec == i) {
				count++;
				System.out.print(i + " ");
			}
		}
		if (count == 0) {
			System.out.print("INVALID RANGE");
		}
	}

}
