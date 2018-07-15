package Class;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		swap(arr,0,1);
		display.display(arr);
	}

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
