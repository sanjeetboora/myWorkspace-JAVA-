package Arrays;

//Given an array of size n, generate and print all possible combinations of r elements in array. 
//For example, if input array is {1, 2, 3, 4} and r is 2, then output should be {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
public class allCombinationsRelements_39 {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int r = 3;
		int n = arr.length;
		printCombination(arr, n, r);
	}

	public static void printCombination(int arr[], int n, int r) {
		int data[] = new int[r];
		printcombo(arr, n, r, data, 0, 0);
	}

	public static void printcombo(int arr[], int n, int r, int data[], int idx, int i) {
		if (idx == r) {
			for (int j = 0; j < r; j++) {
				System.out.print(data[j] + " ");
			}
			System.out.println();
			return;
		}
		if (i >= n) {
			return;
		}
		data[idx] = arr[i];
		printcombo(arr, n, r, data, idx + 1, i + 1);

		printcombo(arr, n, r, data, idx, i + 1);
	}
}
