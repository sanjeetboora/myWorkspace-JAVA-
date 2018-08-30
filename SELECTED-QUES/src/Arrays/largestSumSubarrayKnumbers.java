package Arrays;
import java.util.Scanner;
public class largestSumSubarrayKnumbers {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int k = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(maxsum(arr, N, k));
	}

	public static int maxsum(int arr[], int n, int k) {
		int sumarr[] = new int[n];
		sumarr[0] = arr[0];
		int currmax = arr[0];
		for (int i = 1; i < n; i++) {
			currmax = Math.max(arr[i] + currmax, arr[i]);
			sumarr[i] = currmax;
		}
		int ans = 0;
		for (int i = 0; i < k; i++) {
			ans += arr[i];
		}
		int result = ans;
		for (int j = k; j < n; j++) {
			ans += arr[j] - sumarr[j - k];
			result = Math.max(ans, result);
			result = Math.max(result, ans + sumarr[j - k]);
		}
		return result;
	}
}
