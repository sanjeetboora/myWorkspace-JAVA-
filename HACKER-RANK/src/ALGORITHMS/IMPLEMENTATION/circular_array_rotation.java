package ALGORITHMS.IMPLEMENTATION;

import java.util.Scanner;

public class circular_array_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int rotation = scn.nextInt();
		int queries = scn.nextInt();
		int[] arr = new int[size];
		// newIndex = (oldIndex+k)%n
		int idx =  rotation%size;
		for (int i = idx; i < size; i++) {
			if (i < size) {
				arr[i] = scn.nextInt();
			}
			if (i == size - 1) {
				for (int j = 0; j < idx; j++) {
					arr[j] = scn.nextInt();
				}
			}
		}

		for (int l = 0; l < queries; l++) {
			int ix = scn.nextInt();
			System.out.println(arr[ix]);
		}
	}
}
