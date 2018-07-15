package sanketsingh;

import java.util.Scanner;

public class slas {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int i = 1, j = 1, val = 1;
		while (i <= N) {
			j = 1;
			val = 1;
			while (j <= i) {
				System.out.print(val + "\t");
				val = val + 1;
				j = j + 1;
			}
			j = (2 * N - 3) - 2 * (i - 1);

			while (j > 0) {
				System.out.print("\t");
				j = j - 1;
			}
			if (i == N) {
				val -= 1;

			} else {
				val--;
			}
			while (j < i + 1) {

				if (val != 0) {

					System.out.print(val + "\t");
					val = val - 1;
					j = j + 1;
				} else {
					break;
				}
			}
			System.out.println();
			i = i + 1;
			j = 1;

		}

	}

}
