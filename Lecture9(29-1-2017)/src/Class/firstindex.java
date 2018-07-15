package Class;

import java.util.Scanner;

public class firstindex {
		public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int[] arr = takeinput();
			int data = scn.nextInt();
			System.out.println(fi(arr,data,0));
		}public static int fi(int[]arr,int data,int si){
			if(si==arr.length){
				return -1;
			}
			if(arr[si]==data){
				return si;
			}
			int firstindex=fi(arr,data,si+1);
			return firstindex;
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


	}
