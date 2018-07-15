package Class;

import java.util.Scanner;

public class ifpalindrome {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeinput();
		System.out.println(ifarrayispalindrome(arr,0));
	}
	public static int[] takeinput() {
		Scanner scn = new Scanner(System.in);
		int[] rv = null;
		System.out.println("enter size of array");
		int size = scn.nextInt();
		rv = new int[size];
		for (int i = 0; i < rv.length; i++) {
			System.out.println("enter " + i + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}
	public static boolean ifarrayispalindrome(int[] arr,int si) {
		boolean val=true;
		 if (si == arr.length){
			return val ;
		}
		if (arr[si] == arr[arr.length-si-1])
			val = ifarrayispalindrome(arr, si + 1);
		else{
			val = false;
		}

		return val;
	}
	

}
