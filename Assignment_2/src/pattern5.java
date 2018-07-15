import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int row = 1, a = N / 2 + 1, c = N - a;
		while (row <= a) {
			int col = a-row;
			while (col != 0) {
				System.out.print("  ");
				col = col - 1;
			}
			col = 1;
			int b = 2 * row - 1;
			while (col <= b) {
				System.out.print("* ");
				col = col + 1;
			}
			System.out.println();
			row=row+1;
		}
		row=1;
		while(row<=c){
			int col = 1;
			while (col <= row) {
				System.out.print("  ");
				col = col + 1;
			}
			col=1;
			col=2*(c-row)+1;
			while(col!=0){
				System.out.print("* ");
				col=col-1;
			}
			System.out.println();
			row=row+1;
		}
		
			
		}
		

	}

