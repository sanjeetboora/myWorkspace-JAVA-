package Arrays;

import java.util.Scanner;

public class NoOfSubarraysWIthMaxValueInGivenRange_38 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int l = scn.nextInt();
		int r = scn.nextInt();
		System.out.println(noOfSubarrays(arr, N, l, r));
	}

	public static int noOfSubarrays(int arr[], int n, int l, int r) {
		int include = 0, exclude = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > r) {
				result += (countsubarrays(include) - countsubarrays(exclude));
				include = 0;
				exclude = 0;
			} else if (arr[i] < l) {
				include++;
				exclude++;
			} else {
				result -= countsubarrays(exclude);
				exclude = 0;
				include++;
			}
		}
		result += (countsubarrays(include) - countsubarrays(exclude));
		return result;
	}

	public static int countsubarrays(int num) {
		return num * (num + 1) / 2;
	}

}
