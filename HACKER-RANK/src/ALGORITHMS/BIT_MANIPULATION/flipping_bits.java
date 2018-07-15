package ALGORITHMS.BIT_MANIPULATION;

import java.io.*;
import java.util.*;

public class flipping_bits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		long mask = 0b11111111111111111111111111111111L;

		for (int i = 0; i < num; i++) {
			Long bin = scn.nextLong();
			System.out.println(~bin & mask);

		}

	}

}
