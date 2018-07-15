package array;

import java.util.*;
//https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/
public class ZIgZagArray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();

		}
		zigZagArr(arr, num);
		System.out.println(Arrays.toString(arr));
	}

	public static void zigZagArr(int[] arr, int num) {
		// first expected sign '<', true=> '<', false=> '>'
		boolean flag = true;
		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			if (flag) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			} else {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}
			flag=!flag;

		}
	}
}
