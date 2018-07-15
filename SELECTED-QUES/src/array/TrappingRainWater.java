package array;

import java.util.*;

//https://www.geeksforgeeks.org/trapping-rain-water/
public class TrappingRainWater {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(MaxWater(arr, num));
	}

	public static int MaxWater(int[] arr, int num) {
		int water = 0;
		int[] left = new int[num];
		left[0] = arr[0];
		int[] right = new int[num];
		right[num - 1] = arr[num - 1];
		for (int i = 1; i < num; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		for (int j = num - 2; j >= 0; j--) {
			right[j] = Math.max(arr[j], right[j + 1]);
		}
		for (int k = 0; k < num; k++) {
			water += (Math.min(left[k], right[k]) - arr[k]);

		}
		return water;
	}
}
