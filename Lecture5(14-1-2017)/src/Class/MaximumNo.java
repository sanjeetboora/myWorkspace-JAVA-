package Class;

public class MaximumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		System.out.println(max(arr));

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
}
