package Class;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 42, 96, 12, 18, -2, 53 };
		quicksorting(arr, 0, arr.length - 1);
		display(arr);
	}
	public static void quicksorting(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;
		int left = lo, right = hi, pivot = arr[mid];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			
		}
		
		quicksorting(arr, lo, right);
		quicksorting(arr, left, hi);
	}
	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + ",");
		}
		System.out.println("end");
	}

}
