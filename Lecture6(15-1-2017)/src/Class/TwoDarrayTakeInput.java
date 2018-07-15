package Class;

import java.util.Scanner;

public class TwoDarrayTakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display(takerectinput());

	}
	public static int[][] takerectinput() {
		int[][]rv=null;
		Scanner scn= new Scanner(System.in);
		System.out.println("enter no. of rows");
		int rows = scn.nextInt();
		System.out.println("enter no. of cols");
		int cols = scn.nextInt();
		rv=new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++){
				System.out.println("enter element for " + i+"th row "+j+"th col");
				 rv[i][j] = scn.nextInt();
			}
		}	
		
		return rv;
	}
	public static void display(int[][] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length ;j++){
			
			System.out.print(arr[i][j]+ "\t");
		}
		System.out.println();
	}
}
	
}
