package ALGORITHMS.BIT_MANIPULATION;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lonely_integer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int games = scn.nextInt();
		int[] arr = new int[games];
		for (int i = 0; i < games; i++) {
			arr[i] = scn.nextInt();
		}
		// System.out.println(1&1);
		System.out.println(getSingle(arr));
	}

	public static int getSingle(int[] arr) {

		int result = 0;

		int x = arr[0], sum = 0;

		for (int i = 1; i < arr.length; i++) {
			x ^= arr[i];
		}

		return x;
	}

}
