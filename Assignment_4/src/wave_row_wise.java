import java.util.Scanner;

public class wave_row_wise {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takerectinput();
		display(arr);
		waverowwise(arr);
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

	public static void waverowwise(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {

					System.out.print(arr[row][col] + "\t");
				}
			}
			else {
				for (int col = arr[row].length-1; col >= 0; col--) {

					System.out.print(arr[row][col] + "\t");
				}
			}
		}
	}
}
