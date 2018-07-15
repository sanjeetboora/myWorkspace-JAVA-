import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no. ");
		int N = scn.nextInt();
		int a = 0;
		int b = 1;
		int i = 1;
		int c = 0;
		int row = 1;
		while (row <= N) {
			int col = 1;
			while (col <= row) {
				System.out.print(a+" ");
				c = a + b;
				a = b;
				b = c;
				
				col = col + 1;
			}
			row = row + 1;
			System.out.println();
		}
		i = i + 1;

	}

}
