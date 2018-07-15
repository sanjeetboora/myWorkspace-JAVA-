package Class;

public class mergesortingbyiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one = { 5, 18, 22, 36, 43, 48, 50 };
		int[] two = { 3, 9, 12, 29, 33 };
		display( merged(one,two));
	}

	public static int[] merged(int[] one, int[] two) {
		int[] rv = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] <= two[j]) {
				rv[k] = one[i];
				k++;
				i++;
			} else {
				rv[k] = two[j];
				k++;
				j++;
			}
		}
		while (i < one.length) {
			rv[k] = one[i];
			k++;
			i++;
		}
		while (j < two.length) {
			rv[k] = two[j];
			k++;
			j++;
		}
		return rv;
	}
	public static void display(int[] arr) {
		for (int val : arr) {
			
			System.out.print(val + ",");
		}
		System.out.println("end");
	}

}
