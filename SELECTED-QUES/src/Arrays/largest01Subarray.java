package Arrays;

import java.util.*;

import org.xml.sax.HandlerBase;

public class largest01Subarray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(zeroOneSubarray(arr, n));

	}

	public static int zeroOneSubarray(int arr[], int n) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				arr[i] = -1;
			}
		}
		int sum = 0, res = -1;

		HashMap<Integer, Integer> map = new HashMap();
		map.put(0, -1);
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (map.containsKey(sum)) {
				res = Math.max(res, i - map.get(sum));
			} else {
				map.put(sum, i);
			}
		}
		return res;
	}
}
