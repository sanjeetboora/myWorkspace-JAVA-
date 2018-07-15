package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		String str = scn.next();
	//	str = str.replaceAll("\\s", "");
		double len = Math.sqrt(str.length());
		char[] arr = str.toCharArray();
		int lower = (int) Math.floor(len);
		int upper = (int) Math.ceil(len);
		for (int i = 0; i < upper; i++) {
			for (int j = i; j < str.length(); j += upper) {
				System.out.print(arr[j]);

			}
			System.out.print(" ");
		}

	}

}
