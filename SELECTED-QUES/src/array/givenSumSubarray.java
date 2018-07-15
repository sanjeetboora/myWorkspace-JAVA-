package array;

import java.util.*;

//https://www.geeksforgeeks.org/find-subarray-with-given-sum/
public class givenSumSubarray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = scn.nextInt();
		int[] arr = new int[num];  //{1, 4, 20, 3, 10, 5};
		int sum = scn.nextInt();
		for (int i = 0; i < num; i++) {
			arr[i] = scn.nextInt();

		}
		
		sumSubaaray(arr, num, sum);
	}

	public static void sumSubaaray(int[] arr, int num, int sum) {
		int start = 0, curr_sum = arr[0];
		for (int i = 1; i <= num; i++) {
			while (curr_sum > sum && start < i - 1) {
				curr_sum -= arr[start];
				start++;
			}
			if(curr_sum==sum) {
				System.out.println(sum+" is from "+start+" index to "+(i-1)+" index of array");
				return;
			}
			if(i<num) {
				curr_sum+=arr[i];
			}
		}
		System.out.println("No subarray found");
	}

}
