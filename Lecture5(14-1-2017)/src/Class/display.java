package Class;

public class display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput.takeinput();
		display(arr);
	}public static void display(int[] arr) {
		for (int val : arr) {
			
			System.out.print(val + ",");
		}
		System.out.println("end");
	}

}
