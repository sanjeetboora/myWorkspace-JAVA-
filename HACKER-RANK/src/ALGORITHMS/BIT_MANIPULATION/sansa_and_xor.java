package ALGORITHMS.BIT_MANIPULATION;

import java.util.*;

public class sansa_and_xor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int queries = scn.nextInt();
		while (queries > 0) {
			int num = scn.nextInt();
			int[] arr = new int[num];
			for (int i = 0; i < num; i++) {
				arr[i] = scn.nextInt();
			}
			if (num % 2 == 0) {
				System.out.println("0");
			} else {
				int result = 0;
				for (int i = 0; i < num; i += 2) {
					result = result ^ arr[i];
				}
				System.out.println(result);
			}
			queries--;
		}
	}

}
