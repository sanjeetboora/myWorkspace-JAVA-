package Class;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 42, 96, 12, 18, -1, 53 };
		int[] sorted = mergesorting(arr,0,arr.length-1);
		display(sorted);
	}

	public static int[] mergesorting(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] ba = new int[1];
			ba[0] = arr[lo];
			return ba;
		}
		int mid = (lo + hi) / 2;
		int[] fhalf = mergesorting(arr, lo, mid);
		int[] shalf = mergesorting(arr, mid + 1, hi);
		int[] sorted = merged(fhalf, shalf);
		return sorted;
	}

	public static int[] merged(int[] one, int[] two) {
		int[] rv = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] <= two[j]) {
				rv[k] = one[i];
				k++;
				i++;
			} else {
				rv[k] = two[j];
				k++;
				j++;
			}
		}
		while (i < one.length) {
			rv[k] = one[i];
			k++;
			i++;
		}
		while (j < two.length) {
			rv[k] = two[j];
			k++;
			j++;
		}
		return rv;
	}

	public static void display(int[] arr) {
		for (int val : arr) {

			System.out.print(val + ",");
		}
		System.out.println("end");
	}

}
