package Arrays;

import java.util.*;

public class TrappingRainWater {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(waterTrapped(arr, N));

	}

	public static int waterTrapped(int arr[], int N) {
		int water = 0, maxLeft = 0, maxRight = 0, li = 0, hi = N - 1;
		while(li<=hi) {
			if(arr[li]<arr[hi]) {
				if(arr[li]>maxLeft) {
					maxLeft=arr[li];
					
				}
				else {
					water+=(maxLeft-arr[li]);
					li++;
				}
			}
			else {
				if(arr[hi]>maxRight) {
					maxRight=arr[hi];
					
				}
				else {
					water+=(maxRight-arr[hi]);
					hi--;
				}
			}
		}
		return water;
	}

}
