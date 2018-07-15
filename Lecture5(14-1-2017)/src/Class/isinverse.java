package Class;

public class isinverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		int[] arr1 = takeinput.takeinput();
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

}
