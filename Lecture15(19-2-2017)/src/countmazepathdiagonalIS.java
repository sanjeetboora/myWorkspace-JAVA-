import java.util.Scanner;

public class countmazepathdiagonalIS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		System.out.println(countMazePaths(rows, cols, 0, 0));

	}

	public static int countMazePaths(int endRow, int endCol, int currentRow, int currentCol) {
		int[][] storage = new int[endRow + 1][endCol + 1];
		storage[endRow][endCol] = 1;
		for (int row = endRow; row >= 0; row--) {
			for (int col = endCol; col >= 0; col--) {
				if (row == endRow || col == endCol) {
					storage[row][col] = 1;
					
				} else {
					storage[row][col] = storage[row + 1][col] + storage[row][col + 1]+storage[row+1][col + 1];
				}
			}
		}

		return storage[0][0];
	}
}