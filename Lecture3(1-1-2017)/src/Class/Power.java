package Class;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = scn.nextInt();
		System.out.println("Enter power ");
		int power = scn.nextInt();
		int i = 1, pow = 1;
		while (i <= power) {
			pow = pow * num;
			i = i + 1;
		}
		System.out.println(num + " to the " + power + " results " + pow);

	}

}
