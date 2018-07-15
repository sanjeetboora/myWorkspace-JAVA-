import java.util.ArrayList;
import java.util.Scanner;

// for negative infinity we write it as Integer.MIN_VALUE
public class knapsack {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String data = scn.nextLine();
		int[] vals = { 60, 100, 120 };
		int[] wts = { 10, 20, 30 };
		System.out.println(getknapsack(vals,wts, 0, 50));
		System.out.println(getknapsack_rec(vals, wts, 0, 50, new int[vals.length + 1][50 + 1]));
	}

	public static int getknapsack(int[] vals, int[] wts, int si, int cap) {
		if (si == vals.length) {
			return 0;
		}
		int include = 0, exclude = 0;
		if (wts[si] < cap) {
			include = vals[si] + getknapsack(vals, wts, si + 1, cap - wts[si]);// select

		}
		exclude = getknapsack(vals, wts, si + 1, cap);// no select
		int result = Math.max(include, exclude);
		return result;
	}

	public static int getknapsack_rec(int[] vals, int[] wts, int si, int cap, int[][] strg) {
		if (si == vals.length || cap == 0) {
			return 0;
		}
		if (strg[si][cap] != 0) {
			return strg[si][cap];
		}
		int include = 0, exclude = 0;
		if (wts[si] < cap) {
			include = vals[si] + getknapsack_rec(vals, wts, si + 1, cap - wts[si], strg);// select
		}
		exclude = getknapsack_rec(vals, wts, si + 1, cap, strg);// no select
		int result = Math.max(include, exclude);
		strg[si][cap] = result;
		return result;
	}
}
