package Arrays;

import java.util.Scanner;

public class maxSumIncSubsequence {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scn.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(maxSumsubsequence(arr,N));
	}
	public static int maxSumsubsequence(int arr[],int N) {
		int sumarr[]=new int[N];
		for (int i = 0; i < sumarr.length; i++) {
			sumarr[i]=arr[i];
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <i; j++) {
				if(arr[j]<arr[i] && sumarr[i]<sumarr[j]+arr[i] ) {
					sumarr[i]=sumarr[j]+arr[i];
				}
			}
		}
		int max=sumarr[0];
		for (int i = 0; i < sumarr.length; i++) {
			if(sumarr[i]>max) {
				max=sumarr[i];
			}
		}
		return max;
	}
}
