package Class;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		bubblesort(arr);
	}
	public static void bubblesort(int[] arr) {
		int counter = 1;
		while (counter <= arr.length - 1) {
			for (int i = 0; i < arr.length - counter; i++) {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
			counter++;

		}
		display.display(arr);
	}

}
