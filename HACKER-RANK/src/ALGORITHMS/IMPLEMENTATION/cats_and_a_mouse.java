package ALGORITHMS.IMPLEMENTATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cats_and_a_mouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			answer_btao(x, y, z);
		}
	}

	public static void answer_btao(int b1, int b2, int chuha) {
		int billi1 = Math.abs(b1 - chuha);
		int billi2 = Math.abs(b2 - chuha);
		if (billi1 < billi2) {
			System.out.println("Cat A");
		} else if (billi2 < billi1) {
			System.out.println("Cat B");
		} else if (billi2 == billi1) {
			System.out.println("Mouse C");
		}
	}
}
