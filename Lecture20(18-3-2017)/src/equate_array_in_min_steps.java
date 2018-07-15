import java.util.Arrays;
import java.util.Scanner;

public class equate_array_in_min_steps {
	public static Scanner scn = new Scanner(System.in);
	
	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 int[] arr = { 1, 5, 5, 10, 10 };
	 Arrays.sort(arr);
	 System.out.println(max(arr));
	 display(frequencycount(arr));
	 System.out.println(max(frequencycount(arr)));
	 System.out.println(equate_array(arr,0));
	 }
	//
	public static int equate_array(int[] arr, int count) {
		Arrays.sort(arr);
		int max_no = max(arr);
		int diff = max_no - arr[0];
		// for (int i = 0; i < arr.length; i++) {
		// while (arr[i] >= 5) {
		// arr[i] = arr[i] - 5;
		// }
		// }

		if (diff == 0) {
			return 0;
		}
		int index = linearsearch(arr, max_no);
		if (diff >= 5) {
			max_no = max_no - 5;
			count += equate_array(arr, count);

		} else {
			if (diff > 3 && diff < 5) {
				max_no = max_no - 2;
				count += equate_array(arr, count);
			}
			if (max_no < 3 && max_no > 0) {
				max_no = max_no - 2;
				count += equate_array(arr, count);
			}
		}
		display(arr);
		return count;
	}

	public static int[] frequencycount(int x[]) {
		int i = 0, j = 0;
		int fr[] = new int[max(x) + 1];
		for (i = 0; i < fr.length; i++) {
			fr[i] = 0;
		}
		// calculating frequency
		for (i = 0; i < fr.length; i++) {
			for (j = 0; j < x.length; j++) {
				if (i == x[j]) {
					fr[i]++;
				}
			}
		}
		return fr;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		int large = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			large = max;
		}
		return large;
	}

	public static int linearsearch(int[] arr, int data) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " => ");
		}
		System.out.println();
	}

}
