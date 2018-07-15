import java.util.Scanner;

public class countmazepathdiagonalRS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		System.out.println(countMazePaths(rows, cols,0,0,new int[rows+1][cols+1]));

	}

	public static int countMazePaths(int endRow, int endCol, int currentRow, int currentCol,int[][]storage) {
		if (currentCol == endCol && currentRow == endRow) {
			return 1;
		}
		if (currentCol > endCol || currentRow > endRow) {
			return 0;
		}

		if (storage[currentRow][currentCol] != 0) {
			return storage[currentRow][currentCol];
		}

		int count = 0;

		count += countMazePaths(endRow, endCol, currentRow + 1, currentCol,storage);
		count += countMazePaths(endRow, endCol, currentRow, currentCol + 1,storage);
		count += countMazePaths(endRow, endCol, currentRow+1, currentCol + 1,storage);

		storage[currentRow][currentCol] = count;
		return count;
	}
}