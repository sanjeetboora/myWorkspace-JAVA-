package Class;

public class zeromovetoend {

	public static void main(String[] args) {
		int a[] = { 0, 3, 0, 5, 1, 6, 0 };
		sort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);

	}

	public static void sort(int[] a) {
		int left = 0;
		int right = a.length - 1;
		while (left < right) {
			if (a[left] == 0 && a[right] != 0) {
				a[left] = a[right];
				a[right] = 0;
				left++;

			} else if (a[left] != 0) {
				left++;

			} else if (a[right] == 0) {
				right--;
			}
		}

	}
}
