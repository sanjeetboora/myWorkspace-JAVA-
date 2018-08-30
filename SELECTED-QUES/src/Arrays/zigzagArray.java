package Arrays;

import java.util.Scanner;

public class zigzagArray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scn.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
		}
		zigzagArr(arr,N);
		for(int i=0;i<N;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void zigzagArr(int arr[],int N){
		boolean flag=true;
		for(int i=0;i<N-1;i++) {
			if(arr[i]>arr[i+1] && flag==true) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			else if(arr[i]<arr[i+1] && flag==false) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
			flag=!flag;
		}
	}
}
