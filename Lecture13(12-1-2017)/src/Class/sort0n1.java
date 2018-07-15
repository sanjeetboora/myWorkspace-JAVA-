package Class;

public class sort0n1 {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 0, 1, 0, 1, 0 };
		sort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);

	}

	public static void sort(int[] a) {
		int left = 0;
		int right = a.length - 1;
		
		while (left < right) {
			if (a[left] == 1 && a[right] == 0) {
				a[left] = 0;
				a[right] = 1;
				left++;

			} else if (a[left] == 0) {
				left++;

			} else if (a[right] == 1) {
				right--;
			}
		}

	}
}
