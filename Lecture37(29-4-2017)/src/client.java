
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 0, 1, 1, 0, 1, 2, 1 };
		sort012(arr);
	}

	public static void sort012(int[] arr) {
		int lo = 0, mid = 0, hi = arr.length - 1;
		while (mid <= hi) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo] = temp;
				lo++;
				mid++;
			}
			if (arr[mid] == 1) {
				mid++;

			}
			if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
			}

		}
		for (int val : arr) {
			System.out.print(val + " , ");
		}

	}

}
