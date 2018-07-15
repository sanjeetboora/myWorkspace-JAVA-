package ARRAYS;

import java.util.Scanner;

public class Left_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int rotation = scn.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		for (int j = 0; j < rotation; j++) {
			int k=0,temp = arr[0];
			for ( k = 0; k < size-1; k++) {

				arr[k] = arr[k + 1];
				
			}arr[k]=temp;

		}

		for (int l = 0; l < size; l++) {
			System.out.println(arr[l]);
		}
	}

}
