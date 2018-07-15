package ASSIGNMENT1;

import java.util.Scanner;

public class q3nthFibbonacci {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		NthFibonnaci(num);
	}

	public static void NthFibonnaci(int num) {
		int var1 = 0, var2 = 1, count = 2, result = 0;
		if (num == 1 || num == 2) {
			System.out.println(num + "th fibonnaci is " + (num - 1));
		} else {
			while (count < num) {
				result = var1 + var2;
				var1 = var2;
				var2 = result;
				count++;
			}
			System.out.println(num + "th fibonnaci is " + result);
		}

	}
}
