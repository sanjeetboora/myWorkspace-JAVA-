package Arrays;

import java.util.Scanner;

public class givenDIffPair {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int diff = scn.nextInt();
		int result[] = new int[2];
		diffpair(arr, result, diff);
		
	}

	public static boolean diffpair(int arr[], int result[], int diff) {
		int i = 0, j = 1, sum = 0;
		while(i<arr.length && j<arr.length) {
			if(i!=j && arr[j]-arr[i]==diff) {
				result[0]=arr[i];
				result[1]=arr[j];
				System.out.println(result[0] + "  " + result[1]);
				return true;
			}
			else if((arr[j]-arr[i])>=0 &&(arr[j]-arr[i])<diff) {
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println("no pair exist");
		return false;
	}
}
