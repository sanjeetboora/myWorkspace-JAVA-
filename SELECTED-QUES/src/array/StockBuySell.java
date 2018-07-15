package array;

import java.util.*;
//https://www.geeksforgeeks.org/stock-buy-sell/
class Interval {
	int buy, sell;
}

public class StockBuySell {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] price = new int[num];
		for (int i = 0; i < num; i++) {
			price[i] = scn.nextInt();
		}
		MaxProfit(price, num);
	}

	public static void MaxProfit(int[] price, int num) {
		int i = 0, count = 0;
		if (num == 1) {
			return;
		}
		ArrayList<Interval> rec = new ArrayList<Interval>();
		while (i < num - 1) {
			while ((i < num - 1) && (price[i + 1] <= price[i])) {
				i++;
			}
			Interval inter = new Interval();
			inter.buy = i++;

			while ((i < num ) && (price[i - 1] <= price[i])) {
				i++;
			}
			inter.sell = i - 1;
			rec.add(inter);
			count++;
		}
		if (count == 0) {
			System.out.println("none");
		} else {
			for (int k = 0; k < count; k++) {
				System.out.println(k + ".  => buy on " + rec.get(k).buy + " and sell on " + rec.get(k).sell);
			}
		}
	}
}
