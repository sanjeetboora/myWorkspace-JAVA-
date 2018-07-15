import java.util.*;

public class abcd {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	
		int[] arr = takeInput();
		subsets(arr);
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
	public static void subsets(int[] arr){
		int j=0;
		for(int k=0; k <arr.length;k++ ){
		for(int i=k; i <arr.length;i++ ){
			System.out.print("[");
			for(j=k; j<=i;j++ ){
				
				System.out.print(arr[j]);
				if(j!=i){
				System.out.print(", ");
				}

			}System.out.print("]");
			System.out.println();	
			}
		}
		
	}
}

	