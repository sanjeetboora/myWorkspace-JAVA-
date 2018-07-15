package Class;

import java.util.Scanner;

public class DecThenIncSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter  number ");
		int N = scn.nextInt();
		int i = 0, a = 0, prev, curr;
		boolean check;
		System.out.println("enter the no.s");
		prev = scn.nextInt();
		boolean flag = true;
		while (i < N) {
			curr = scn.nextInt();

			if (flag) {
				if (prev > curr) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				if (prev < curr) {
					flag = false;
				} else {
					System.out.println("invalid sequence");
					return;
				}
			}
			prev = curr;
			i = i + 1;
		}
		if (i == N) {
			System.out.println("valid sequence");
		}

	}

}
