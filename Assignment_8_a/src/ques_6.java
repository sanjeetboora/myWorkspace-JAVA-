import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

// Take as input N, a number. Take N more inputs and store that in an array.
// a. Write a recursive function which counts the number of ways the array
//	 could be split in two groups, so that the sum of items in both groups is
// 	 equal. Each number in the array must belong to one of the two groups.
//	 Print the value returned.
// b. Write a recursive function which keeps track of ways an array could be
//	 split in two groups, so that the sum of items in both groups is equal. Each
//	 number in the array must belong to one of the two groups. Return type of
//	 function should be ArrayList<String>. Print the value returned.
//	 E.g. for [1, 3, 5, 7, 0] the returned ArrayList will contain
//	 “[1, 7, 0] and [3, 5]” and “[1, 7] and [3, 5, 0]” as its constituents.
// c. Write a recursive function which keeps track of ways an array could be
//	 split in two groups, so that the sum of items in both groups is equal. Each
//	 number in the array must belong to one of the two groups. Return type of
//	 function should be void. Print the two groups, each time you find a
//	 successful split.
public class ques_6 {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int size = scn.nextInt();
		int[] data = takeInput(size);
		System.out.println(countSplitArrays(data, 0, 0, 0));
		System.out.println(getSplitArrays(data, 0, 0, "", 0, "", new ArrayList<>()));
		printSplitArrays(data, 0, 0, "", 0, "");
	}

	public static int countSplitArrays(int[] data, int si, int sum1, int sum2) {
		if (si == data.length) {
			if (sum1 == sum2) {
				return 1;
			}
			return 0;
		}

		int count = countSplitArrays(data, si + 1, sum1 + data[si], sum2);
		count += countSplitArrays(data, si + 1, sum1, sum2 + data[si]);
		return count;
	}

	public static ArrayList<String> getSplitArrays(int[] data, int si, int sum1, String osf1, int sum2, String osf2,
			ArrayList<String> baseResult) {
		if (si == data.length) {
			if (sum1 == sum2) {
				baseResult.add(osf1 + " = " + osf2);
			}
			return baseResult;
		}

		getSplitArrays(data, si + 1, sum1 + data[si], osf1 + data[si] + " + ", sum2, osf2, baseResult);
		getSplitArrays(data, si + 1, sum1, osf1, sum2 + data[si], osf2 + data[si] + " + ", baseResult);

		return baseResult;
	}

	public static void printSplitArrays(int[] data, int si, int sum1, String osf1, int sum2, String osf2) {
		if (si == data.length) {
			if (sum1 == sum2) {
				System.out.println(osf1 + " = " + osf2);
			}
			return;
		}
		printSplitArrays(data, si + 1, sum1 + data[si], osf1 + data[si] + " + ", sum2, osf2);
		printSplitArrays(data, si + 1, sum1, osf1, sum2 + data[si], osf2 + data[si] + " + ");
	}

	public static int[] takeInput(int size) {
		int[] rv = null;
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + ",");
		}
	}

	public static int countSplitArrays(int str) {
		if (str == 0 || str == 1) {
			return 1;
		}
		int count = str * countSplitArrays(str - 1);
		return count;
	}

}
