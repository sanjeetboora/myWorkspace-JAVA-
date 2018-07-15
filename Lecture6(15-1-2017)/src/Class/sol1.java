package Class;

import java.util.Scanner;

public class sol1 {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
		insertionsort(arr);
	}
	public static void insertionsort(int[] arr){
		int counter=1;
		while(counter<=arr.length-1){
			for(int i=counter;i>0;i--){
				if(arr[i-1]>arr[i]){
					swap.swap(arr,i-1,i);
				}else{
					break;
				}
			}counter++;
			
		}display(arr);

	}
	
	public static int[] takeInput() {
		int[] rv = null;
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}
	public static void display(int[] arr) {
		for (int val : arr) {
			
			System.out.println(val );
		}
		
	}


}
