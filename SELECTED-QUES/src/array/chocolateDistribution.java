package array;

import java.util.*;
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
public class chocolateDistribution {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stud=scn.nextInt();
		int num = scn.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();

		}
		
		System.out.println(minDiff(arr, stud));;
	}

	public static int minDiff(int[] arr, int stud) {
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-stud+1; i++) {
			if(min>(arr[i+stud-1]-arr[i])) {
				min=arr[i+stud-1]-arr[i];
			}
		}
		return min;
	}
}
