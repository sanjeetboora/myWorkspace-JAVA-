import java.util.Scanner;

public class spiral_anticlockwise {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takerectinput();
		display(arr);
		spiral_anticlockwise(arr);
	}

	public static int[][] takerectinput() {
		int[][] rv = null;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no. of rows");
		int rows = scn.nextInt();
		System.out.println("enter no. of cols");
		int cols = scn.nextInt();
		rv = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("enter element for " + i + "th row " + j + "th col");
				rv[i][j] = scn.nextInt();
			}
		}

		return rv;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}

			System.out.println();
		}
	}

	public static void spiral_anticlockwise(int[][] arr) {
		int i = 1, j = arr.length * arr[0].length, maxrow = arr.length - 1, maxcol = arr[0].length - 1, minrow = 0,
				mincol = 0;
		while (i <= j) {
			for (int row = minrow; i <= j && row <= maxrow; row++) {
				System.out.print(arr[row][mincol] + "\t");
				i++;
			}
			mincol++;
			for (int col = mincol; i <= j && col <= maxcol; col++) {
				System.out.print(arr[maxrow][col] + "\t");
				i++;
			}
			maxrow--;
			for (int row = maxrow; i <= j && row >= minrow; row--) {
				System.out.print(arr[row][maxcol] + "\t");
				i++;
			}
			maxcol--;
			for (int col = maxcol; i <= j && col >= mincol; col--) {
				System.out.print(arr[minrow][col] + "\t");
				i++;
			}
			minrow++;
		}
	}

}
