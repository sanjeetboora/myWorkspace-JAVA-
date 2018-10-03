package practice;

import java.util.Scanner;

public class PythagorasTriplets {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		pythagorasTriplets(num);
	}

	public static void pythagorasTriplets(int num) {
		int a = 0, b = 0, c = 0;
		int m = 2;
		while (c < num) {
			for (int n = 1; n < m; n++) {
				a = (m * m) - (n * n);
				b = 2 * m * n;
				c = (m * m) + (n * n);

				if (c > num) {
					break;
				} else {
					System.out.println(a + " " + b + " " + c);
				}
			}
			m++;
		}
	}

}
