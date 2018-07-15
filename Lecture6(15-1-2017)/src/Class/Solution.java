package Class;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);	
		
		int[] arr = takeinput();
		int N = scn.nextInt();
		System.out.println(linearsearch(arr,N));

	}
	public static int linearsearch(int[] arr, int data) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
		int[] rv = null;
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i <rv.length; i++) {
						rv[i] = scn.nextInt();
		}
		return rv;
	}


}
