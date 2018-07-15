package Class;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		display.display(arr);

	}
	public static int[] inverse(int[] arr) {
		int[] rv = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rv[arr[i]] = i;

		}
		return rv;

	}

}
