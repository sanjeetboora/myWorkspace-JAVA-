import java.util.Scanner;

public class zeroonetwosortedarray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = takeinput();
		int[] arr={1,0,1,1,0,2,0,1,0,1,1,2,1,1,2,2,2,0,0};
		sortit(arr);
	}

	public static void sortit(int[] arr) {
		int counter = 0;
		int right = arr.length - 1;
		for (int i = 0; i <= right; i++) {
			int left = i;
			if (right>left && (arr[right] == 2)) {
				right--;
			}
			if (arr[right] < arr[left]) {
				swap(arr, right, left);
			}
		}
		display(arr);
	}

	public static int[] takeinput() {
		int[] rv = null;
		System.out.println("enter size of array");
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter " + i + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + ",");
		}
		System.out.println("end");
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
