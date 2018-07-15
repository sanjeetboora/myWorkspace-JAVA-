package Class;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		reverse(arr);

	}
	public static void reverse(int[] arr) {

		int left = 0, right = arr.length - 1;
		while (left <= right) {
			swap.swap(arr, left, right);
			left++;
			right--;
		}
		display.display(arr);
	}

}
