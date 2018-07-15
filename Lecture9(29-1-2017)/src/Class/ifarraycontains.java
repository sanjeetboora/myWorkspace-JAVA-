package Class;

import java.util.Scanner;

public class ifarraycontains {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr =  takeinput();
		int data = scn.nextInt();
		System.out.println(contains(arr,data,0));
	}public static boolean contains(int[]arr,int data,int si){
		if(si==arr.length){
			return false;
		}
		if(arr[si]==data){
			return true;
		}
		boolean iscontainedinSA=contains(arr,data,si+1);
		return iscontainedinSA;
	}
	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
		int[] rv = null;
		
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			
			rv[i] = scn.nextInt();
		}
		return rv;
	}

}
