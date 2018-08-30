package Arrays;

import java.util.*;

public class chocoDistribution {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int packets = scn.nextInt();
		int child = scn.nextInt();
		int arr[] = new int[packets];
		for (int i = 0; i < packets; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(minDiff(arr, packets, child));

	}

	public static int minDiff(int arr[], int packets, int child) {
		if (packets == 0 || child == 0) {
			return -1;
		}
		if (packets < child) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		int sidx = 0, eidx = 0;
		Arrays.sort(arr);
		for (int i = 0; i + child - 1 < packets; i++) {
			if ((arr[i + child - 1]-arr[i]) < min) {
				min = arr[i + child - 1]-arr[i];
				sidx = i;
				eidx = i + child - 1;
			}
		}
		return arr[eidx] - arr[sidx];
	}
}
