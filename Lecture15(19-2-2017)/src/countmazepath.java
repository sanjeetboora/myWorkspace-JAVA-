import java.util.Scanner;

public class countmazepath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(countMazePaths( 10, 10,0,0));

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

		return count;
	}
}