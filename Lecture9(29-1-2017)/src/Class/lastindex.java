package Class;

import java.util.Scanner;

public class lastindex {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput() ;
		int data = scn.nextInt();
		System.out.println(li(arr,data,0));
	}
	public static int li(int[]arr,int data,int si){
		if(si==arr.length){
			return -1;
		}
		int foundatinSA=li(arr,data,si+1);
		if(foundatinSA!=-1){
			return foundatinSA;
		}
		else{
			if(arr[si]==data){
				return si;
			}
			else{
				return -1;
			}
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
