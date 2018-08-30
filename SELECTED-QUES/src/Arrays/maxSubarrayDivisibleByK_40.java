package Arrays;

import java.util.*;
//Given an arr[] containing n integers and a positive integer k. The problem is to find the length 
//of the longest subarray with sum of the elements divisible by the given value k.
public class maxSubarrayDivisibleByK_40 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(maxsubarray(arr, N, k));
	}

	public static int maxsubarray(int arr[], int n, int k) {
		int modarr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			modarr[i] = (sum) % k;
		}
		HashMap<Integer, Integer> map = new HashMap();
		int longest = 0;
		for (int i = 0; i < n; i++) {
			if (modarr[i] == 0) {
				longest = i + 1;
			} else if (map.containsKey(modarr[i])) {
				int index = map.get(modarr[i]);
				if ((i - index) > longest) {
					longest = i - index;
				}
			} else {
				map.put(modarr[i], i);
			}
		}
		return longest;
	}

}
