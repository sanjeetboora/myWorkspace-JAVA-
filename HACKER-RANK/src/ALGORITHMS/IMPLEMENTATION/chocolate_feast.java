package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class chocolate_feast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int money = in.nextInt();
			int cost = in.nextInt();
			int wrapper_req = in.nextInt();
			no_of_choc(money, cost, wrapper_req);
		}
	}

	public static void no_of_choc(int money, int cost, int wrapper_req) {

		int choc = money / cost;
		int wrapper = choc;
		while (!(wrapper < wrapper_req)) {
			int a = wrapper / wrapper_req;
			wrapper = wrapper % wrapper_req;
			choc += a;
			wrapper += a;

		}

		System.out.println(choc);
	}

}
