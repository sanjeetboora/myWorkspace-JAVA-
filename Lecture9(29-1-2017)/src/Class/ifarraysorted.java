package Class;

import java.util.Scanner;

public class ifarraysorted {

		// TODO Auto-generated method stub
		public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int[] arr =  {0,1,1,5};
			System.out.println(sortedarray(arr,0));
		}public static boolean sortedarray(int[]arr,int si){
			if(arr.length==0){
				return true;
			}
			if(si==arr.length-1){
				return true;
			}
			boolean iscontainedinSA=sortedarray(arr,si+1);
			if(arr[si]>arr[si+1]){
				return false;
			}
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
