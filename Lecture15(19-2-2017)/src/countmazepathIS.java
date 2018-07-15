import java.util.Scanner;

public class countmazepathIS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		System.out.println(countMazePaths(rows, cols));
	}

	public static int countMazePaths(int endrow, int endcol) {
		int[][] storage = new int[endrow + 1][endcol + 1];

		storage[endrow][endcol] = 1;
		for (int row = endrow; row >= 0; row--) {
			for (int col = endcol; col >= 0; col--) {
				// int nxtrow = row + 1;
				// int nxtcol = col + 1;
				//
				// if (nxtrow <= endrow) {
				// storage[row][col] += storage[nxtrow][col];
				// }
				//
				// if (nxtcol <= endcol) {
				// storage[row][col] += storage[row][nxtcol];
				// }
				if (row == endrow || col == endcol) {
					storage[row][col] = 1;
				} else {
					storage[row][col] = storage[row + 1][col] + storage[row][col + 1];
				}
			}
		}

		return storage[0][0];
	}

}
