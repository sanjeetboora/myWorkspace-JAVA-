package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class taum_and_bday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for (int i = 0; i < test; i++) {
			long black = in.nextLong();
			long white = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();
			long cost=0;
			if (x > y && x > (y + z))
				cost = (black + white) * y + black * z;
			else if (y > z && y > (x + z))
				cost = (black + white) * x + white * z;
			else
				cost = black * x + white * y;
			System.out.println(cost);
		}
	}

}
