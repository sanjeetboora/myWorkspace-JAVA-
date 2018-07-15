import java.util.Scanner;

public class isinverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =takeinput();
		int[] arr1 = takeinput();
		System.out.println(isinverse(arr,arr1));


	}
	public static boolean isinverse(int[] arr, int[] arone) {

		for (int i = 0; i < arr.length; i++) {
			if (arone[arr[i]] != i) {
				return false;
			}

		}
		return true;
	}
	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
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

}
