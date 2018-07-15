package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;

public class bon_appetit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int items = in.nextInt();
		int unwanted = in.nextInt();
		int[] prices = new int[items];

		for (int i = 0; i < items; i++) {
			prices[i] = in.nextInt();
		}
		int anna_paid = in.nextInt();
		answer_btao(prices, unwanted, anna_paid);

	}

	public static void answer_btao(int[] prices, int unwanted, int anna_paid) {
		int sum = 0;
		for (int i = 0; i < prices.length; i++) {
			if (i != unwanted) {
				sum += prices[i];
			}

		}
		sum = sum / 2;
		int actual = sum, refund = anna_paid - actual;
		if (refund == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(refund);
		}
	}
}
