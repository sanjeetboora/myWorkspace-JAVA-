package Class;

import java.util.Scanner;

public class bubblesort {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=takeinput();
		int bi=0;
		int ei=arr.length-1;
		 bubble_sort(arr,bi,ei);
		 display(arr);
	}
	public static void bubble_sort(int[]arr,int bi,int ei){
		if(arr.length==0){
			return;
		}
		if (ei==0){
			return;
		}
		if (bi==ei){
			
			bubble_sort(arr,0,ei-1);
			return;
		}
		if (arr[bi]>arr[bi+1]){
			int temp = arr[bi];
			arr[bi] = arr[bi+1];
			arr[bi+1] = temp;
		
		}
		bubble_sort(arr,bi+1,ei);
	}
	public static void display(int[] arr) {
		for (int val : arr) {
			
			System.out.print(val + " ");
		}
		
	}
	public static int[] takeinput() {
		int[] rv = null;
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}

}
