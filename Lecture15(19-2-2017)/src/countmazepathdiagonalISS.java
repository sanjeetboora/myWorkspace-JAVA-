import java.util.Scanner;

public class countmazepathdiagonalISS {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		System.out.println(countMazePaths(rows, cols));
	}

	public static int countMazePaths(int endrow, int endcol) {
		int[] storage = new int[endcol + 2];
		for (int i = 0; i < storage.length; i++) {
			storage[i] = 1;
		}
		int diag = endcol + 1;
		for (int row = endrow - 1; row >= 0; row--) {
			for (int col = endcol; col >= 0; col--) {
				if (col == endcol) {
					storage[endcol] = 1;
					storage[diag] = 1;
				} 
				else {
					int temp = storage[col] + storage[col + 1] + storage[diag];
					storage[diag] = storage[col];
					storage[col] = temp;
				}
			}
		}   
		return storage[0];
	}

}
