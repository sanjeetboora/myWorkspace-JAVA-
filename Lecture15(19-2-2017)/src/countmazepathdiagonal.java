import java.util.Scanner;

public class countmazepathdiagonal {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		System.out.println(countMazePaths(rows, cols,0,0));

	}

	public static int countMazePaths(int endRow, int endCol, int currentRow, int currentCol) {
		if (currentCol == endCol && currentRow == endRow) {
			return 1;
		}
		if (currentCol > endCol || currentRow > endRow) {
			return 0;
		}

		int count = 0;

		count += countMazePaths(endRow, endCol, currentRow + 1, currentCol);
		count += countMazePaths(endRow, endCol, currentRow, currentCol + 1);
		count += countMazePaths(endRow, endCol, currentRow+1, currentCol + 1);

		return count;
	}
}