package Arrays;

import java.util.Scanner;

public class push0toend {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();

		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void push0toend(int arr[], int n) {
		int idx = n - 1;
		if (arr[0] == 0) {
			while (idx > 0) {
				if (arr[idx] != 0) {
					int temp = arr[0];
					arr[0] = arr[idx];
					arr[idx] = temp;
					idx--;
					break;
				} else {
					idx--;
				}
			}
		}
		for (int i = 1; i < idx; i++) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				i--;
				idx--;
			}
		}
	}

}
