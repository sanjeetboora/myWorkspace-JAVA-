import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int col = 0, row = 1, a = N / 2 + 1, c = N - a+1;
		row = 1;
		while (row <= a) {
			col = a-row+1;
			while (col != 0) {
				System.out.print("*\t");
				col = col - 1;
			}
			col = 1;
			int p = 2 * row - 1;
			while (col <= p) {
				System.out.print("\t");
				col=col+1;
			}

			col = a-row+1;
			while (col != 0) {
				System.out.print("*\t");
				col = col - 1;

			}
			System.out.println();
			row=row+1;

		}
		row=2;
		while(row<=c){
			col=1;
			while(col<=row){
				System.out.print("*\t");
				col=col+1;
			}
			col=1;
			int k = 2*(c-row) +1;
			col=k;
			while(col!=0){
				System.out.print("\t");
				col=col-1;
			}
			col=1;
			while(col<=row){
				System.out.print("*\t");
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}
		
		

	}
}
