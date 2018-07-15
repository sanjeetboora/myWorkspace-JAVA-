package ALGORITHMS.BIT_MANIPULATION;

import java.io.*;
import java.util.*;

public class maximizing_xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int L = scn.nextInt();
		int R = scn.nextInt();
		int result = Integer.MIN_VALUE;
		for (int i = L; i <= R; i++) {
			for (int j = L; j <= R; j++) {
				int num = (i ^ j);
				if (num > result) {
					result = num;
				}
			}
		}
		System.out.println(result);

	}

}
