package Class;

public class ismirrorinverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		System.out.println(ismirrorinverse(arr));

	}

	public static boolean ismirrorinverse(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[arr[i]] != i) {
				return false;
			}

		}
		return true;
	}

	
}
